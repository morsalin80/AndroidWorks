package com.example.dobcalculatorapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private var tvSelectedDate: TextView? = null
    private var tvDiffInMinutes: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDatePicker: Button = findViewById(R.id.btnDatePicker)
        tvSelectedDate = findViewById(R.id.tvSelectedDate)
        tvDiffInMinutes = findViewById(R.id.tvDiffInMinutes)
        btnDatePicker.setOnClickListener {
            clickDatePicker()
        }
    }
    private fun clickDatePicker(){
        val myCalender = Calendar.getInstance()

        val year = myCalender.get(Calendar.YEAR)
        val month = myCalender.get(Calendar.MONTH)
        val day = myCalender.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog(this, { _, selectedYear, selectedMonth, selectedDayOfMonth ->
                Toast.makeText(
                    this, "Year: $selectedYear Month: ${selectedMonth+1} day: $selectedDayOfMonth",
                    Toast.LENGTH_LONG).show()
                val selectedDate = "$selectedDayOfMonth/${selectedMonth+1}/$selectedYear"
                tvSelectedDate?.text = selectedDate
                val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
                val theDate = sdf.parse(selectedDate)
                theDate.let{
                    val selectedDateInMinutes = theDate.time / 60000

                    val currentDate = sdf.parse(sdf.format(System.currentTimeMillis()))
                    currentDate.let {
                        val currentDateInMinutes =  currentDate.time / 60000

                        val differenceInMinutes = currentDateInMinutes - selectedDateInMinutes
                        var ageInMinutes = "$differenceInMinutes"
                        ageInMinutes = if(differenceInMinutes>1) {
                            "$ageInMinutes minutes"
                        } else {
                            "$ageInMinutes minute"
                        }

                        tvDiffInMinutes?.text = ageInMinutes }

                }

        },
            year,
            month,
            day
        ).show()

    }
}