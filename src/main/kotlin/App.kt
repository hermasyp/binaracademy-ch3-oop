import shape.Circle
import shape.Rectangle
import shape.Shape
import shape.Triangle
import utils.StarGenerator

class App {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val app = App()
            app.printHeader()
            readLine()?.let {
                app.selectMenu(it)
            }
        }
    }

    fun printHeader() {
        println(
            """
        =======================================================
        Aplikasi Penghitung Luas Bidang 2D dan Pencetak Bintang
        =======================================================
        1. Hitung Luas dan Keliling Persegi
        2. Hitung Luas dan Keliling Lingkaran
        3. Hitung Luas dan Keliling Segitiga
        4. Cetak Bintang
        =======================================================
        Masukkan Pilihan Anda (1,2,3,4) ?
        =======================================================
    """.trimIndent()
        )
    }

    fun selectMenu(menu: String) {
        when (menu) {
            "1" -> {
                rectangleMenu()
            }
            "2" -> {
                circleMenu()
            }
            "3" -> {
                triangleMenu()
            }
            "4" -> {
                starMenu()
            }
            else -> {
                println("Pilihan Tidak Ada")
            }
        }
    }

    private fun rectangleMenu() {
        println("Masukan Panjang Persegi ? ")
        val length = readLine()?.toInt()
        println("Masukan Lebar Persegi ? ")
        val width = readLine()?.toInt()
        if (length != null && width != null) {
            printShape(Rectangle(length, width))
        }
    }

    private fun circleMenu() {
        println("Masukan Panjang Jari - Jari Lingkaran ? ")
        val radius = readLine()?.toInt()
        if (radius != null) {
            printShape(Circle(radius))
        }
    }

    private fun triangleMenu() {
        println("Masukan Tinggi Segitiga ? ")
        val height = readLine()?.toInt()
        println("Masukan Alas Segitiga ? ")
        val base = readLine()?.toInt()
        println("Masukan Sisi Miring Segitiga ? ")
        val hypotenusa = readLine()?.toInt()
        if (height != null && base != null && hypotenusa != null) {
            printShape(Triangle(base, height, hypotenusa))
        }
    }

    private fun starMenu() {
        println("Masukan Jumlah Maksimum Bintang ? (max = 20) ")
        val star = readLine()?.toInt()
        if (star != null) {
            StarGenerator().createStars(star)
        }
    }

    private fun printShape(shape: Shape) {
        println("Luas ${shape.shapeName} adalah = ")
        println(shape.calculateArea())
        println("Keliling ${shape.shapeName} adalah = ")
        println(shape.calculateCircular())
    }
}