// Unit is just like void return type


object FunctionDemo{
    // def sayHello(){
    //     println("hello world!")
    // }

    def sayHello():Unit={
        println("hello world!")
    }
    def sum(a:Int, b:Int):Unit={
        println(a+b)
    }
    def sumNo(a:Int,b:Int):Int={
        return a+b
    }
    def evenCheck(a:Int):String={
        if(a%2==0){
            return "Even"
        }
        return "Odd"
    }
    def max(a:Int,b:Int):Int={
        if(a>b){
            return a
        }
        return b
    }
    def main(args:Array[String]):Unit={
        sayHello()
        sum(10, 20)
        println(sumNo(10,20))
        println(evenCheck(11))
        println(max(10,20))
    }
}