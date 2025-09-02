package com.arnedo.galleryapp

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import coil.load

private lateinit var IvFullScreen: ImageView

class FullscreenImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fullscreen_image)

        IvFullScreen = findViewById(R.id.IvFullScreen)

        val imageId = intent.getIntExtra("image_id", 0)

        if(imageId != 0){
            IvFullScreen.load(imageId)
        }
    }
}