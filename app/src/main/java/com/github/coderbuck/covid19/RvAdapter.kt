package com.github.coderbuck.covid19

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.github.coderbuck.covid19.bean.Area
import com.github.coderbuck.covid19.databinding.ItemRvBinding

class RvAdapter : RecyclerView.Adapter<RvAdapter.Holder>() {
    var data = mutableListOf<Area>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: Holder, position: Int) {
        val area = data[position]
        holder.v.tv.text = "${area.countryName} -- ${area.confirmedCount}"
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class Holder(var v: ItemRvBinding) : ViewHolder(v.root)
}