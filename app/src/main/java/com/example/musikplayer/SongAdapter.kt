package com.example.musikplayer

import android.content.ClipData
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musikplayer.databinding.ItemSongBinding

class SongAdapter(private var songs: ArrayList<Song>, private val onClickItem: (String) -> Unit) :
    RecyclerView.Adapter<SongAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemSongBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(songs[position])
    }

    override fun getItemCount() = songs.size

    inner class ViewHolder(private var binding: ItemSongBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(songs: Song) {
            binding.nameOfSong.text = songs.name
            binding.number.text = songs.number.toString()
            binding.singer.text = songs.singer
            binding.time.text = songs.time

            itemView.setOnClickListener {
                onClickItem(songs.name)
            }
        }

    }


}