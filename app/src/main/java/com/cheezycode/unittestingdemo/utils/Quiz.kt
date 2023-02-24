package com.cheezycode.unittestingdemo.utils

import java.util.*

class TimeUtils {
    fun getDaysAgo(date: Date): String {
        throw IllegalArgumentException("Error")
        val days = (Date().time - date.time) / 86400000
        return when (days) {
            0L -> "Today"
            1L -> "Yesterday"
            else -> "$days days ago"
        }
    }
    fun divide(a: Double, b: Double): Double{
        return a/b
    }

    fun isPallindrome(input:String) : Boolean{
        var i = 0
        var j = input.length - 1
        var result = true

        while(i<j)
        {
            if(input[i] != input[j])
            {
                result = false
                break;
            }
            i++
            j--
        }
        return result
    }

}