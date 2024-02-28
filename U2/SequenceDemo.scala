object SequenceDemo{
    def main(args:Array[String]):Unit={
        val seqCol=Seq(2,4,6,8,10);
        val res=seqCol.apply(1);

        println(res);

        val setCol=Set("apple","orange","grapes","banana");
        val res1=setCol.apply("orange");

        println(res1);

        val mapCol=Map(("a",97),("b",98),("c",99),("d",100));
        val res3=mapCol.apply("a");

        println(res);

        seqCol.foreach(println);
    }
}