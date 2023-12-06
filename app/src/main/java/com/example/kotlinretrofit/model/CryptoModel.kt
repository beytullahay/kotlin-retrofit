package com.example.kotlinretrofit.model

import com.google.gson.annotations.SerializedName
import java.util.Currency

// süslü paranteze bile gerek yok sadece constructor lazım data calassda
data class CryptoModel (

//    @SerializedName("currency")
    val currency: String ,
//    @SerializedName("price")
    val price: String)