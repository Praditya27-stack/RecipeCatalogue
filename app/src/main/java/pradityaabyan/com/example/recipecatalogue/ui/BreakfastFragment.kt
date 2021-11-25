package pradityaabyan.com.example.recipecatalogue.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import pradityaabyan.com.example.recipecatalogue.adapter.RecipesAdapter
import pradityaabyan.com.example.recipecatalogue.data.DataRecipes
import pradityaabyan.com.example.recipecatalogue.data.Recipes
import pradityaabyan.com.example.recipecatalogue.databinding.FragmentBreakfastBinding

class BreakfastFragment : Fragment() {

    private var _binding: FragmentBreakfastBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBreakfastBinding.inflate(inflater, container, false)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvBreakfast.apply {
            layoutManager = GridLayoutManager(activity,2)
            adapter = RecipesAdapter(DataRecipes.listBreakfast)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}