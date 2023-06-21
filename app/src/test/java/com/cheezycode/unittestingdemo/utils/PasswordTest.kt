package com.cheezycode.unittestingdemo.utils

import org.junit.Assert.assertEquals
import org.junit.Test

class PasswordTest {

    @Test
    fun validatePassword_blankInput_expectedRequiredField() {
        // Arrange
        val sut = Utils()
        // Act
        val result = sut.validatePassword("     ")
        // Assert
        assertEquals("Password is required field", result)
    }

    @Test
    fun validatePassword_2CharInput_expectedValidationMsg() {
        val sut = Utils()
        val result = sut.validatePassword("ab")
        assertEquals("Length of the password should be greater than 6", result)
    }

    @Test
    fun validatePassword_CorrectInput_expectedValidPassword() {
        val sut = Utils()
        val result = sut.validatePassword("Pass123")
        assertEquals("Valid", result)
    }
}