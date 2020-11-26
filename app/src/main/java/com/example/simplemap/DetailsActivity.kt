package com.example.simplemap

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.simplemap.model.PopularFood
import java.util.*

class DetailsActivity : AppCompatActivity() {
    private var textView: TextView? = null
    private var textView_decs: TextView? = null
    private var textView_rating: TextView? = null
    private var textView_restaurant: TextView? = null
    private var imageView: ImageView? = null
    private var imageViewBack: ImageButton? = null
    private var data: ArrayList<PopularFood>? = null
    var data2: ArrayList<PopularFood>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        textView = findViewById(R.id.textView14)
        textView_decs = findViewById(R.id.textView12)
        imageView = findViewById(R.id.imageView8)
        imageViewBack = findViewById(R.id.imageView5)
        textView_rating = findViewById(R.id.textView3)
        textView_restaurant = findViewById(R.id.textView10)

        imageViewBack!!.setOnClickListener {
            finish()
        }

        val extras = intent.extras
        val value1 = extras!!["position"].toString()
        val isFirst = extras["isFirst"].toString() == "true"
        //        String value2 = extras.get("position2").toString();
        data = ArrayList()
        data2 = ArrayList()
        loadData()
        val key = value1.toInt()
        //        int k = value1;


        if (key > -1 && !isFirst) {
            textView!!.text = data2!![key].name
            textView_decs!!.text = data2!![key].price
            imageView!!.setImageResource(data2!![key].imageUrl)
            textView_rating!!.text = data2!![key].rating
            textView_restaurant!!.text = data2!![key].restorantname
        } else {
            textView!!.text = data!![key].name
            textView_decs!!.text = data!![key].price
            imageView!!.setImageResource(data!![key].imageUrl)
        }
    }


    private fun loadData() {
        data!!.add(PopularFood("Float Cake Vietnam", "$7.05", R.drawable.popularfood1))
        data!!.add(PopularFood("Chicken Drumstick", "$17.05", R.drawable.popularfood2))
        data!!.add(PopularFood("Fish Tikka Stick", "$25.05", R.drawable.popularfood3))
        data!!.add(PopularFood("Float Cake Vietnam", "$7.05", R.drawable.popularfood1))
        data!!.add(PopularFood("Chicken Drumstick", "$17.05", R.drawable.popularfood2))
        data!!.add(PopularFood("Fish Tikka Stick", "$25.05", R.drawable.popularfood3))
        data2!!.add(PopularFood("Chicago Pizza", "$20", R.drawable.asiafood1, "4.5", "Briand Restaurant"))
        data2!!.add(PopularFood("Straberry Cake", "$25", R.drawable.asiafood2, "4.2", "Friends Restaurant"))
        data2!!.add(PopularFood("Chicago Pizza", "$20", R.drawable.asiafood1, "4.5", "Briand Restaurant"))
        data2!!.add(PopularFood("Straberry Cake", "$25", R.drawable.asiafood2, "4.2", "Friends Restaurant"))
        data2!!.add(PopularFood("Chicago Pizza", "$20", R.drawable.asiafood1, "4.5", "Briand Restaurant"))
        data2!!.add(PopularFood("Straberry Cake", "$25", R.drawable.asiafood2, "4.2", "Friends Restaurant"))
    }
}