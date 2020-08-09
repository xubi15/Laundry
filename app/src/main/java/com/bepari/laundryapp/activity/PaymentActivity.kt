package com.bepari.laundryapp.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bepari.laundryapp.R
import kotlinx.android.synthetic.main.activity_payment.*

class PaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Payment Method"
        title.toString().capitalize()
        // set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        setOnClickListener()
    }

    private fun setOnClickListener() {
        imgCod.setOnClickListener {
            imgCod.setBackgroundResource(R.drawable.ic_tick)
            imgNetBanking.setBackgroundResource(R.drawable.circle)
            imgCreditCard.setBackgroundResource(R.drawable.circle)
        }
        imgNetBanking.setOnClickListener {
            imgCod.setBackgroundResource(R.drawable.circle)
            imgNetBanking.setBackgroundResource(R.drawable.ic_tick)
            imgCreditCard.setBackgroundResource(R.drawable.circle)
        }
        imgCreditCard.setOnClickListener {
            imgCod.setBackgroundResource(R.drawable.circle)
            imgNetBanking.setBackgroundResource(R.drawable.circle)
            imgCreditCard.setBackgroundResource(R.drawable.ic_tick)
        }
        button.setOnClickListener {
            startActivity(Intent(this, FinalActivity::class.java))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}