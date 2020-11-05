package com.example.madlevel6task1

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.madlevel6task1.databinding.ItemColorBinding
import com.example.madlevel6task1.entity.ColorItem

class ColorAdapter(private val colors: List<ColorItem>) :
    RecyclerView.Adapter<ColorAdapter.ViewHolder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val itemColorBinding =
            ItemColorBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(itemColorBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(colors[position])

    override fun getItemCount() = colors.size


    inner class ViewHolder(private val itemColorBinding: ItemColorBinding) :
        RecyclerView.ViewHolder(itemColorBinding.root) {
        fun bind(colorItem: ColorItem) {
            Glide.with(context).load(colorItem.getImageUrl())
                .into(itemColorBinding.ivColor);
        }
    }
}