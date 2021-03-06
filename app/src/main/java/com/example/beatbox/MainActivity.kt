package com.example.beatbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.beatbox.databinding.ActivityMainBinding
import com.example.beatbox.databinding.ListItemSoundBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)

        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(context,3)
            adapter = SoundAdapter()

        }

//kdddddddddddddddddddd

        //ieieeeeeeeeeeeeeeeeeeeeee

        //klllllllllllllllllllllllllll


    }

    private inner class SoundHolder( binding: ListItemSoundBinding):RecyclerView.ViewHolder(binding.root){

    }

    private inner class SoundAdapter():RecyclerView.Adapter<SoundHolder>(){


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SoundHolder {
            val binding = DataBindingUtil.inflate<ListItemSoundBinding>(
                layoutInflater,
                R.layout.list_item_sound,
                parent,
                false
            )
            return SoundHolder(binding)
        }

        override fun onBindViewHolder(holder: SoundHolder, position: Int) {

        }

        override fun getItemCount(): Int =0

    }
}