package com.example.pizzarecipe

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_recipe.view.*

class PizzaAdapter(private val pizzaRecipes: List<PizzaRecipeItem>, private val context: Context) : RecyclerView.Adapter<PizzaAdapter.PizzaViewHolder>() {

    inner class PizzaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener{
                val pizza = pizzaRecipes[adapterPosition]
                var intent = Intent(context,PizzaActivity::class.java)
                intent.apply {
                    putExtra("image",pizza.image)
                    putExtra("title",pizza.title)
                    putExtra("recipe",pizza.recipe)
                }
                context.startActivity(intent)
            }

        }

        val image = itemView.ivPizzaPhoto!!
        val title = itemView.tvTitle!!
        val recipe = itemView.tvRecipe!!



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaViewHolder {
        return PizzaViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_recipe,parent,false))

    }

    override fun getItemCount(): Int {
        return pizzaRecipes.size
    }

    override fun onBindViewHolder(holder: PizzaViewHolder, position: Int) {
        var pizzaViewItem = pizzaRecipes[position]
        holder.image.setImageResource(pizzaViewItem.image)
        holder.title.text = pizzaViewItem.title
        holder.recipe.text = pizzaViewItem.description
    }
}