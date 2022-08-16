package com.systudio.inspirasiresepbunda.model

import com.google.gson.annotations.SerializedName

data class RecipeByCategory(
    @SerializedName("status"  ) var status  : Boolean?           = null,
    @SerializedName("results" ) var results : ArrayList<ResultsByCategory> = arrayListOf()

)
data class ResultsByCategory (

    @SerializedName("title"     ) var title     : String? = null,
    @SerializedName("thumb"     ) var thumb     : String? = null,
    @SerializedName("key"       ) var key       : String? = null,
    @SerializedName("times"     ) var times     : String? = null,
    @SerializedName("portion"   ) var portion   : String? = null,
    @SerializedName("dificulty" ) var dificulty : String? = null

)
