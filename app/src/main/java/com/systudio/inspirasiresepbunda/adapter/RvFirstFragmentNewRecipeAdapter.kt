package com.systudio.inspirasiresepbunda.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.systudio.inspirasiresepbunda.R
import com.systudio.inspirasiresepbunda.model.ResultsRecipe

class RvFirstFragmentNewRecipeAdapter : RecyclerView.Adapter<RvFirstFragmentNewRecipeAdapter.rvNewRecipeViewHolder>() {

    private var listData:List<ResultsRecipe>?=null
    fun setListData(listdata: List<ResultsRecipe>?){
        this.listData=listdata
    }

    class rvNewRecipeViewHolder(view: View):RecyclerView.ViewHolder(view){
      //  val title=view.
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): rvNewRecipeViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.rv_firstfrag_rowlayout,parent,false)
        return rvNewRecipeViewHolder(view)
    }

    override fun onBindViewHolder(holder: rvNewRecipeViewHolder, position: Int){

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}