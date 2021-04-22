package shape

class Triangle(val base: Int, val height: Int, val hypotenusa: Int) : Shape() {
    init {
        shapeName = "Segitiga"
    }
    override fun calculateArea(): Float {
        return 0.5F * base * height
    }

    override fun calculateCircular(): Float {
        return (base + height + hypotenusa).toFloat()
    }
}