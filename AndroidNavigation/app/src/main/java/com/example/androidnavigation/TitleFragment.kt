package com.example.androidnavigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

/**
 * A simple [Fragment] subclass.
 */
class TitleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root:View=inflater.inflate(R.layout.fragment_title, container, false)
        var btnplay=root.findViewById<Button>(R.id.btnplay)
        btnplay.setOnClickListener(){view:View->
            view.findNavController().navigate((R.id.action_titleFragment_to_gameFragment))
        }
        // Inflate the layout for this fragment
        return root
    }


}
