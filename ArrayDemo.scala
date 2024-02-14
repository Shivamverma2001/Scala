object  ArrayDemo{
    def main(args:Array[String]):Unit={
        //Mutable Array
        var a1=Array(1,2,3,4,5);
        var a2=new Array[String](3);

        a2(0)="red";
        a2(1)="blue";
        a2(2)="yellow";

        a2.foreach(println);

        //range
        var a3=Array.range(0,10);

        //fill
        var a4=Array.fill(2)("Hello");

        //toArray
        var a5="hello".toArray;

        var a6=a3.filter(_%2==0);
        var a7=a6.map(_*2);
        var a8=a7.reverse;

        a8.foreach(println);
    }
}