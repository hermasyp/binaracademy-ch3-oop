package shape

class Circle(val radius : Int) : Shape() {
    init {
        shapeName = "Lingkaran"
    }
    override fun calculateArea(): Float {
        return (Math.PI * radius * radius).toFloat()
    }

    override fun calculateCircular(): Float {
        return (Math.PI * (radius * 2)).toFloat()
    }
}