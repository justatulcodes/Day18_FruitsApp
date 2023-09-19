package com.example.day18_fruitsapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.day18_fruitsapp.data.Fruit
import com.example.day18_fruitsapp.databinding.FoodCardItemviewBinding

class ProductItemsAdapter (private val productList : List<Fruit>) :
    RecyclerView.Adapter<ProductItemsAdapter.ViewHolder>(){

    private var onClickListener: OnClickListener? = null

    class ViewHolder(binding: FoodCardItemviewBinding): RecyclerView.ViewHolder(binding.root) {
        val img = binding.ivFruit
        val name = binding.tvFruitName
        val price = binding.price
        val weight = binding.tvWeight
        val container = binding.productContainer
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(FoodCardItemviewBinding.inflate(
            LayoutInflater.from(parent.context),parent, false
        ))
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = productList[position]
        holder.img.setImageResource(product.imageID)
        holder.name.text = product.name
        holder.price.text = product.price.toString()
        holder.weight.text = product.weight.toString() + "g"

        holder.container.setOnClickListener{
            if(onClickListener!=null){
                onClickListener?.onClick(position)
            }
        }
    }

    fun setOnClickListener(onClickListener: OnClickListener) {
        this.onClickListener = onClickListener
    }

    interface OnClickListener{
        fun onClick(position: Int)
    }
}