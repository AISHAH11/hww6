package com.example.hww6

import android.telecom.Call
import retrofit2.http.*

interface postService {

    @GET("posts")
    fun getAllPosts(): Call<List<postItem>>

    @POST("posts")
    fun addPost(@Body product:Post): Call<postItem>

    @PUT("posts/{id}")
    fun updatePost(@Path("id") id: String, @Body post: Post): Call<Post>

    @DELETE("posts/{id}")
    fun deletePost(@Path("id") id: String): Call<Post>
}