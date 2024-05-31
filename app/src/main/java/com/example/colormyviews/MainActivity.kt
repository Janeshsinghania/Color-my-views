package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
//import kotlinx.android.synthetic.main.activity_main.*
import com.example.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
        val clickableViews: List<View> = listOf(binding.BoxOneText,binding.BoxTwoText,binding.BoxThreeText,binding.BoxFourText,
            binding.BoxFiveText,binding.ConstraintLayout,binding.redButton,binding.greenButton,binding.yellowButton)
        for (item in clickableViews){
            item.setOnClickListener {
                makeColoured(it)
            }
        }
    }

    private fun makeColoured(view: View){
        when(view.id){
            R.id.Box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.Box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.Box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.Box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.Box_five_text -> view.setBackgroundResource(android.R.color.holo_blue_bright)
            R.id.red_button -> binding.BoxThreeText.setBackgroundResource(R.color.my_red)
            R.id.green_button -> binding.BoxFourText.setBackgroundResource(R.color.my_green)
            R.id.yellow_button -> binding.BoxFiveText.setBackgroundResource(R.color.my_yellow)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}