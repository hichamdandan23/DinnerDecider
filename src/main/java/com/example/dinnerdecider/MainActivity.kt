package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = ArrayList<String>(listOf(" Hamburger", "Pizza", "Mexican", "American", "Chinese"))

        //val randomInteger: Int = Math.random(0 until 2).toInt()

        decide.setOnClickListener { v -> textView.text = list.random() }

        addFood.setOnClickListener { v ->
            list.add(food.text.toString())
            Toast.makeText(this, "${food.text} added successfuly !", Toast.LENGTH_LONG ).show()
            food.setText("")
        }



    }
}
