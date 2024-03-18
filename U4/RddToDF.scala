import spark.implicits._
object RddToDF{
    def main(args: Array[String]): Unit = {
        val col=Seq("team","matches") //create data
        val data=Seq(("India",300),("Australia",280),("England",275))
        val rdd=spark.sparkContext.parallelize(data) //create rdd
        
        //Method 1     toDF
        val df=rdd.toDF() //convert rdd to data frame
        df.show() //it show col as _1, _2

        val df1=rdd.toDF("team","matches") 
        df1.show()// show col as team, matches

        val df12=rdd.toDF(col :_*) //use of * for passing
        df12.show()

        //Method 2    createDataFrame
        //val df2=spark.createDataFrame(rdd)  it will not show column name

        val df2=spark.createDataFrame(rdd).toDF(col:_*)
        df2.show()

        //Method 3 using a CSV file
        val df
    }
}