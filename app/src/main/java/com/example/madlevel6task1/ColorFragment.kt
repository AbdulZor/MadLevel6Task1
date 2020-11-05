package com.example.madlevel6task1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.madlevel6task1.databinding.FragmentColorBinding
import com.example.madlevel6task1.entity.ColorItem
import com.google.android.material.snackbar.Snackbar

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ColorFragment : Fragment() {
    private lateinit var fragmentColorBinding: FragmentColorBinding

    private val colorList = arrayListOf<ColorItem>()
    private var colorAdapter: ColorAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentColorBinding = FragmentColorBinding.inflate(layoutInflater)
        return fragmentColorBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // We use ::onColorClick to reference the high order function
        colorAdapter = ColorAdapter(colorList, this::onColorClick)
        fragmentColorBinding.rvColors.layoutManager =
            LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        fragmentColorBinding.rvColors.adapter = colorAdapter

        observeColors()

    }

    private fun onColorClick(colorItem: ColorItem) {
        Snackbar.make(
            fragmentColorBinding.rvColors,
            "This color is ${colorItem.name}",
            Snackbar.LENGTH_LONG
        ).show()
    }

    private fun observeColors() {
        TODO("Not yet implemented")
    }
}
