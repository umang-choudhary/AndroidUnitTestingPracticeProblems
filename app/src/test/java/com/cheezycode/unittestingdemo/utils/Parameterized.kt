package com.cheezycode.unittestingdemo.utils

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class ParameterizeExample (val input: String, val expected: Boolean) {

    @Test
    fun testPallindrome(){
        val utils = Utils()
        val result = utils.isPallindrome(input)
        assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        @Parameterized.Parameters(name = "{index}: {0} is pallidrome - {1}")
        fun data(): List<Array<Any>>{
            return listOf(
                arrayOf("hello", false ),
                arrayOf("level", true ),
                arrayOf("a", true ),
                arrayOf("", true)
            )
        }
    }

}