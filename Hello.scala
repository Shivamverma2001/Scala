object Hello {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    print(3)

    // immutable variable
    val message:String ="Hello Wrold"
    // message="new message"    --> Reassignment to val message

    // mutable variable
    var m2:String="Hello world"
    m2="hi"
    print(m2)


    //type casting
    var a:Long=98765
    var b:Float=a

    //var c:Long=b  -->show error
  }
}
