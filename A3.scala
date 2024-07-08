object A3{

    def toUpper(str:String):String={
        return str.toUpperCase();
    }

    def toLower(str:String):String={
        return str.toLowerCase();
    }

    def FirstTwo(str:String):String = {
        val firstTwo = str.substring(0, 2).toUpperCase
        val rest = str.substring(2)
        firstTwo + rest
    }

    def last(str:String):String = {
        val lastChar = str.last.toUpper
        val initialPart = str.dropRight(1)
        initialPart + lastChar
    }

    def formatNames(f:(s:String)=>String , str:String ):String={
        var name = f(str);
        return name;
    }

    def main(args: Array[String]):Unit={
        println(formatNames(toUpper,"Benny"));
        println(formatNames(FirstTwo,"Niroshan"));
        println(formatNames(toLower,"Saman"));
        println(formatNames(last,"Kumara"));
    }
}