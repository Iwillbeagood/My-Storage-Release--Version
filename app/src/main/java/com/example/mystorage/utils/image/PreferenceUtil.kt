package com.example.mystorage.utils.image

import android.content.Context
import android.content.SharedPreferences

class PreferenceUtil(private val context: Context) {
    private val prefs: SharedPreferences =
        context.getSharedPreferences("prefs_name", Context.MODE_PRIVATE)

    fun getString(key: String, defValue: String): String {
        return prefs.getString(key, defValue).toString()
    }

    fun setString(key: String, str: String) {
        prefs.edit().putString(key, str).apply()
    }
    fun removeString(key: String) {
        prefs.edit().remove(key).apply()
    }
}