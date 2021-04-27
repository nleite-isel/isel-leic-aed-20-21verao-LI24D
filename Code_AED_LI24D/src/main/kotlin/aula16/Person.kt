package aula16

//data class Person constructor(val name: String)  // constructor keyword is optional

// COMMENT / UNCOMMENT
//data class Person1 constructor(val name: String) { // constructor keyword is optional
/*data*/ class Person1 constructor(val name: String) { // Primary constructor; parameters will generate fields/properties

//    val personName: String // This field is not needed because primary constructor already defines a "name" field
//    val age: Int // Error, age must be var because is rewritten in the secondary constructor

    var personName: String // This field is not needed because primary constructor already defines a "name" field
    var age: Int

    init { // Initializer
        println("Initializer")
        personName = name
        age = -1 // age should be passed in the primary constructor
    }

    // Secondary constructor
//    constructor(age: Int) { // Error, you must call primary constructor
    constructor(age: Int, personName: String) : this(personName) {
        // We need to add an "age" field and copy the constructor parameter to it
        this.age = age
//        this.personName = personName
    }

}


fun main() {
    // Using data class without methods and fields
//    val person = Person("Luis") // calls Primary constructor
//    println(person)
//    println(person.name)

//    val person1 = Person1("Luis") // calls Primary constructor
    val person1 = Person1(39, "Luis") // calls Secondary constructor

    println(person1)
    println(person1.name)
    println(person1.personName)
    println(person1.age)
}

/*
with data class:
Person(name=Luis)

with class:
aula16.Person@548c4f57

Prints: package name . class name @ object id or hash code

 */







