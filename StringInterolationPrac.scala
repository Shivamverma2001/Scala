import scala.io.StdIn.readLine

object StringInterolationPrac{
    def main(args:Array[String]):Unit={
        val name = readLine("Enter your Name : ")
        val age:Int = readLine("Enter your age: ").toInt

        if(age>=13 && age<=19){
            println(s"Hi $name you are a teenager")
        }else if(age>=20 && age<=59){
            println(s"Hi $name you are an adult")
        }else{
            println(s"Hi $name you are a senior")
        }
    }
}