/*
Action methods

1. count
2. collect
3. take
4. top
5. countbyvalue
6. reduce
*/
object Action{
    def main(args: Array[String]): Unit = {

        // 1. count
        val r1=sc.textFile("/Users/shivamverma/Documents/Scala/U3/rdd.txt") 
        val v1=r1.flatMap(_.split(" ")).count()
        println(v1)

        // 2. collect
        val r2=sc.parallelize(List(1,2,3,4))
        val c1=r2.collect() 
        c1.foreach(println)

        // 3. take   like limit
        val r3=sc.textFile("/Users/shivamverma/Documents/Scala/U3/rdd.txt")  
        val t1=r3.take(5)
        t1.foreach(println)
        
        // 4. top  //highest 1 values
        val r4=sc.makeRDD(List(("Shiva",89), ("Akash",70), ("Vivek",92)))
        val t2=r4.top(1) 
        println(t2)  //  Array((Vivek,92))
        println(t2(0)._2)

        // 5. countByValue
        val v1=r1.flatMap(_.split(" ")).countByValue()
        v1.foreach(println)

        //6. reduce
        val  r5=sc.parallelize(List(1,2,3,4,5))
        val re1=r5.reduce(_+_)
        println(re1)     //sum of all elements in the list
    }
}