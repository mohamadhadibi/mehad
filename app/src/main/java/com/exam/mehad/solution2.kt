package com.exam.mehad

fun solution2(a: MutableList<Int>): Int? {
    val oneIndex = a.indices.maxBy { a[it] }!!
    val oneValue = a[oneIndex]

    val twoIndex = a.indices.filter { it != oneIndex }.maxBy { a[it] }!!
    val twoValue = a[twoIndex]

    val threeIndex = a.indices.filter { it != oneIndex && it != twoIndex }.maxBy { a[it] }!!
    val threeValue = a[threeIndex]

    print(
        "index: $oneIndex - value: $oneValue \n" +
        "index: $twoIndex - value: $twoValue \n" +
        "index: $threeIndex - value: $threeValue \n" +
        "result is : ${oneValue * twoValue * threeValue}"
    )

    // if you need to get P , Q , R index names call function bellow :
    // getProductParamsName(oneIndex, twoIndex, threeIndex)

    return oneValue * twoValue * threeValue
}

fun getInputOfQuestion2(): MutableList<Int> {
    val n = (3..100000).random()
    var i = 0
    val a = mutableListOf<Int>()
    while (i < n) {
        a.add((-1000..1000).random())
        i++
    }

    //print("A list: $a \n")
    return a
}

fun getProductParamsName(indexOne: Int, indexTwo: Int, indexThree: Int) {
    /**
     * since there are conditions on each P , Q , R indexes
     * and if we just don't care about names it dose' t effect the result
     * I write a function to just return the names if there is any need of it
     */

    val R: Int
    val Q: Int
    val P: Int

    if (indexOne > indexTwo && indexOne > indexThree) {
        R = indexOne
        if (indexTwo > indexThree) {
            Q = indexTwo
            P = indexThree
        } else {
            Q = indexThree
            P = indexTwo
        }
    } else if (indexTwo > indexOne && indexTwo > indexThree) {
        R = indexTwo
        if (indexOne > indexThree) {
            Q = indexOne
            P = indexThree
        } else {
            Q = indexThree
            P = indexOne
        }
    } else {
        R = indexThree
        if (indexOne > indexTwo) {
            Q = indexOne
            P = indexTwo
        } else {
            Q = indexTwo
            P = indexOne
        }
    }

    println(
        "R is : $R \n" +
        "Q is : $Q \n" +
        "P is : $P \n"
    )

}