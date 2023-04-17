package com.example.androidmaster.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("api/6601056796572695/search/{name}")
    suspend fun getSuperheroes(@Path("name") superheroName:String):Response<SuperHeroDataResponse>

    @GET("api/6601056796572695/{id}")
    suspend fun getSuperheroDetail(@Path("id") superheroId:String):Response<SuperheroDetailResponse>
}