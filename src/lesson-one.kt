fun variables() {
    /**
     * in kotlin, we define variables using either:
     * val -> immutable (read-only)
     * var -> mutable (can change)
     */

    val name = "John Doe"
    var age = 18
    age = 19

    println(name)
    println(age)
}

fun dataTypes() {
    /**
     * Kotlin has a small and well-defined set of built-in data types, which can be grouped into primitive types,
     * string, collections, nullable types, and custom types (like classes)
     */

    /**
     * primitive types:
     * Int, Long, Short, Byte, Double, Float, Boolean, Char
     * In Kotlin, if we perform math operation involving two or more different numeric types,
     * type promotion rules apply.
     */

    // Int: 32-bit signed integer
    val x: Int = 10
    println("Int: $x")

    // Long: 64-bit signed integer
    val y: Long = 10000000000L
    println("Long: $y")

    // Short: 16-bit signed integer
    val s: Short = 100
    println("Short: $s")

    // Byte: 8-bit signed integer
    val b: Byte = 1
    println("Byte: $b")

    // Double: 64-bit floating point
    val pi: Double = 3.14
    println("Double: $pi")

    // Float: 32-bit floating point
    val f: Float = 3.14f
    println("Float: $f")

    // Boolean: true or false
    val isOn: Boolean = true
    println("Boolean: $isOn")

    // Char: Single character
    val letter: Char = 'A'
    println("Char: $letter")

    /**
     * String
     * Immutable text data
     * Interpolatable
     */

    val firstname = "John"
    var lastname = "Chena"
    lastname = "Doe"
    println("$firstname $lastname")
}

fun lessonOne() {
    dataTypes()
}