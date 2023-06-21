package com.cheezycode.unittestingdemo.utils

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class ParameterizeExample(private val input: String, private val expected: Boolean) {

    lateinit var utils: Utils

    @Before
    fun setUp() {
        // Arrange
        utils = Utils()
        println("Setup")
    }


    @After
    fun tearDown() {
        println("Tearing it down")
    }

    @Test
    fun testLogic() {
        // Act
        val result = utils.isPallindrome(input)
        // Assert
        assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        @Parameterized.Parameters(name = "{index}: {0} is pallidrome - {1}")
        fun dataSource(): List<Array<Any>> {
            return listOf(
                arrayOf("hello", false),
                arrayOf("level", true),
                arrayOf("a", true),
                arrayOf("", true)
            )
        }
    }

}