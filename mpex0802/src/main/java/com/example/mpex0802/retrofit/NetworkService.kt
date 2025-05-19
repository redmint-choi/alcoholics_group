package com.example.mpex0802.retrofit

import com.example.mpex0802.model.PageListModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkService {
    @GET("/v2/everything")
    suspend fun getList(
        @Query("q") q: String?,
        @Query("apiKey") apiKey: String?,
        @Query("page") page: Long,
        @Query("pageSize") pageSize: Int
    ): Response<PageListModel>

    @GET("v2/top-headlines")
    suspend fun getTopHeadlines(

        @Query("country") country: String?,
        @Query("title") title:String,
        @Query("apiKey") apiKey: String?,
        @Query("page") page: Long,
        @Query("pageSize") pageSize: Int

    ): Response<PageListModel>


}