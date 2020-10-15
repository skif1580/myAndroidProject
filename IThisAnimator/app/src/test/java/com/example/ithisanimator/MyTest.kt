package com.example.ithisanimator

import org.junit.Test

class MyTest {
    val open :(src:String)->String= {src -> src+ "karas" }
    val name="karas".count { it=='a'}
    @Test
    fun test() {

    }
    fun res(x:Int,y:Int)=x+y
}
interface Interactions{
    fun interact(list: List<Any>):Int
}
class Halja  :Interactions{
    override fun interact(list: List<Any>) :Int{
        val count=0
        var dd=list.sortedBy { it==Int }
        list.forEach { if (it is Int)
           count+ it
        }
        return count
    }

}