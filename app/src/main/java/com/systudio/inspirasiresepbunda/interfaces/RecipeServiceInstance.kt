package com.systudio.inspirasiresepbunda.interfaces

import com.systudio.inspirasiresepbunda.model.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RecipeServiceInstance {

    @GET("api/recipes")
    fun getRecipes(): Call<RecipesModel>

    @GET("api/category/recipes")
    fun getRecipeCategory(): Call<RecipeCategory>

    @GET("/api/category/recipes/{key}")
    fun getRecipeByCategory(@Path("key")key:String): Call<RecipeByCategory>

    @GET("/api/search")
    fun getSearchRecipe(@Query("q")query: String): Call<SearchRecipeModel>

    @GET("/api/recipe/{key}")
    fun getRecipeDetail(@Path("key")key: String):Call<RecipeDetailModel>

}