package com.example.senai_games

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        var botaoNav = findViewById<Button>(R.id.navegar3)

        val intent = Intent(this, SearchActivity::class.java)

        botaoNav.setOnClickListener() {
            startActivity(intent)
        }

    }
}