package com.example.pizzarecipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pizza.*

class PizzaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza)
        if (intent != null) {
            ivPizza.setImageResource(intent.getIntExtra("image", 0))
            tvPizzaTitle.text = intent.getStringExtra("title")
            tvPizzaRecipe.text = intent.getStringExtra("recipe")
        }
    }
}
