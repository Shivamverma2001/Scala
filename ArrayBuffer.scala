import scala.collection.mutable.ArrayBuffer

object ArrayBufferExample {
  def main(args: Array[String]): Unit = {
    var arrayBuff = ArrayBuffer[Int]()
    arrayBuff += 6
    arrayBuff += 15
    arrayBuff += 77
    arrayBuff += 4
    arrayBuff += 15
    arrayBuff += 77
    arrayBuff += 4

    println(s"Array buffer: $arrayBuff");

    //remove
    arrayBuff-=4;
    println(s"Array buffer: $arrayBuff");

    arrayBuff.remove(2);
    println(s"Array buffer: $arrayBuff");

    arrayBuff.clear();
    println(s"Array buffer: $arrayBuff");
  }
}