package com.example.simplemap.adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.simplemap.R
import com.example.simplemap.DetailsActivity
import com.example.simplemap.model.PopularFood

var isFirst2: Boolean = true
var context2: Context? = null

class AsiaFoodAdapter(var context: Context, asiaFoodList: List<PopularFood>, val isFirst: Boolean = true) : RecyclerView.Adapter<AsiaFoodAdapter.AsiaFoodViewHolder>() {
    var asiaFoodList: List<PopularFood> = asiaFoodList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AsiaFoodViewHolder {
        isFirst2 = isFirst
        context2 = context
        val view = if (!isFirst) LayoutInflater.from(context).inflate(R.layout.asia_food_row_item, parent, false)
        else LayoutInflater.from(context).inflate(R.layout.popular_food_row_item, parent, false)
        return AsiaFoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: AsiaFoodViewHolder, position: Int) {
        holder.foodImage.setImageResource(asiaFoodList[position].imageUrl)
        holder.name.setText(asiaFoodList[position].name)
        holder.price.setText(asiaFoodList[position].price)
        holder.rating.setText(asiaFoodList[position].rating)
        holder.restorantName.setText(asiaFoodList[position].restorantname)

        holder.itemView.setOnClickListener {
            val i = Intent(context, DetailsActivity::class.java)
            i.putExtra("position", position)
            i.putExtra("isFirst", isFirst)
            Log.d("TTT", position.toString())
            //                Toast.makeText(context, position, Toast.LENGTH_SHORT).show();
            context.startActivity(i)

        }
    }

    override fun getItemCount(): Int {
        return asiaFoodList.size
    }

    class AsiaFoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var foodImage: ImageView
        var price: TextView
        var name: TextView
        var rating = TextView(context2)
        var restorantName = TextView(context2)

        init {
            foodImage = itemView.findViewById(R.id.food_image)
            price = itemView.findViewById(R.id.price)
            name = itemView.findViewById(R.id.name)
            if (!isFirst2) {
                rating = itemView.findViewById(R.id.rating)
                restorantName = itemView.findViewById(R.id.restorant_name)
            }
        }
    }

}