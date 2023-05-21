package com.example.quizappkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var tvName: TextView = findViewById(R.id.tv_name)
        var tvScore: TextView = findViewById(R.id.tv_score)
        var btnFinish: Button = findViewById(R.id.btn_finish)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)
        val correctAns: Int = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        val totalQuestions: Int = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)

        tvScore.text = "Your score is $correctAns out of $totalQuestions"

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

    }
}