object RDDCreate1{
    def main(args: Array[String]): Unit = {

        //Method 1  but not mostly used because it store the file in only 1 node
       val r1=spark.sparkContext.parallelize(Seq(("A",1),("B",2),("C",3))) 
       r1.foreach(println) 

       //Method 2 using textFile method
       val r2=spark.sparkContext.textFile("/Users/shivamverma/Documents/Spark/U3/rdd.txt") 
       r2.collect()
       r2.foreach(println)

       //Method 3 creation of RDD from existing RDD using flatMap  to read the data word by word
       val r3=r2.flatMap(_.split(" "))
       r3.collect()
       r3.foreach(println)

       //Method 4  :creating RDD from existing RDD using Data Frame
       val data=Seq("Hello Spark","This is cluster computing","Let's learn","Spark")
       val df=data.toDF("data")
       df.show()

       val r5=df.rdd
       r5.collect()
       r5.foreach(println)

       //creating RDD from Array
       val r6=sc.parallelize(Array(1,2,3,4,5,6))
       r6.foreach(println)

       //creating RDD from List
       val r7=sc.parallelize(List(1,2,3,4,5,6))
       r7.foreach(println)
    } 
}