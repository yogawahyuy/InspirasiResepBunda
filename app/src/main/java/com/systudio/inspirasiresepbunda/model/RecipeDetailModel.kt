package com.systudio.inspirasiresepbunda.model

import com.google.gson.annotations.SerializedName

data class RecipeDetailModel(
    @SerializedName("status"  ) var status  : Boolean? = null,
    @SerializedName("results" ) var results : ResultsRecipeDetail? = ResultsRecipeDetail()
)
data class Author (

    @SerializedName("user"          ) var user          : String? = null,
    @SerializedName("datePublished" ) var datePublished : String? = null

)
data class ResultsRecipeDetail (

    @SerializedName("title"      ) var title      : String?           = null,
    @SerializedName("thumb"      ) var thumb      : String?           = null,
    @SerializedName("servings"   ) var servings   : String?           = null,
    @SerializedName("times"      ) var times      : String?           = null,
    @SerializedName("dificulty"  ) var dificulty  : String?           = null,
    @SerializedName("author"     ) var author     : Author?           = Author(),
    @SerializedName("desc"       ) var desc       : String?           = null,
    @SerializedName("needItem"   ) var needItem   : ArrayList<String> = arrayListOf(),
    @SerializedName("ingredient" ) var ingredient : ArrayList<String> = arrayListOf(),
    @SerializedName("step"       ) var step       : ArrayList<String> = arrayListOf()

)
