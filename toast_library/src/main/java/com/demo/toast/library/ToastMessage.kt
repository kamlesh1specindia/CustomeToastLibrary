package com.demo.toast.library

import android.content.Context
import android.widget.Toast

class ToastMessage {
    companion object {
        fun getToastMessage(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }
}