fun main() {
  var score: Int? = null
    score = 1
    if (true) {
        score += 1
    }
    println(score)

    val numbers = mutableListOf(1,2,3,4,5)
    numbers.add(6)
    println(numbers)

    //same goes with objects
    data class Person(var name: String, var email: String? = null)

    val person = Person(name = "Alden")
    person.name = "ryan"
    person.email = "razur@oneazur.online"
    println(person)

    var a: Int? = null
    var b: Int
    var c = 10
    var d = 20
    var e = 30

    println(c)
//    println(b) // Error because variable b must be initialized



}