package com.cheezycode.unittestingdemo

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.gson.JsonSyntaxException
import org.junit.Assert.*
import org.junit.Test
import java.io.FileNotFoundException

class QuoteManagerTest {

    @Test(expected = FileNotFoundException::class)
    fun testGetQuotesFromAssets_emptyFileName_exceptedException() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val quoteManager = QuoteManager()
        quoteManager.populateQuoteFromAssets(context, "")
    }

    @Test(expected = JsonSyntaxException::class)
    fun testGetQuotesFromAssets() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val quoteManager = QuoteManager()
        quoteManager.populateQuoteFromAssets(context, "malformed.json")
    }

    @Test
    fun testPreviousQuote(){
        val quoteManager = QuoteManager()
        quoteManager.populateQuotes(arrayOf(
            Quote("This is Quote 1", "1"),
            Quote("This is Quote 2", "2"),
            Quote("This is Quote 3", "3")
        ))

        val quote = quoteManager.getPreviousQuote()
        assertEquals("1", quote.author)
    }
}