fun main(){
    val person : Person? = Person("Hermas")
    println(person!!.name)
}
//sebuah class yang hanya menyimpan variable
// name bertipe string dan bisa null
data class Person(val name : String?)