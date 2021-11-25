package pradityaabyan.com.example.recipecatalogue.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import pradityaabyan.com.example.recipecatalogue.DetailActivity
import pradityaabyan.com.example.recipecatalogue.databinding.RowItemFoodBinding
import pradityaabyan.com.example.recipecatalogue.data.Recipes

class RecipesAdapter (private val listRecipe: ArrayList<Recipes>) :
    RecyclerView.Adapter<RecipesAdapter.MyViewHolder>(){

        inner class MyViewHolder(val binding: RowItemFoodBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder (
        RowItemFoodBinding.inflate(LayoutInflater.from(parent.context), parent, false))


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply {
            with(listRecipe[position]) {
                tvFood.text = name
                tvFoodCategory.text = category
                tvPriceFood.text = price

                Glide.with(imgFood.context).load(photo).into(imgFood)
            }
        }

        holder.itemView.setOnClickListener{
            val intent = Intent(it.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.DATA_RECIPES, listRecipe[position])
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount() = listRecipe.size
}
