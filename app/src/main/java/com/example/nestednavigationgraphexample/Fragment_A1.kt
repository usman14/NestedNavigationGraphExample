package com.example.nestednavigationgraphexample


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass.
 */
class Fragment_A1  : Fragment(),View.OnClickListener {

    var navController: NavController?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a1, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController= Navigation.findNavController(view)
        view.findViewById<Button>(R.id.btn1).setOnClickListener(this)
        view.findViewById<Button>(R.id.btn2).setOnClickListener(this)
        view.findViewById<Button>(R.id.btn3).setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.btn1-> navController!!.navigate(R.id.A1_to_A2)
            R.id.btn2-> navController!!.navigate(R.id.A1_to_B_nav_graph)
            R.id.btn3-> navController!!.navigate(R.id.A1_to_C_nav_graph)

        }
    }


}
