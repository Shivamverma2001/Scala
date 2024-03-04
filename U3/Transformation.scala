/*
Transformation method

1. map
2. flatMap
3. filter
4. union
5. intersection
6. distinct
7. groupBy
8. reducebyKey
9. sortByKey
10. join
11. coalesce
*/
object Transformation{
    def main(args: Array[String]): Unit = {
        val flat1=sc.textFile("/Users/shivamverma/Documents/Spark/U3/rdd.txt")
        flat1.collect()

        //1 map method it return only 1 element apply on line by line
        val flat2=flat1.map(r=>r.split(" "))
        flat2.collect()  //Array[Array[String]] = Array(Array(Hi, my, name, is, shivam,), Array(How, are, you))

        //2 flatmap method it return list of elements apply on elements
        val flat3=flat1.flatMap(r=>r.split(" "))
        flat3.collect()  //Array[String] = Array(Hi, my, name, is, shivam,, How, are, you)

        //3. filter
        val x=sc.parallelize(1 to 10)
        x.collect()
        val y=x.filter(z=>z%2==0)
        y.collect()

        //4. union
        val r1=sc.parallelize(Array(1,2,3,4))
        val r2=sc.parallelize(Array(4,5,6,7))
        val un=r1.union(r2)                  //not working properly it also  contains the duplicate values
        un.foreach(println)

        //5. intersaction
        val in=r1.intersection(r2)           //it will give common value between two RDD's
        in.foreach(println)

        //6. distinct
        val dis=un.distinct()               //It remove all duplicate from R
        dis.foreach(println)

        //7. groupByKey
        val data=sc.parallelize(Array(('a',1),('b',2),('c',3),('a',5),('b',2)),3) // 3 partitions 
        val group=data.groupByKey()
        group.foreach(println)

        //8. reduceByKey
        val red=data.reduceByKey((x,y)=>x+y)     //It will take key and its corresponding value then It will add those value which have same keys
        red.foreach(println)

        val words=Array("one","two","two","three")
        var re=sc.parallelize(words).map(w=>(w,1)).reduceByKey(_+_)
        re.foreach(println)

        //9. sortByKey
        //it is not working properl
        val sor=data.sortByKey(true)       // true for ascending order and  false for descending order
        sor.foreach(println)

        //10. join
        val jn=r1.join(r2)                //joining of two RDD based on key
        jn.foreach(println)

        val q=sc.parallelize(Array((1,"one"),(2,"two"),(3,"three")))
        val w=sc.parallelize(Array((1,"A"),(2,"B"),(3,"C")))
        val res=q.join(w)    //mapping to get output as per our requirement
        res.foreach(println)

        //11. coalesce
        val cll=y.coalesce(2)             // It used to change number of partition of RDD
        cll.partitions.size                           //It gives no.of partions after coalescing
    }
}