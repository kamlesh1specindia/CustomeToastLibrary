package com.demo.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.demo.toast.library.ToastMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        ToastMessage1.showToast(this, "sdasdsd")
        ToastMessage.getToastMessage(this, "Just for testing!")
    }

}