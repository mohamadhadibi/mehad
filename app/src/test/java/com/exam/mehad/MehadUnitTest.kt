package com.exam.mehad

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MehadUnitTest {

    @Test
    fun question1(){
        solution1(getInputOfQuestion1())
    }

    @Test
    fun question2(){
        solution2(getInputOfQuestion2())
    }

    @Test
    fun question3(){
        solution3(getMock3())
    }


    /*I not sure to understand this question well or not
    * it was a bit confusing but I did what I realized and it work during the tests*/
    @Test
    fun question4(){
        solution4(getMock4())
    }

}
