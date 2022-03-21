package com.example.lab_3_and_4

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Fragment2 : Fragment(R.layout.fragment2) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.bnToFirst).setOnClickListener {
            findNavController().navigateUp()
        }
        view.findViewById<Button>(R.id.bnToThird).setOnClickListener {
            findNavController().navigate(R.id.action_fragment2_to_fragment3)
        }
    }
}
