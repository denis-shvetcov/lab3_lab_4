package com.example.lab_3_and_4

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Fragment3 : Fragment(R.layout.fragment3) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.bnToFirst).setOnClickListener {
            findNavController().popBackStack(R.id.fragment2, true)
        }
        view.findViewById<Button>(R.id.bnToSecond).setOnClickListener {
            findNavController().navigateUp()
        }
    }
}
