package com.example.healthbuddy

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val introTxt: TextView = findViewById(R.id.IntroText)
        val feverTxt: TextView = findViewById(R.id.FeverTxt)
        val crampTxt: TextView = findViewById(R.id.crampTxt)
        val migTxt: TextView = findViewById(R.id.MigTxt)
        val diTxt: TextView = findViewById(R.id.DiTxt)
        val eyeTxt: TextView = findViewById(R.id.eyeTxt)

        val feverInfoBtn: Button = findViewById(R.id.FeverBt)
        feverInfoBtn.setOnClickListener() {
            introTxt.visibility = View.GONE
            feverTxt.visibility = View.VISIBLE
            crampTxt.visibility = View.GONE
            MigTxt.visibility = View.GONE
            diTxt.visibility = View.GONE
            eyeTxt.visibility = View.GONE
        }

        val crampInfoButton: Button = findViewById(R.id.CrampBt)
        crampInfoButton.setOnClickListener() {
            introTxt.visibility = View.GONE
            crampTxt.visibility = View.VISIBLE
            feverTxt.visibility = View.GONE
            migTxt.visibility = View.GONE
            diTxt.visibility = View.GONE
            eyeTxt.visibility = View.GONE
        }

        val headInfoButton: Button = findViewById(R.id.Headbtn)
        headInfoButton.setOnClickListener() {
            introTxt.visibility = View.GONE
            feverTxt.visibility = View.GONE
            crampTxt.visibility = View.GONE
            migTxt.visibility = View.VISIBLE
            diTxt.visibility = View.GONE
            eyeTxt.visibility = View.GONE
        }

        val stomachInfoButton: Button = findViewById(R.id.StoBt)
        stomachInfoButton.setOnClickListener() {
            introTxt.visibility = View.GONE
            feverTxt.visibility = View.GONE
            crampTxt.visibility = View.GONE
            MigTxt.visibility = View.GONE
            diTxt.visibility = View.VISIBLE
            eyeTxt.visibility = View.GONE
        }

        val eyeInfoButton: Button = findViewById(R.id.eyeBt)
        eyeInfoButton.setOnClickListener() {
            introTxt.visibility = View.GONE
            feverTxt.visibility = View.GONE
            crampTxt.visibility = View.GONE
            MigTxt.visibility = View.GONE
            diTxt.visibility = View.GONE
            eyeTxt.visibility = View.VISIBLE
        }
    }
}