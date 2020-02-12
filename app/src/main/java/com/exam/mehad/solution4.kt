package com.exam.mehad

const val MAX_PAIR_LIMIT = 1000000000
const val EAST = 0
const val WEST = 1
const val ERROR_MORE_THAN_LIMIT_PAIRS = -1


fun solution4(a: MutableList<Int>): Int {
    var pairCount = 0
    a.forEachIndexed { index, carWay ->
        if(carWay== EAST){
            a.forEachIndexed { indexi, carWayi ->
                if(indexi>index && carWay!=carWayi){
                    if(pairCount<= MAX_PAIR_LIMIT)
                        pairCount++
                    else
                        return ERROR_MORE_THAN_LIMIT_PAIRS
                }
            }
        }
    }
    print("number of paired cars is : $pairCount")
    return pairCount
}

fun getInputOfQuestion4(): MutableList<Int> {
    val n = (1..100000).random()
    var i = 0
    val a = mutableListOf<Int>()
    while (i < n) {
        a.add((0..1).random())
        i++
    }
    print("A list: $a \n")
    return a
}

fun getMock4():MutableList<Int>{
    val a = mutableListOf<Int>()
    a.add(0)
    a.add(1)
    a.add(0)
    a.add(1)
    a.add(1)
    return a
}