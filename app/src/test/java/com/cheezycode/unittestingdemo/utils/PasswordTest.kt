package com.cheezycode.unittestingdemo.utils

import org.junit.Assert.*
import org.junit.Test

class PasswordTest {

    @Test
    fun validatePassword_blankInput_expectedRequiredField(){
        val sut = Utils()
        val result = sut.validatePassword("     ")
        assertEquals("Password is required field", result)
    }

    @Test
    fun validatePassword_2CharInput_expectedValidationMsg(){
        val sut = Utils()
        val result = sut.validatePassword("ab")
        assertEquals("Length of the password should be greater than 6", result)
    }

    @Test
    fun validatePassword_CorrectInput_expectedValidPassword(){
        val sut = Utils()
        val result = sut.validatePassword("Pass123")
        assertEquals("Valid", result)
    }
}