object Hello{
    def main(args:Array[String]): Unit={
        val x=true;
        val y=false;

        println(x && y);
        println(x || y);
        println(!x);

        var a=5;
        var b=10;

        b -= a;
        println(b);

        println(a&b)


        //inbuilt function
        val string1="Hello World";
        val result=string1.indexOf('W');

        //or
        //string1 indexOf 'W'
        
        println(result);
    }
}