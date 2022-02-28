import java.util.Currency
import kotlin.test.currentStackTrace

fun main(){
var n = getFullNames("tanya", "pay")
    println(n)
    var x =addition(4 , 5 ,7)
    println(x)
    var p=multiply(5,5,3)
    println(p)
    year()
    var y =age(2022 ,2000)
    println(y)
}
fun getFullNames(FirstName:String , LastName:String):String{
    var names = FirstName + " " +LastName
    return names

}
fun addition(num1: Int, num2: Int, num3: Int): Int{
    var sum = num1+num2+num3
    return sum
}
fun multiply(num1: Int, num2: Int, num3: Int):Int{
    var product = num1 + num2 + num3
    return product
}
fun year(){

    val x= "i am"
    var y = 21
    val z= "years old"
    println(x+" "+y+" "+z)
}

fun age(current:Int ,birth:Int ):Int{
    var z=(current-birth)
    return z

}
















