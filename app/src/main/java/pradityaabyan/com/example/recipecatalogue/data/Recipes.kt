package pradityaabyan.com.example.recipecatalogue.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Recipes(
    var name: String,
    var category: String,
    var description: String,
    var ingredient: String,
    var instruction: String,
    var photo: String,
    var calories: String,
    var price: String,
    var carbo: String,
    var protein: String
) : Parcelable
