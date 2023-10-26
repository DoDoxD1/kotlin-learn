package com.techbonkers.msgshareapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showMsgBtn = findViewById<Button>(R.id.showMsgBtn);
        showMsgBtn.setOnClickListener{
            Toast.makeText(this,"hi",Toast.LENGTH_SHORT).show()
             Log.i("aunu","Button is Clicked")
//            this is arihant branch
        }

    }
}