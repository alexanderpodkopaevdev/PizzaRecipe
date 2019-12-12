package com.example.pizzarecipe


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pizzaRecipes = listOf(PizzaRecipeItem(R.drawable.pizza_1,"Пеперошка", "Заказать в Додо", "Они сами всё приготовят. И даже соус дадут"),
        PizzaRecipeItem(R.drawable.pizza_1,Utils.PIZZA_1_TITLE,Utils.PIZZA_1_DESCRIPTION,Utils.PIZZA_1_RECIPE),
            PizzaRecipeItem(R.drawable.pizza_2,Utils.PIZZA_2_TITLE,Utils.PIZZA_2_DESCRIPTION,Utils.PIZZA_2_RECIPE),
            PizzaRecipeItem(R.drawable.pizza_3,Utils.PIZZA_3_TITLE,Utils.PIZZA_3_DESCRIPTION,Utils.PIZZA_3_RECIPE),
            PizzaRecipeItem(R.drawable.pizza_4,Utils.PIZZA_4_TITLE,Utils.PIZZA_4_DESCRIPTION,Utils.PIZZA_4_RECIPE),
            PizzaRecipeItem(R.drawable.pizza_5,Utils.PIZZA_5_TITLE,Utils.PIZZA_5_DESCRIPTION,Utils.PIZZA_5_RECIPE),
            PizzaRecipeItem(R.drawable.pizza_6,Utils.PIZZA_6_TITLE,Utils.PIZZA_6_DESCRIPTION,Utils.PIZZA_6_RECIPE),
            PizzaRecipeItem(R.drawable.pizza_7,Utils.PIZZA_7_TITLE,Utils.PIZZA_7_DESCRIPTION,Utils.PIZZA_7_RECIPE),
            PizzaRecipeItem(R.drawable.pizza_8,Utils.PIZZA_8_TITLE,Utils.PIZZA_8_DESCRIPTION,Utils.PIZZA_8_RECIPE),
            PizzaRecipeItem(R.drawable.pizza_9,Utils.PIZZA_9_TITLE,Utils.PIZZA_9_DESCRIPTION,Utils.PIZZA_9_RECIPE),
            PizzaRecipeItem(R.drawable.pizza_10,Utils.PIZZA_10_TITLE,Utils.PIZZA_10_DESCRIPTION,Utils.PIZZA_10_RECIPE))


        viewManager = LinearLayoutManager(this)
        viewAdapter = PizzaAdapter(pizzaRecipes,this)
        recyclerView = findViewById(R.id.rvPizza)
        recyclerView.apply {
            layoutManager = viewManager
            setHasFixedSize(true)
            adapter = viewAdapter
        }







    }
}
