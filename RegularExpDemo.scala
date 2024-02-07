import scala.util.matching.Regex
object RegularExpDemo{
    /* 
    *     * ->0 or any number of characters
    *     + -> 1 or any number
     */
    def main(args: Array[String]): Unit = {
        //ab*c -> ac,abc,abbc,abbbc..
        //ab+c ->abc, abbc ...
        //ab{2}c -> abbc .. (exactly two a's)
        //ab{2,5}c-> b can be become between 2 - 5 times
        //[abc] ->a ,b ,c
        //[abc]+->  at least one character among the three.
        //[a-zA-Z]->  all alphabets (both lower and upper case)

        //create regular expression
        val a="ab*c".r;
        println(a)

        val f="My".r;
        val s="Hi My name is Shivam verma";

        val s1=s.replaceFirst("My","Your");
        val s2=f.findAllIn(s);

        println(s1);
        s2.foreach(println)

        val n1="12 67 93457 48 51";
        val n2="[1-5]{2}+".r;

        val n3=n2.findAllIn(n1);
        n3.foreach(println)
    }
}