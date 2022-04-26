package com.example.contentproviderpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object
    {
        val TAG : String = MainActivity :: class.java.simpleName
    }

    lateinit var textView: TextView
    lateinit var button_display_first : Button
    lateinit var button_display_all : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView) as TextView
        button_display_first = findViewById(R.id.button_display_first) as Button
        button_display_all = findViewById(R.id.button_display_all)

    }

    fun onClickDisplayEntries (view : View)
    {
       Log.d(TAG, "Yay, I was clicked!")

        when (view.id)
        {
            R.id.button_display_all ->
                Log.d (TAG, "Yay, " + R.id.button_display_all + " was clicked!")

            R.id.button_display_first ->
                Log.d (TAG, "Yay, " + R.id.button_display_first + " was clicked!")

            else ->  Log.d (TAG, "Error. This should never happen.");

        }

        textView.append("Thus we go! \n")

    }


}