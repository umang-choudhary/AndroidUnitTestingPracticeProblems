package com.cheezycode.unittestingdemo.utils

import org.junit.Assert.*
import org.junit.Test
import java.lang.IllegalArgumentException

class StringTest {

    @Test
    fun testStringReversal_EmptyString_expectedEmptyString(){
        val sut = Utils()
        val result = sut.reverseString("")
        assertEquals("", result)
    }

    @Test
    fun testStringReversal_SingleChar_expectedSingleChar(){
        val sut = Utils()
        val result = sut.reverseString("a")
        assertEquals("a", result)
    }

    @Test
    fun testStringReversal_ValidInput_expectedSameString(){
        val sut = Utils()
        val result = sut.reverseString("CheezyCode")
        assertEquals("edoCyzeehC", result)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testStringReversal_NullValue_expectedException(){
        val sut = Utils()
        val result = sut.reverseString(null)
    }
}













