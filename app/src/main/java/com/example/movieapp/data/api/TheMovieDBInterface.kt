package com.example.movieapp.data.api

import com.example.movieapp.data.vo.MovieResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query


interface TheMovieDBInterface {

    @GET("movie/popular")
    fun getPopularMovie(@Query("page")page:Int): Single<MovieResponse>


}