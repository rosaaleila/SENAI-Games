package com.example.senai_games

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        var botaoNav = findViewById<Button>(R.id.navegar2)

        val intent = Intent(this, ViewActivity::class.java)

        botaoNav.setOnClickListener() {
            startActivity(intent)
        }


    }
}