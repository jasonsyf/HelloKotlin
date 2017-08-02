package com.jason.hellokotlin

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by jason_sunyf on 2017/8/2.
 * Email:yufeng.sun@21wendao.cn
 */
class ForecastListAdapter(val items:List<String>):RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
       return ViewHolder(TextView(parent!!.context))
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.textView.text = items.get(position)
    }

    override fun getItemCount(): Int = items.size


    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

}