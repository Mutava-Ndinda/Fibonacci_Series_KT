package com.akirachix.fibonacciseries

class FibonacciRecyclerViewAdapter {
    fun generatefibonacci(count:Int):List<Int>{
        val fibonacciNumber= mutableListOf<Int>()
        if(count>0)fibonacciNumber.add(0)
        if(count>1)fibonacciNumber.add(1)
        for (i in 2 until count){
            val nextNumber= fibonacciNumber[i-1] +fibonacciNumber[i-2]
        }
    }
}