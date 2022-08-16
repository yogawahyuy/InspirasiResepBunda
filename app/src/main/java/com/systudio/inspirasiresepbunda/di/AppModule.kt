package com.systudio.inspirasiresepbunda.di

import com.systudio.inspirasiresepbunda.interfaces.RecipeServiceInstance
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    val BaseUrl="https://masak-apa.tomorisakura.vercel.app/"

    @Provides
    @Singleton
    fun getRetrofitInstance():Retrofit = Retrofit.Builder().baseUrl(BaseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    @Provides
    @Singleton
    fun getRecipeServiceInstance(retrofit: Retrofit):RecipeServiceInstance =
        retrofit.create(RecipeServiceInstance::class.java)
}