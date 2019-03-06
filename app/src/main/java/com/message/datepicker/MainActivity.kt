package com.message.datepicker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val date = findViewById<DatePicker>(R.id.datePicker) as DatePicker
        val calender: Calendar = Calendar.getInstance()
        date.init(
            calender.get(Calendar.YEAR),
            calender.get(Calendar.MONTH),
            calender.get(Calendar.DAY_OF_MONTH),
            { view, year, month, day ->
                Toast.makeText(this, "${date.year}/${date.month}/05", Toast.LENGTH_LONG).show()
                textView.text="${date.year}/${date.month}/${date.dayOfMonth}"
            })

    }
}
