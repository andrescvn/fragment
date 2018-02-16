package com.example.brianvelosofioretti.pruebakotlin

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_ventana1.*


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [freagmentventana1.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [freagmentventana1.newInstance] factory method to
 * create an instance of this fragment.
 */
class freagmentventana1 : Fragment() {

    // TODO: Rename and change types of parameters

//primero inflamos la vista


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_ventana1, container, false)


    }
// ahora una vez inflada la vista llamamos al intent
    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener {
            // Handler code here.
            val intent = Intent(context, Main2Activity::class.java)
            startActivity(intent);


}
    if(resources.configuration.orientation==Configuration.ORIENTATION_LANDSCAPE){
        button.visibility=View.INVISIBLE
        }

    }





}

