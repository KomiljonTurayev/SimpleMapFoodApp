package com.example.simplemap.adapter

import android.content.Context
import com.example.simplemap.model.PopularFood
import androidx.recyclerview.widget.RecyclerView
import com.example.simplemap.adapter.PopularFoodAdapter.PopularFoodViewHolder
import android.view.ViewGroup
import android.view.LayoutInflater
import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.ImageView
import com.example.simplemap.DetailsActivity
import android.widget.TextView
import com.example.simplemap.R

class PopularFoodAdapter(var context: Context, var popularFoodList: List<PopularFood>) : RecyclerView.Adapter<PopularFoodViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularFoodViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.popular_food_row_item, parent, false)
        return PopularFoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: PopularFoodViewHolder, position: Int) {
        holder.foodImage.setImageResource(popularFoodList[position].imageUrl)
        holder.name.text = popularFoodList[position].name
        holder.price.text = popularFoodList[position].price
        holder.itemView.setOnClickListener {
            val i = Intent(context, DetailsActivity::class.java)
            i.putExtra("position", position)
            Log.d("TTT", position.toString())
            //                Toast.makeText(context, position, Toast.LENGTH_SHORT).show();
            context.startActivity(i)
        }
    }

    override fun getItemCount(): Int {
        return popularFoodList.size
    }

    class PopularFoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var foodImage: ImageView = itemView.findViewById(R.id.food_image)
        var price: TextView = itemView.findViewById(R.id.price)
        var name: TextView = itemView.findViewById(R.id.name)

    }
}