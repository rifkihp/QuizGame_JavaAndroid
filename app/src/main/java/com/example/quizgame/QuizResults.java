package com.example.quizgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class QuizResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        final AppCompatButton startNewBtn = findViewById(R.id.startNewQuizBtn);
        final TextView correctAnswer = findViewById(R.id.correctAnswers);
        final TextView incorrectAnswer = findViewById(R.id.inCorrectAnswer);
        final ImageView endQuizImage = findViewById(R.id.congrats);
        final TextView successOrFailure = findViewById(R.id.success);

        final int getCorrectAnswers = getIntent().getIntExtra("correct", 0);
        final int getIncorrectAnswers = getIntent().getIntExtra("incorrect", 0);

        correctAnswer.setText("Correct Answers : "+getCorrectAnswers);
        incorrectAnswer.setText("Wrong Answers : "+getIncorrectAnswers);

        if (getIncorrectAnswers > getCorrectAnswers) {
            endQuizImage.setImageResource(R.drawable.loser);
            successOrFailure.setText("You've failed to complete the quiz!");
        } else {
            endQuizImage.setImageResource(R.drawable.congratulations);
            successOrFailure.setText("You've successfully completed the quiz!");
        }

        startNewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizResults.this, MainActivity.class));
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(QuizResults.this, MainActivity.class));
        finish();
    }
}