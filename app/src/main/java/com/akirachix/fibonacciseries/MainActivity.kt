package com.akirachix.fibonacciseries

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val names = listOf("Amina","Brenda","Carol","Diana","Esther","Flo","Gina","Kelvin","Lisa","Mike","Naomi","Oscar","Pearl","Queen","Robert","Kim Namjoon","Kim Seokjin","Min Yoongi","Jung Hoseok","Park Jimin","Kim Taehyung","Jeon Jungkook","Nickson")
//
//        binding.rvNames.layoutManager= LinearLayoutManager(this)
//        val namesAdapter= FibonacciRecyclerViewAdapter(names)
//        binding.rvNames.adapter= namesAdapter
//    }
}