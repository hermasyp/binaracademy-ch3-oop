import utils.CalculateArea
import utils.StarGenerator

fun main(args: Array<String>) {
    println(
        """
        =======================================================
        Aplikasi Penghitung Luas Bidang 2D dan Pencetak Bintang
        =======================================================
        1. Hitung Luas Persegi
        2. Hitung Luas Lingkaran
        3. Hitung Luas Segitiga
        4. Cetak Bintang
        =======================================================
        Masukkan Pilihan Anda (1,2,3,4) ?
        =======================================================
    """.trimIndent()
    )
    val calculateArea = CalculateArea()
    val starGenerator = StarGenerator()
    when (readLine()) {
        "1" -> {
            println("Masukan Panjang Persegi ? ")
            val length = readLine()?.toInt()
            println("Masukan Lebar Persegi ? ")
            val width = readLine()?.toInt() // Mengkonversi String > Integer
            println("Luas Persegi adalah = ")
            if (length != null && width != null) {
                println(calculateArea.calculateAreaRectangle(length, width))
            }
        }
        "2" -> {
            println("Masukan Panjang Jari - Jari Lingkaran ? ")
            val radius = readLine()?.toInt()
            println("Luas Lingkaran adalah = ")
            if (radius != null) {
                println(calculateArea.calculateAreaCircle(radius))
            }
        }
        "3" -> {
            println("Masukan Tinggi Segitiga ? ")
            val height = readLine()?.toInt()
            println("Masukan Alas Segitiga ? ")
            val base = readLine()?.toInt()
            println("Luas Segitiga adalah = ")
            if (height != null && base != null) {
                println(calculateArea.calculateAreaTriangle(base, height))
            }
        }
        "4" -> {
            println("Masukan Jumlah Maksimum Bintang ? (max = 20) ")
            val star = readLine()?.toInt()
            if (star != null) {
                starGenerator.createStars(star)
            }
        }
        else -> {
            println("Pilihan Tidak Ada")
        }
    }
}
