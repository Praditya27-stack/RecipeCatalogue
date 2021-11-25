package pradityaabyan.com.example.recipecatalogue.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import pradityaabyan.com.example.recipecatalogue.R
import pradityaabyan.com.example.recipecatalogue.adapter.RecipesAdapter
import pradityaabyan.com.example.recipecatalogue.data.DataRecipes
import pradityaabyan.com.example.recipecatalogue.data.Recipes
import pradityaabyan.com.example.recipecatalogue.databinding.FragmentSeafoodBinding

class SeafoodFragment : Fragment() {

    private var binding: FragmentSeafoodBinding? = null
    private var listSeafood: ArrayList<Recipes> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSeafoodBinding.inflate(inflater, container, false)
        initData()
        return binding!!.root
    }

    private fun initData() {
        with(resources) {
            val name = getStringArray(R.array.name_seafood)
            val category = getStringArray(R.array.category_seafood)
            val description = getStringArray(R.array.description_seafood)
            val ingredient = getStringArray(R.array.ingredients_seafood)
            val instruction = getStringArray(R.array.instructions_seafood)
            val photo = getStringArray(R.array.photo_seafood)
            val price = getStringArray(R.array.price_seafood)
            val calories = getStringArray(R.array.calories_seafood)
            val carbo = getStringArray(R.array.carbo_seafood)
            val protein = getStringArray(R.array.protein_seafood)


            for (data in name.indices) {
                val recipe = Recipes(
                    name[data],
                    category[data],
                    description[data],
                    ingredient[data],
                    instruction[data],
                    photo[data],
                    price[data],
                    calories[data],
                    carbo[data],
                    protein[data]
                )
                listSeafood.add(recipe)
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.rvSeafood?.apply {
            layoutManager = GridLayoutManager(activity, 2)
            adapter = RecipesAdapter(listSeafood)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}