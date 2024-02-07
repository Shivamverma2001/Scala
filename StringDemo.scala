object StringDemo{
    def main(args:Array[String]):Unit={
        // 2 ways to define string
        val firstName= "Shivam"               //type interference
        val secondName:String= "verma"       // without interference

        println(firstName+" "+secondName)


        println(firstName.length())
        println(firstName.concat(secondName))

        //String interpolation
        //ability to create new string or modify it
        //methods are 

        //1) with 's'
        println(s"He is $firstName")
        println(s"3 + 4 = ${3+4}")

        //2) with 'f' use % Formate Specifier
        val pi=3.14159F
        println(f"He is $pi%.2f ")

        //3) with "raw"  dont recognize character literal escape sequence
        println("without Raw:\nfirstName\nsecondName")
        println(raw"with Raw:\nfirstName\nsecondName")

        //String Equality
        val s1="hi"
        val s2="HI"
        val areTheyEqual=s1==s2
        println(areTheyEqual)

        ///Multiline Strings
        val multiLineStr="""
                            This is a multiline string
                            It can have multiple lines
                             """
         println(multiLineStr)

         //split
         var str="hi my name is shivam verma".split(" ");
         str.foreach(println)
    }

}