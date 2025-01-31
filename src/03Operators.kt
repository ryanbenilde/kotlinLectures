fun main() {
    var x: Int

    //Arithmetic
    x = 5 + 5
    println(x)

    x = 5 - 5
    println(x)

    x = 95 * 95
    println(x)

    x = 5 / 5
    println(x)

    x = 7 % 5
    println(x) //2

    //exponent
    val power = Math.pow(10.0, 3.0)
    println(power)  //1000

    //increment and decrement
    var y = 1
    println("Initial value of y: $y")

    y++ // increment
    println("After increment (y++): $y")

    y-- // decrement
    println("After increment (y--): $y")

    //Assignment Operators
    var z = 10
    println(z)

    z += 5  // z = z + 5
    println(z)

    z -= 5 // z = z - 5
    println(z)

    z *= 5  // z = z * 5
    println(z)

    z /= 5 // z = z / 5
    println(z)

    z %= 5  // z = z %5
    println(z)

    //comparison operator
    val isEqual = 2 == 2
    println("2 == 2: $isEqual")

    val isNotEqual = 2 != 3
    println("2 != 3: $isNotEqual")

    val isGreaterThan = 10 > 5
    println("10 > 5: $isGreaterThan")

    val isLessThan = 10 < 5
    println("10 < 5: $isLessThan")

    val isGreaterThanOrEqual = 10 > 5
    println("10 >= 5: $isGreaterThanOrEqual")

    val isLessThanOrEqual = 10 < 5
    println("10 < 5: $isLessThanOrEqual")
}