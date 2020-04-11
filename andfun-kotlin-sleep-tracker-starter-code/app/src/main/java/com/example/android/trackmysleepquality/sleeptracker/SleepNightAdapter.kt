package com.example.android.trackmysleepquality.sleeptracker

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android.trackmysleepquality.database.SleepNight
import com.example.android.trackmysleepquality.databinding.ListNightItemNightBinding

class SleepNightAdapter(val clickListener: SleepNightListener) :  ListAdapter<SleepNight, SleepNightAdapter.ViewHolder>(SleepNightDiffCallback()){

    override fun onBindViewHolder(holder: ViewHolder  , position: Int) {
        holder.bind(clickListener,getItem(position)!!)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    class ViewHolder(val binding: ListNightItemNightBinding): RecyclerView.ViewHolder(binding.root){

        fun bind( clickListener: SleepNightListener, item: SleepNight) {
            binding.clickListener = clickListener
            binding.sleep = item
            binding.executePendingBindings()

        }

        companion object {
            fun from(parent : ViewGroup): ViewHolder {
                val layoutInflator = LayoutInflater.from(parent.context)
                val binding = ListNightItemNightBinding.inflate(layoutInflator, parent, false )
                return ViewHolder(binding)
            }

        }
}

    class SleepNightDiffCallback :
            DiffUtil.ItemCallback<SleepNight>() {
        override fun areItemsTheSame(oldItem: SleepNight, newItem: SleepNight): Boolean {
            return newItem.nightId == oldItem.nightId
        }

        override fun areContentsTheSame(oldItem: SleepNight, newItem: SleepNight): Boolean {
            return oldItem == newItem
        }
    }

    class SleepNightListener(val clickListener: (sleepId: Long) -> Unit) {
        fun onClick(night: SleepNight) = clickListener(night.nightId)
    }

}

