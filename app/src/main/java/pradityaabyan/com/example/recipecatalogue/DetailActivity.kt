package pradityaabyan.com.example.recipecatalogue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import pradityaabyan.com.example.recipecatalogue.data.Recipes
import pradityaabyan.com.example.recipecatalogue.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val DATA_RECIPES = "data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val data = intent.getParcelableExtra<Recipes>(DATA_RECIPES)

        binding.apply {
            tvFoodDetail.text = data?.name
            tvCalories.text = data?.calories
            tvCarbo.text = data?.carbo
            tvProtein.text = data?.protein
            tvDescription.text = data?.description
            tvIngredientsDetail.text = data?.description
            tvDirectionsDetail.text = data?.instruction
        }

        Glide.with(applicationContext).load(data?.photo).into(binding.imgDetail)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}