package com.demonic.socialmedia

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.demonic.socialmedia.daos.PostDao

class CreatePostActivity : AppCompatActivity() {
    private lateinit var postDao = PostDao()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_create_post)

        val postButton = findViewById<Button>(R.id.postButton)
        postButton.setOnClickListener {
            val input = findViewById<EditText>(R.id.postInput)
            val inputText = input.text.toString().trim()
            if(inputText.isNotEmpty()){
                postDao.addPost(inputText)
                finish()
            }


        }
    }
}