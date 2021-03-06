package com.example.bmi

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_about_me.*

class AboutMe : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation= ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        setContentView(R.layout.activity_about_me)

        setSupportActionBar(toolbar2)

        switch_color.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                layout.setBackgroundColor(ContextCompat.getColor(this,R.color.BLUE))
                scroll_back.setBackgroundColor(ContextCompat.getColor(this,R.color.BLUE))


            } else {
                layout.setBackgroundColor(ContextCompat.getColor(this,R.color.WHITE))
                scroll_back.setBackgroundColor(ContextCompat.getColor(this,R.color.WHITE))

            }
        }

    }

    fun onClick(view: View?){
      after_click_view.append(getString(R.string.aboutMe_text))
    }


}

