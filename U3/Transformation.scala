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
    }
}