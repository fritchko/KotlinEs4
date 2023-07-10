fun main() {
    val listaNumeri = listOf(1,2,3,4,5)

    listaNumeri.map{it -> it.toString()}.forEach{it -> println("$it")}
}