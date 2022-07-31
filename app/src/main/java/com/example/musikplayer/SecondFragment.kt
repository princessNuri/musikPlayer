package com.example.musikplayer

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.musikplayer.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private val list = arrayListOf<Song>()
    private lateinit var adapter: SongAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        initAdapter()
    }

    private fun loadData() {
        list.add(Song("Jasmine", "DPR LIVE", "3:12", 1))
        list.add(Song("Cheese & Wine", "DPR LIVE", "3:12", 2))
        list.add(Song("Martini Blue", "DPR LIVE", "3:16", 3))
        list.add(Song("Jam & Butterfly", "DPR LIVE", "3:15", 4))
        list.add(Song("Text me", "DPR LIVE", "3:17", 5))
        list.add(Song("To myself", "DPR LIVE", "3:14", 6))
        list.add(Song("thirst", "DPR LIVE", "3:15", 7))
    }

    private fun initAdapter() {
        adapter = SongAdapter(list, this::onClickItem)
        binding.recycler.adapter = adapter
    }

    private fun onClickItem(name : String) {
        val intent = Intent(requireContext(), SecondActivity()::class.java)
        intent.putExtra("nameMusic", name)
        startActivity(intent)
    }
}