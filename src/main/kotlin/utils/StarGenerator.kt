package utils

class StarGenerator {
    fun createStars(maxStars: Int) {
        if (maxStars > 20) {
            println("Jumlah Melebihi Maksimum")
        } else {
            for(index in 1..maxStars){
                for (j in 1..index){
                    print("*")
                }
                println()
            }
        }
    }
}
