package com.example.androidviews

import android.R
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.androidviews.databinding.*
import eightbitlab.com.blurview.RenderScriptBlur


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDesign01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDesign01Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}