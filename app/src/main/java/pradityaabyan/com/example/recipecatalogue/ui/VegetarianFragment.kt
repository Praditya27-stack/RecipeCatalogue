package pradityaabyan.com.example.recipecatalogue.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import pradityaabyan.com.example.recipecatalogue.adapter.RecipesAdapter
import pradityaabyan.com.example.recipecatalogue.data.DataRecipes
import pradityaabyan.com.example.recipecatalogue.databinding.FragmentVegetarianBinding

class VegetarianFragment : Fragment() {

    private var _binding: FragmentVegetarianBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentVegetarianBinding.inflate(inflater, container, false)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvVegetarian.apply {
            layoutManager = GridLayoutManager(activity, 2)
            adapter = RecipesAdapter(DataRecipes.listVegetarian)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}