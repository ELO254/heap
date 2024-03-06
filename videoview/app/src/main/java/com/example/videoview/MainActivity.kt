package com.example.videoview

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {

    private lateinit var video:VideoView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        video = findViewById(R.id.videoView)

        var mediaController = MediaController(this)
        mediaController.setAnchorView(video)
        video.setMediaController(mediaController)

        var path = Uri.parse("android.resource://" + packageName + "/" + R.raw.pro)
        video.setVideoURI(path)
        video.start()
    }
}