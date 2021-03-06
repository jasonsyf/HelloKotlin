package com.jason.hellokotlin

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.MotionEvent
import android.widget.Switch
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.reflect.Modifier

class MainActivity : AppCompatActivity() {
    private val items = listOf(
            "星期3  0802  暴雨转阴   31/25 ",
            "星期4  0803  暴雨转阴   31/25 ",
            "星期5  0804  暴雨转阴   31/25 ",
            "星期6  0805  暴雨转阴   31/25 ",
            "星期7  0806  暴雨转阴   31/25 ",
            "星期1  0807  暴雨转阴   31/25 ",
            "星期2  0808  暴雨转阴   31/25 "
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()

    }

    private fun initData() {
        val url = ""
        forecast_list.layoutManager = LinearLayoutManager(this)
        forecast_list.adapter = ForecastListAdapter(items)

    }
    fun Context.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, duration).show()

    }
}
