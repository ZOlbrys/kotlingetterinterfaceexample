package com.example.kotlingetterinterfaceexample

import com.google.gson.Gson
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test

class ExampleGsonParseTests {
    @Test
    fun testParseObject() {
        val json = "{ \"name\" : \"test\" }"

        val result = Gson().fromJson(json, ExampleKotlinImplSubclass::class.java)

        assertNotNull(result)

        assertEquals("test", result.name)

        result.name = "zach"
    }
}