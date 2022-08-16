package com.systudio.inspirasiresepbunda.model

import com.google.gson.annotations.SerializedName

data class RecipeCategory(
    @SerializedName("status"  ) var status  : Boolean?           = null,
    @SerializedName("results" ) var results : ArrayList<ResultsCategory> = arrayListOf()
)
data class ResultsCategory (

    @SerializedName("category" ) var category : String? = null,
    @SerializedName("url"      ) var url      : String? = null,
    @SerializedName("key"      ) var key      : String? = null

)