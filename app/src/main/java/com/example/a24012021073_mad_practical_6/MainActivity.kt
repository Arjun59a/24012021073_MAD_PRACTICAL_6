package com.example.a24012021073_mad_practical_6

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.animation.Animation
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), Animation.AnimationListener {
    lateinit var alarmlogo : ImageView
    lateinit var alarmanimation : AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        alarmlogo = findViewById<ImageView>(R.id.imglogo1)
        alarmlogo.setBackgroundResource(R.drawable.alarm_animation)
        alarmanimation = alarmlogo.background as AnimationDrawable



    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus)
        {
            alarmanimation.start()
        }
        else
        {
            alarmanimation.stop()
        }
    }

    override fun onAnimationEnd(animation: Animation?) {

    }

    override fun onAnimationRepeat(animation: Animation?) {

    }

    override fun onAnimationStart(animation: Animation?) {

    }
}