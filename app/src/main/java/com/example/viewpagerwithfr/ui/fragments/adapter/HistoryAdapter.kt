package com.example.viewpagerwithfr.ui.fragments.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.viewpagerwithfr.databinding.ItemHistoryBinding
import com.example.viewpagerwithfr.model.CountModel

class HistoryAdapter : ListAdapter<CountModel, HistoryAdapter.HistoryViewHolder>(CountDiffCallBack()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        val binding = ItemHistoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HistoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }


    class HistoryViewHolder(private val binding: ItemHistoryBinding): ViewHolder(binding.root) {
        fun onBind(countModel: CountModel) {
            binding.tvHistory.text = countModel.count
        }

    }

    private class CountDiffCallBack : DiffUtil.ItemCallback<CountModel>() {
        override fun areItemsTheSame(oldItem: CountModel, newItem: CountModel): Boolean =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: CountModel, newItem: CountModel): Boolean =
            oldItem == newItem
    }
}