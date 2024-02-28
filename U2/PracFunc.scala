import scala.io.StdIn.readLine
object PracFunc{
    def check(a:Int):Unit={
        if(a>0){
            println("Positive")
        }else if(a==0){
            println("Zero")
        }else{
            println("Negative")
        }
    }
    def main(args:Array[String])={
        var a=readLine().toInt;
        check(a);
    }
}