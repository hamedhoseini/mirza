package com.example.almas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TitleProductsAdapter(private var userArrayList: ArrayList<TitleProductsTableSpecs>) :
    RecyclerView.Adapter<TitleProductsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.table_row_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.tvPackaging.text = userArrayList[i].pacaging
        viewHolder.tvBone.text = userArrayList[i].bone
        viewHolder.tvNumberOfProducts.text = userArrayList[i].numberOfProduct.toString()
        viewHolder.tvProductName.text = userArrayList[i].productName
    }

    override fun getItemCount(): Int {
        return userArrayList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvPackaging: TextView = itemView.findViewById(R.id.tv_packaging)
        val tvBone: TextView = itemView.findViewById(R.id.tv_bone)
        val tvNumberOfProducts: TextView = itemView.findViewById(R.id.tv_number_of_products)
        val tvProductName : TextView = itemView.findViewById(R.id.tv_product_name)

    }
}