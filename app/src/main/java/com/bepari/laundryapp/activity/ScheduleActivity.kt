package com.bepari.laundryapp.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bepari.laundryapp.R
import kotlinx.android.synthetic.main.activity_payment.*

class ScheduleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Schedule Pick Up"
        title.toString().capitalize()
        // set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        button.setOnClickListener {
            startActivity(Intent(this, PaymentActivity::class.java))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}