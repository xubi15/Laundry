package com.bepari.laundryapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bepari.laundryapp.R
import com.bepari.laundryapp.data.ServiceData
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.list_services.view.*

class ServiceAdapter (
    private val serviceList: MutableList<ServiceData>,
    private val context: Context
) :


    RecyclerView.Adapter<ServiceAdapter.CampaignViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CampaignViewHolder {
        return CampaignViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.list_services, parent, false)
        )
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return serviceList.size
    }

    override fun onBindViewHolder(holder: CampaignViewHolder, position: Int) {
        holder.itemView.itemNameTextView.text = serviceList[position].itemName
        holder.itemView.unitPriceTv.text = "৳ "+serviceList[position].unitPrice.toString()
        Glide.with(context).load(serviceList[position].imageUrl).circleCrop().into(holder.itemView.imageView)

    }

    class CampaignViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}