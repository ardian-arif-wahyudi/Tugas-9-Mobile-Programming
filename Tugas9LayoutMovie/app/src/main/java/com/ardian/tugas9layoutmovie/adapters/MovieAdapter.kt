package com.ardian.tugas9layoutmovie.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.ardian.tugas9layoutmovie.Data
import com.example.tugas9layoutmovie.R

class MovieAdapter(private val movieList: ArrayList<com.ardian.tugas9layoutmovie.Data>): RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview, parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = movieList[position]
        holder.itemName.text = currentItem.name
        holder.itemDetail.text = currentItem.detail
        holder.itemPoster.setImageResource(currentItem.poster)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemName: TextView = itemView.findViewById(R.id.tv_item_name)
        val itemDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        val itemPoster: ShapeableImageView = itemView.findViewById(R.id.img_item_poster)
    }
}