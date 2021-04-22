package utils

class CalculateArea {
    fun calculateAreaRectangle(lengthRect: Int, widthRect: Int): Int {
        return lengthRect * widthRect
    }

    fun calculateAreaCircle(radius: Int): Float {
        return 3.14F * radius * radius
    }

    fun calculateAreaTriangle(triangleBase: Int, triangleHeight: Int): Float {
        return 0.5F * triangleBase * triangleHeight
    }
}