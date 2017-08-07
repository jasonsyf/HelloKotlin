package com.jason.hellokotlin

import android.util.Log
import java.net.URI
import java.net.URL

/**
 * Created by jason_sunyf on 2017/8/7.
 * Email:yufeng.sun@21wendao.cn
 */
class Request(val url: String) {
    public fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}