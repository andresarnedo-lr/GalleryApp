package com.arnedo.galleryapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var RecyclerView: RecyclerView
    private var image =  listOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
        R.drawable.image6,
        R.drawable.image7,
        R.drawable.image8,
        R.drawable.image9,
        R.drawable.image10,
        R.drawable.image11,
        R.drawable.image12,
        R.drawable.image13,
        R.drawable.image14,
        R.drawable.image15,
        R.drawable.image16,
        R.drawable.image17,
        R.drawable.image18,
        R.drawable.image19,
        R.drawable.image20,
        R.drawable.image21,
        R.drawable.image22,
        R.drawable.image23,
        R.drawable.image24,
        R.drawable.image25,
        R.drawable.image26,
        R.drawable.image27,
        R.drawable.image28,
        R.drawable.image29,
        R.drawable.image30,
        R.drawable.image31,
        R.drawable.image32,
        R.drawable.image33,
        R.drawable.image34,
        R.drawable.image35,
        R.drawable.image36,
        R.drawable.image37,

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RecyclerView = findViewById(R.id.RecyclerView)

        RecyclerView.layoutManager = GridLayoutManager(this, 3)
        RecyclerView.adapter = ImageAdapter(image){ imageId ->
            val intent = Intent(this, FullscreenImageActivity::class.java).apply {
                putExtra("image_id", imageId)
            }
            startActivity(intent)}
        }
}