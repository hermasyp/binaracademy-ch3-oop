package shape

abstract class Shape {
    private val note = "This is a Shape Class"
    var shapeName : String? = null
    abstract fun calculateArea(): Float
    abstract fun calculateCircular(): Float
}