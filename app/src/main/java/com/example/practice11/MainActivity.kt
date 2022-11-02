package com.example.practice11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun loadImageButton(view: View){
        var image2: ImageView = findViewById(R.id.imageView2)
        image2.setImageResource(R.drawable.grape)
        image2.contentDescription = "This is grape photo"
    }
}