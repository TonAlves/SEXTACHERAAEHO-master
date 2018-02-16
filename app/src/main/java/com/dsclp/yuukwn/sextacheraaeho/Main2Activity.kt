package com.dsclp.yuukwn.sextacheraaeho

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Main2Activity : AppCompatActivity() {

    val TEMPO_SPLASH = 3500L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        carregar()
    }

    fun carregar() {

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        },TEMPO_SPLASH)
    }
}




