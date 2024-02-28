object VectorDemo{
    def main(args: Array[String]): Unit = {
        val v1=Vector(1,2,3,4,5);
        val v2=Vector.empty        //initializing empty vector
        val v3=Vector("a","b","c");
        val v4=v3:+"d" //append
        val v5="z"+:v4 //prepend
        println(v5)

        //concatination
        val v6=v5++v4
        println(v6)
    }
}