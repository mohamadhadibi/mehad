package com.exam.mehad

fun solution1(n: Int): Int? {
    val binary = Integer.toBinaryString(n)
    val gapLength = mutableListOf<Int>()
    gapLength.add(0)
    print("number: $n \n binary: $binary \n")

    var count= 0
    var isStart = false
    var currentIndex: Char = ' '
    var lastIndex:Char = ' '

    repeat(binary.length) { index ->
        lastIndex = currentIndex
        currentIndex = binary[index]
        if(isStart){
            when{
                (currentIndex=='1' && lastIndex=='0')->{
                    gapLength.add(count)
                    count=0
                }
                (currentIndex=='0')->{
                    count++
                }
            }
        }else{
            if(currentIndex=='0' && lastIndex=='1'){
                isStart = true
                count++
            }
        }
    }
    print("the biggest gap size is : ${gapLength.maxBy { it }}")

    return gapLength.maxBy { it }
}

fun getInputOfQuestion1():Int{
    return (0..2147483647).random()
}