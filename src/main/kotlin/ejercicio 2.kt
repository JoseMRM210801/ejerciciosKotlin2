fun main() {
    val valores= listOf(3,5,32,6,8,28,53,10,4,100,56,87,43)
    println(si(valores) { a -> mayor(a) })
}


fun mayor(valor:Int): Boolean {
    return valor>=50
}

fun si(valores: List<Int>,par:(Int)->Boolean):List<Pair<Int,Boolean>> {
    val vals: MutableList<Pair<Int, Boolean>> = mutableListOf()
    for (i in valores.indices) {
        if (par(valores[i])){
            vals.add(Pair(valores[i], par(valores[i])))
        }
    }
    return vals
}