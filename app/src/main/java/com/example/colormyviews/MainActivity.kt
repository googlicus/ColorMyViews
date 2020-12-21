package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun makeColored(view: View) {
        val boxThree = findViewById<TextView>(R.id.box_three_text)
        val boxFour = findViewById<TextView>(R.id.box_four_text)
        val boxFive = findViewById<TextView>(R.id.box_five_text)

        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            R.id.red_button -> boxThree.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> boxFour.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> boxFive.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners() {
        val boxOne = findViewById<TextView>(R.id.box_one_text)
        val boxTwo = findViewById<TextView>(R.id.box_two_text)
        val boxThree = findViewById<TextView>(R.id.box_three_text)
        val boxFour = findViewById<TextView>(R.id.box_four_text)
        val boxFive = findViewById<TextView>(R.id.box_five_text)

        val contraintLayout = findViewById<ConstraintLayout>(R.id.constraint_layout)

        val redButt = findViewById<Button>(R.id.red_button)
        val yellowButt = findViewById<Button>(R.id.yellow_button)
        val greenButt = findViewById<Button>(R.id.green_button)

        val clickableViews: List<View> =
            listOf(boxOne, boxTwo, boxThree, boxFour, boxFive, contraintLayout, redButt, yellowButt, greenButt)
        for (item in clickableViews)
            item.setOnClickListener { makeColored(it) }


    }
}