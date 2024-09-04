class Person {
    var name: String
    var age: Int

    // Primary Constructor
    constructor(x: String, y: Int) {
        this.name = x
        this.age = y
    }

    // Secondary Constructor
    constructor(x: String) {
        this.name = x
        this.age = 0
    }

    // Default Constructor
    constructor() {
        this.name = "Rahul"
        this.age = 32
    }

    // Member function
    fun intro() {
        println("My name is $name and age is $age")
    }
}

fun main() {
    var a = Person("Riya", 32)
    a.intro()

    var b = Person()
    b.intro()

    var c = Person("Heena")
    c.intro()
}
