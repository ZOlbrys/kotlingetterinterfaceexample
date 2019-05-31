package com.example.kotlingetterinterfaceexample

import com.google.gson.annotations.SerializedName

abstract class ExampleKotlinImpl(@SerializedName("name") override val name: String = "zach") : ExampleKotlinInterface