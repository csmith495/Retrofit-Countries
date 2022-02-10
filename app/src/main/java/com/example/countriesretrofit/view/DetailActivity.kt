package com.example.countriesretrofit.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.countriesretrofit.R
import com.example.countriesretrofit.util.getProgressDrawable
import com.example.countriesretrofit.util.loadImage

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvName: TextView = findViewById(R.id.tvCountryName)
        val tvCapital : TextView = findViewById(R.id.tvCountryCaptial)
        val ivFlag : ImageView = findViewById(R.id.ivDetail)

        val progressDrawable = getProgressDrawable(this)

        val bundle : Bundle? = intent.extras
        val name = bundle!!.getString("Country")
        val capital = bundle!!.getString("Capital")
        val flag = bundle!!.getString("Flag")

        tvName.text = name
        tvCapital.text = capital
        ivFlag.loadImage(flag, progressDrawable)
    }
}