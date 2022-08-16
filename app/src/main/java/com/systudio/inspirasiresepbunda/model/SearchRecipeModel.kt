package com.systudio.inspirasiresepbunda.model

import com.google.gson.annotations.SerializedName

data class SearchRecipeModel(
    @SerializedName("status"  ) var status  : Boolean?           = null,
    @SerializedName("results" ) var results : ArrayList<ResultsSearchRecipe> = arrayListOf()
)

data class ResultsSearchRecipe (

    @SerializedName("title"      ) var title      : String? = null,
    @SerializedName("thumb"      ) var thumb      : String? = null,
    @SerializedName("key"        ) var key        : String? = null,
    @SerializedName("times"      ) var times      : String? = null,
    @SerializedName("serving"    ) var serving    : String? = null,
    @SerializedName("difficulty" ) var difficulty : String? = null

)
