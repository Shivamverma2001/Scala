object ListDemo{
    def main(args: Array[String]): Unit = {
        val fruitList=List("orange","banana","apple","grapes")
        fruitList.foreach(println);

        val intList=List.range(1,10);
        intList.foreach(print)
        println()

        val myList=List.fill(3)("ABC")
        myList.foreach(println)

        val list1="a"::"b"::"c"::"d"::"e"::Nil //a is the head of the list and other elements are the tail of the list
        //Nil is compulsory to add at the end

        //appending -> at last
        val list2=list1:+"p" //Appending element
        list2.foreach(print)
        println()

        //prepending
        val list3="w"::list2
        val list4="m"+:list3
        list4.foreach(print)
        println()

        //list concatination
        val list5=list1:::list2
        list5.foreach(print)
        println()

        //head access
        val getHead=list1.head
        val getTail=list1.tail

        println(s"$getHead $getTail")
    }
}