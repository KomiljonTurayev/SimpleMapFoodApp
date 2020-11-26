package com.example.simplemap

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.example.simplemap.adapter.AsiaFoodAdapter
import com.example.simplemap.model.PopularFood
import java.util.*

class MainActivity : AppCompatActivity() {
    var popularRecycler: RecyclerView? = null
    var asiaRecycler: RecyclerView? = null
    var popularFoodAdapter: AsiaFoodAdapter? = null
    var asiaFoodAdapter: AsiaFoodAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val floatingActionButton2: FloatingActionButton = findViewById(R.id.floatingActionButton2)
        floatingActionButton2.setOnClickListener {
            startActivity(Intent(this,MapsActivity::class.java))
        }

        // now here we will add some dummy data to out model class
        val popularFoodList: MutableList<PopularFood> = ArrayList()
        popularFoodList.add(PopularFood("Float Cake Vietnam", "$7.05", R.drawable.popularfood1))
        popularFoodList.add(PopularFood("Chiken Drumstick", "$17.05", R.drawable.popularfood2))
        popularFoodList.add(PopularFood("Fish Tikka Stick", "$25.05", R.drawable.popularfood3))
        popularFoodList.add(PopularFood("Float Cake Vietnam", "$7.05", R.drawable.popularfood1))
        popularFoodList.add(PopularFood("Chiken Drumstick", "$17.05", R.drawable.popularfood2))
        popularFoodList.add(PopularFood("Fish Tikka Stick", "$25.05", R.drawable.popularfood3))
        setPopularRecycler(popularFoodList)
        val asiaFoodList: MutableList<PopularFood> = ArrayList()
        asiaFoodList.add(PopularFood("Chicago Pizza", "$20", R.drawable.asiafood1, "4.5", "Briand Restaurant"))
        asiaFoodList.add(PopularFood("Straberry Cake", "$25", R.drawable.asiafood2, "4.2", "Friends Restaurant"))
        asiaFoodList.add(PopularFood("Chicago Pizza", "$20", R.drawable.asiafood1, "4.5", "Briand Restaurant"))
        asiaFoodList.add(PopularFood("Straberry Cake", "$25", R.drawable.asiafood2, "4.2", "Friends Restaurant"))
        asiaFoodList.add(PopularFood("Chicago Pizza", "$20", R.drawable.asiafood1, "4.5", "Briand Restaurant"))
        asiaFoodList.add(PopularFood("Straberry Cake", "$25", R.drawable.asiafood2, "4.2", "Friends Restaurant"))
        setAsiaRecycler(asiaFoodList)
    }

    private fun setPopularRecycler(popularFoodList: List<PopularFood>) {
        popularRecycler = findViewById(R.id.popular_recycler)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        popularRecycler!!.layoutManager = layoutManager
        popularFoodAdapter = AsiaFoodAdapter(this, popularFoodList)
        popularRecycler!!.adapter = popularFoodAdapter
    }

    private fun setAsiaRecycler(asiaFoodList: List<PopularFood>) {
        asiaRecycler = findViewById(R.id.asia_recycler)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        asiaRecycler!!.layoutManager = layoutManager
        asiaFoodAdapter = AsiaFoodAdapter(this, asiaFoodList,false)
        asiaRecycler!!.adapter = asiaFoodAdapter
    }



    // Hi all,
    // Today we are going to build a food app.
    // so the first things first lets add font and image assets
    // so lets see the design
    // now we will setup recyclerview
    // first we make a model class then adapter class.
    // now we will create a recyclerview row item layout file
    // so our adapter class is ready
    // now we will bind data with recyclerview
    // so we have successfully setup popular recyclerview
    // now same setup we need to do for asia food
    // will make model class then adapter and setup recyclerview
    // so lets do it fast.
    // so asia food setup done.
    // Now we will setup Bottom app bar
    // bottom app bar setup done if you want you can increase menu item in menu file
    // now we will setup details activity and on click listener in recyclerview row item
    // so this tutorial has been completed if you have any
    // question and query please do comment
    // Like share and subscribe
    // Thankyou for watching
    // see you in the next tutorial
}