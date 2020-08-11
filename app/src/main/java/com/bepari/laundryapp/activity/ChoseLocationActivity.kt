package com.bepari.laundryapp.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bepari.laundryapp.R
import kotlinx.android.synthetic.main.activity_chose_location.*
import kotlinx.android.synthetic.main.activity_payment.button

class ChoseLocationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chose_location)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Chose Location"
        title.toString().capitalize()
        // set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        setOnClickListener()
    }

    private fun setOnClickListener() {
        imageView4.setOnClickListener {
            imageView4.setBackgroundResource(R.drawable.ic_tick)
            imageView3.setBackgroundResource(R.drawable.circle)
        }
        cardView2.setOnClickListener {
            imageView4.setBackgroundResource(R.drawable.ic_tick)
            imageView3.setBackgroundResource(R.drawable.circle)
        }
        imageView3.setOnClickListener {
            imageView4.setBackgroundResource(R.drawable.circle)
            imageView3.setBackgroundResource(R.drawable.ic_tick)
        }
        cardView.setOnClickListener {
            imageView4.setBackgroundResource(R.drawable.circle)
            imageView3.setBackgroundResource(R.drawable.ic_tick)
        }
        button.setOnClickListener {
            startActivity(Intent(this, ScheduleActivity::class.java))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}