package com.generation.dadosdasorte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // findViewById(id)

        val buttonD6 = findViewById<Button>(R. id.buttonD6)

        buttonD6.setOnClickListener {
            number(6)
        }

        val buttonD12 = findViewById<Button>(R. id.buttonD12)

        buttonD12.setOnClickListener {
            number(12)
        }

        val buttonD20 = findViewById<Button>(R.id.buttonD20)
        buttonD20.setOnClickListener {
            number(20)
        }

        }

    private fun number(loads: Int) {
        val role = (1..loads).random()

        val textDado = findViewById<TextView>( R .id.numero)

        textDado.text = role.toString()

        val image = findViewById<ImageView>( R .id.imageView)

        when (role){
            1  -> image.setImageResource ( R .drawable.d1)
            2  -> image.setImageResource ( R .drawable.d2)
            3  -> image.setImageResource ( R .drawable.d3)
            4  -> image.setImageResource ( R .drawable.d4)
            5  -> image.setImageResource ( R .drawable.d5)
            6  -> image.setImageResource ( R .drawable.d6)
            7  -> image.setImageResource ( R .drawable.d7)
            8  -> image.setImageResource ( R .drawable.d8)
            9  -> image.setImageResource ( R .drawable.d9)
            10 -> image.setImageResource ( R .drawable.d10)
            11 -> image.setImageResource ( R .drawable.d11)
            12 -> image.setImageResource ( R .drawable.d12)
            13 -> image.setImageResource ( R .drawable.d13)
            14 -> image.setImageResource ( R .drawable.d14)
            15 -> image.setImageResource ( R .drawable.d15)
            16 -> image.setImageResource ( R .drawable.d16)
            17 -> image.setImageResource ( R .drawable.d17)
            18 -> image.setImageResource ( R .drawable.d18)
            19 -> image.setImageResource ( R .drawable.d19)
            20 -> image.setImageResource ( R .drawable.d20)

    }

    }
}