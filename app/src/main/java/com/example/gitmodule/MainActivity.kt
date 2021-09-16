package com.example.gitmodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mysubmodule.Main

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Main.getName()
    }
}