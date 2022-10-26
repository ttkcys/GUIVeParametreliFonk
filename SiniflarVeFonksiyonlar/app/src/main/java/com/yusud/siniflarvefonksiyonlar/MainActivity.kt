package com.yusud.siniflarvefonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cikarmaIslemi(40,25)
    }

    fun cikarmaIslemi(x: Int, y: Int){
        textSonuc.text = "Sonuç: ${x-y}"
    }

}