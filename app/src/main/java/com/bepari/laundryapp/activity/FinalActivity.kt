package com.bepari.laundryapp.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bepari.laundryapp.R
import kotlinx.android.synthetic.main.activity_payment.*

class FinalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Thank You"
        title.toString().capitalize()

        button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }

}