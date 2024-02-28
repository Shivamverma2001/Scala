object LazyListDemo{
    def main(args: Array[String]): Unit = {
        val l1=List.range(1,10);
        println(l1);

        val l2=LazyList.range(1,10);
        println(l1);

        val s=Stream.range(1,10);
        println(s);
    }
}