object FactorialDemo{
    def fac(x:Int):Int={
        if(x==0 || x==1){
            return 1;
        }
        return x*fac(x-1);
    }
    def main(args: Array[String]): Unit = {
        println(fac(4));
    }
}