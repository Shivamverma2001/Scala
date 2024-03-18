import org.apache.spark.sql.functions._
object JoinDemo{
    def main(args: Array[String]): Unit = {
        val emp1=sc.parallelize(Array(
                                    (111,"Saketh","analyst",444,10),
                                    (222,"Shivam","sde",333,20),
                                    (333,"Himanshu","actor",444,5)
                                    )).toDF("EmpNo","EName","Job","Mgr","DeptNo");

        val emp2=sc.parallelize(Array(
                                    (10,"Inventory","Hybd"),
                                    (20,"finance","bglr"),
                                    (30,"HR","Mubbai"),
                                    (40,"Admin","che")
                                    )).toDF("DeptNo","DName","Loc");


        emp1.show()
        emp2.show()

        //inner join   by default
        emp1.join(emp2,"DeptNo").show()
        //or
        emp1.join(emp2,Seq("DeptNo"),"inner").show()

        //left outer join
        emp1.join(emp2,"DeptNo","left_outer").show()
        
        //right outer join
        emp1.join(emp2,"DeptNo","right_outer").show()

        //full outer join
        emp1.join(emp2,"DeptNo","full_outer").show()

        //cross join
        emp1.crossJoin(emp2).show()

        //Practice with sql
        //import org.apache.spark.sql.functions._
        // // Register DataFrames as temporary views
        //emp3.createOrReplaceTempView("emp3")
        //emp4.createOrReplaceTempView("emp4")
        val emp3=sc.parallelize(Array(
                                    (1,"Alice",101,60000),
                                    (2,"Bob",102,55000),
                                    (3,"Charlie",101,70000),
                                    (4,"David",103,80000)
                                    )).toDF("employee_id","name","department_id","salary");
        emp3.createOrReplaceTempView("emp3")

        val emp4=sc.parallelize(Array(
                                    (101,"HR"),
                                    (102,"Finance"),
                                    (103,"Marketing")
                                    )).toDF("department_id","department_name");
        emp4.createOrReplaceTempView("emp4")

        //inner join 
        spark.sql("SELECT emp3.*, emp4.* FROM emp3 INNER JOIN emp4 ON emp3.department_id = emp4.department_id").show()

        //left join 
        spark.sql("SELECT emp3.*, emp4.* FROM emp3 LEFT OUTER JOIN emp4 ON emp3.department_id = emp4.department_id").show()

        //right join 
        spark.sql("SELECT emp3.*, emp4.* FROM emp3 RIGHT OUTER JOIN emp4 ON emp3.department_id = emp4.department_id").show()

        //full outer join
        spark.sql("SELECT emp3.*, emp4.* FROM emp3 FULL OUTER JOIN emp4 ON emp3.department_id = emp4.department_id").show()

        //cross join
        spark.sql("SELECT emp3.*, emp4.* FROM emp3,emp4").show()

    }
}