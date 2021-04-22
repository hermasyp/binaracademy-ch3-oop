package shape

class Rectangle(val length: Int, val width: Int) : Shape() {
    init {
        shapeName = "Persegi Panjang"
    }
    override fun calculateArea(): Float {
        return (length * width).toFloat()
    }

    override fun calculateCircular(): Float {
        return (2 * (length * width)).toFloat()
    }
}