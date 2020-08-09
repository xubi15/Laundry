package com.bepari.laundryapp.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bepari.laundryapp.R
import com.bepari.laundryapp.adapter.ServiceAdapter
import com.bepari.laundryapp.data.ServiceData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var serviceList: MutableList<ServiceData>
    private lateinit var serviceAdapter: ServiceAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Services"
        title.toString().capitalize()
        // set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        viewManager = LinearLayoutManager(this)
        serviceList = mutableListOf()

        serviceList.add(
            ServiceData(
                "https://imgprod65.hobbylobby.com/9/5f/26/95f264323ae49e65b2a53a909fcd7d9ee659f3c7/350Wx350H-422519-0320.jpg",
                "T-Shirt",
                10
            )
        )
        serviceList.add(
            ServiceData(
                "https://outdoor-and-country-res.cloudinary.com/image/upload/e_trim:2/bo_8px_solid_white/c_pad,b_white,w_1000,h_1200,f_auto,q_auto/v1540205233/product/186710.jpg",
                "Shirt",
                15
            )
        )
        serviceList.add(
            ServiceData(
                "https://agnesb-agnesb-com-storage.omn.proximis.com/Imagestorage/imagesSynchro/0/0/0a82767dab00426169ea376c94411d75219196fd_Y213US05_000_1.jpeg",
                "Trousers",
                8
            )
        )

        serviceAdapter = ServiceAdapter(serviceList, applicationContext)
        recyclerView.apply {
            adapter = serviceAdapter
            layoutManager = viewManager
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    fun proceed(view: View) {
        startActivity(Intent(this, PaymentActivity::class.java))
    }

}