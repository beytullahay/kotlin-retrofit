package com.example.kotlinretrofit.service


import com.example.kotlinretrofit.model.CryptoModel
import io.reactivex.Observable
import retrofit2.http.GET

interface CryptoAPI {


    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")

      fun getData(): Observable<List<CryptoModel>>
//    fun getData(): Call<List<CryptoModel>>  // call kullanıyorduk şimdi observable kullanacağız
}



// https://raw.githubusercontent.com/
// atilsamancioglu/K21-JSONDataSet/master/crypto.json


// https://raw.githubusercontent.com/atilsamancioglu/
// K21-JSONDataSet/master/crypto.json