fun main () {
    //String to Int
    var amount: String = "123"
    val number = amount.toInt() //convert string to integer
    println("String to Int: $number (Type: ${number::class.simpleName})") //123 (Type: int)

    //Int to String
    val str = number.toString() //convert integer to string
    println("Int to String: $str (Type: ${str::class.simpleName})")

    //String to Double
    val decimal = "3.14".toDouble() //covert string to double
    println("String to Double: $decimal (Type: ${decimal::class.simpleName})")

    //Int  to boolean (is the number positive)
    val isPositive = number > 0
    println("Int to Boolean: $isPositive (Type: ${isPositive::class.simpleName})")

    //Double to Int
    val doubleValue = 74.99
    val intValue = doubleValue.toInt() //convert double to integer (truncates the decumal part)
    println("Double to Int: $intValue (Type: ${intValue::class.simpleName})")

//string to long
    val longValue = "123456789012345667".toLong() //convert string to long
    println("String to long: $longValue (Type: ${longValue::class.simpleName})")

    //string to float
    val floatValue = "3.1415926548912347".toFloat() //Convert string to float
    println("String to float: $floatValue (Type: ${floatValue::class.simpleName})")



}