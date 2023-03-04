package com.yogadimas.indonesianfauna.utility

import android.content.Context
import com.yogadimas.indonesianfauna.R

class Utility(val context: Context) {
    fun formatData(string: String?): String {
        return String.format(context.resources.getString(R.string.colon, string))
    }
}