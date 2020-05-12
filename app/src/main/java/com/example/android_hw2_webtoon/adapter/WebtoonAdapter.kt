package com.example.android_hw2_webtoon.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.android_hw2_webtoon.R
import com.example.android_hw2_webtoon.model.WebtoonChar

class WebtoonAdapter(var context: Context, var arrayList: ArrayList<WebtoonChar>) : RecyclerView.Adapter<WebtoonAdapter.ItemHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val itemHolder = LayoutInflater.from(parent.context).inflate(R.layout.grid_new, parent, false)
        return ItemHolder(itemHolder)
    }

    override fun getItemCount(): Int {
        return arrayList.size

    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        var webtoonChar : WebtoonChar = arrayList.get(position)
        holder.icons.setImageResource(webtoonChar.iconChar!!)
        holder.alphas.text = webtoonChar.webtoonChar

        holder.alphas.setOnClickListener {
            Toast.makeText(context, webtoonChar.webtoonChar, Toast.LENGTH_SHORT).show()
        }
    }

    class ItemHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var icons = itemView.findViewById<ImageView>(R.id.img_monday)
        var alphas = itemView.findViewById<TextView>(R.id.alpha_text_view)
    }
}