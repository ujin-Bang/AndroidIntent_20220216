package com.app40.androidintent_20220216

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDial.setOnClickListener {

            val inputPhonNum = edtPhonNum.text.toString()

//            Intent에 어디로 전화를 걸지 알려줘야 함. Uri를 이용해서 알려주자
            val myUri = Uri.parse("tel:${inputPhonNum}") //띄어쓰기는 하면 앱이 죽음.

            val myIntent = Intent(Intent.ACTION_DIAL,myUri)
            startActivity(myIntent)

        }
    }
}