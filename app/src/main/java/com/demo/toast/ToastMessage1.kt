package com.demo.toast

import android.content.Context
import android.widget.Toast

class ToastMessage1 {
    companion object {
        fun showToast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }
}