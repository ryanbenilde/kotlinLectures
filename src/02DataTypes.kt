fun main() {
    //Byte
    val byteVal: Byte = 100
    println("Byte value: $byteVal") // Byte value: 100

    //Short
    val shortVal: Short = 10000
    println("Short value: $shortVal") //Short Value: 10000

    //Int
    val intVal: Int = 100000
    println("Int value: $intVal") //Int value: 100000

    //Long
    val longVal: Long = 100000000L
    println("Long value: $longVal") //Long Value: 100000000

    //Float
    val floatVal: Float = 3.1415f
    println("Float value: $floatVal")

    //Double
    val doubleVal: Double = 3.1415926548912347
    println("Double value: $doubleVal")

    //Character and String
    //Char
    val charVal: Char = 'a'
    println("Char value: $charVal") //Char value: a

    //String
    val stringVal: String = "Hello World"
    println("String value: $stringVal")

    //Boolean
    val isKotlinFun: Boolean = true
    println("Is Kotlin fun? $isKotlinFun")

    //Nullable
    var nullableInt: Int? = null
    println("Nullable Int value: $nullableInt")

    //Array
    val numbers: Array<Int> = arrayOf(1, 2, 3)
    println("Array values: ${numbers.joinToString()}") //Array values: 1, 2, 3

    //Collections
    //List
    val list = listOf(1, 2, 3)
    println("List value: $list") // List value: [1, 2, 3]

    //Mutable List
    val mutableList = mutableListOf(1, 2, 3)
    mutableList.add(4)
    println("Mutable list value: $mutableList") // Mutable List value: [1,2,3,4]

    //Set
    val set = setOf(1, 2, 2, 3)
    println("Set value: $set") //set value: [1,2,3]

    //Map
    val map = mapOf("A" to 1, "B" to 2, "C" to 3)
//    println("Map value: $map") // Map value: {A=1, B=2, C=3
}