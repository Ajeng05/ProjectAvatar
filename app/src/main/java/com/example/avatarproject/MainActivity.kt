package com.example.avatarproject

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val checkBox = findViewById<CheckBox>(R.id.browcheckBox)
        val checkBox2 = findViewById<CheckBox>(R.id.eyecheckBox2)
        val checkBox3 = findViewById<CheckBox>(R.id.hidungcheckBox3)
        val checkBox4 = findViewById<CheckBox>(R.id.mulutcheckBox4)

        val brow = findViewById<ImageView>(R.id.brown)
        val eyes = findViewById<ImageView>(R.id.eyes)
        val hidung = findViewById<ImageView>(R.id.hidung)
        val mulut = findViewById<ImageView>(R.id.mulut)

        checkBox.setOnCheckedChangeListener { _, isChecked ->
            brow.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }

        // Eye checkbox toggle
        checkBox2.setOnCheckedChangeListener { _, isChecked ->
            eyes.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }

        // Nose checkbox toggle
        checkBox3.setOnCheckedChangeListener { _, isChecked ->
            hidung.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }

        // Mouth checkbox toggle
        checkBox4.setOnCheckedChangeListener { _, isChecked ->
            mulut.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }
    }
}