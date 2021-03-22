package aula04


fun less(x: Int, y: Int): Boolean {
    return x < y
}

fun exch(a: IntArray, i: Int, j: Int) {
    val aux = a[i]
    a[i] = a[j]
    a[j] = aux
}

fun lessExch(a: IntArray, i: Int, j: Int) {
    if (less(a[i], a[j]))
        exch(a, i, j)
}


// Insertion sort
fun insertionSort1(a: IntArray, l: Int, r: Int) {
    for (i in l + 1..r) {
        for (j in i downTo l + 1)
            lessExch(a, j, j - 1)
    }
}

// T.P.C.
// Insertion sort em que em vez de fazer *troca* (lessExch), *move* o valor fora de ordem (que se encontra na janela)
// para a frente. No final insere o valor a ordenar (na posição i) na posição final
// Esta nova versão é O(n) quando o array de entrada está ordenado crescentemente
fun insertionSort2(a: IntArray, l: Int, r: Int) {

}

