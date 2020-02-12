package com.exam.mehad

fun solution3(a: MutableList<Int>): Int {

    var unPaired: Int = -1
    val pairedIndexes = mutableListOf<Int>()

    a.forEachIndexed queue@{ index, element ->
        if (!pairedIndexes.contains(index)) {
            a.forEachIndexed { indexi, elementi ->
                if (
                    index != indexi &&
                    element == elementi &&
                    !pairedIndexes.contains(indexi)
                ) {
                    pairedIndexes.add(index)
                    pairedIndexes.add(indexi)
                    //print("match: $index with $indexi \n")
                    return@queue
                }
            }
        }else{
            return@queue
        }
        unPaired = element
        print("unpaired value is : $element \n")
        return unPaired
    }
    return unPaired
}


fun getInputOfQuestion3(): MutableList<Int> {
    var n = (1..1000000).random()
    if ((n % 2) == 0) n--

    var i = 0
    val a = mutableListOf<Int>()
    while (i < n) {
        val random = (1..1000000000).random()
        if(n-i == 1){
            a.add(random)
            i++
        }else{
            a.add(random)
            a.add(random)
            i+=2
        }
    }
    return a
}

fun getMock3():MutableList<Int>{
    val a = mutableListOf<Int>()
    a.add(3)
    a.add(8)
    a.add(3)
    a.add(3)
    a.add(3)
    a.add(9)
    a.add(3)
    a.add(3)
    a.add(9)
    print("A list: $a \n")
    return a
}