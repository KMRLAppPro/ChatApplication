package com.example.chatapplication

import android.app.DatePickerDialog
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MeetingMD : AppCompatActivity() {

    lateinit var pickDateBtn: Button
    lateinit var selectedDateTV: TextView
    lateinit var st1: Button
    lateinit var st2: Button
    lateinit var st3: Button
    lateinit var st4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meeting_md)

        st1 = findViewById(R.id.time_option1)
        st2 = findViewById(R.id.time_option2)
        st3 = findViewById(R.id.time_option3)
        pickDateBtn = findViewById(R.id.idBtnPickDate)
        selectedDateTV = findViewById(R.id.idTVSelectedDate)

        st1.setOnClickListener {
            st1.setBackgroundColor(Color.parseColor("#D2D2D2"))
        }
        st2.setOnClickListener {
            st2.setBackgroundColor(Color.parseColor("#D2D2D2"))
        }
        st3.setOnClickListener {
            st3.setBackgroundColor(Color.parseColor("#D2D2D2"))
        }

        pickDateBtn.setOnClickListener {
            val c = Calendar.getInstance()

            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)
            val datePickerDialog = DatePickerDialog(
                this,
                {
                    view, year, monthOfYear, dayOfMonth ->
                    selectedDateTV.text =
                        (dayOfMonth.toString() + "-" + (monthOfYear+1) + "-" +year)
                },
                year,
                month,
                day
            )
            datePickerDialog.show()
        }
    }
}