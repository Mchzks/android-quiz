package com.example.quizgame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;
    TextView score, questions;

    private Questions myQuestions = new Questions();

    private String myAnswer;
    private int myScore = 0;
    private int myQuestionsLength = myQuestions.myQuestions.length;

    Random r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        answer1 = (Button)findViewById(R.id.answer1);
        answer2 = (Button)findViewById(R.id.answer2);
        answer3 = (Button)findViewById(R.id.answer3);
        answer4 = (Button)findViewById(R.id.answer4);

        score = (TextView)findViewById(R.id.score);
        questions = (TextView)findViewById(R.id.questions);

        updateQuestion(r.nextInt(myQuestionsLength));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.getText()==myAnswer){
                    myScore++;
                    score.setText("Score: " + myScore);
                    updateQuestion(r.nextInt(myQuestionsLength));
                } else {
                    gameOver();
                }
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer2.getText()==myAnswer){
                    myScore++;
                    score.setText("Score: " + myScore);
                    updateQuestion(r.nextInt(myQuestionsLength));
                } else {
                    gameOver();
                }
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer3.getText()==myAnswer){
                    myScore++;
                    score.setText("Score: " + myScore);
                    updateQuestion(r.nextInt(myQuestionsLength));
                } else {
                    gameOver();
                }
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer4.getText()==myAnswer){
                    myScore++;
                    score.setText("Score: " + myScore);
                    updateQuestion(r.nextInt(myQuestionsLength));
                } else {
                    gameOver();
                }
            }
        });
    }

    private void updateQuestion(int num) {
        questions.setText(myQuestions.getQuestion(num));
        answer1.setText(myQuestions.getChoice1(num));
        answer2.setText(myQuestions.getChoice2(num));
        answer3.setText(myQuestions.getChoice3(num));
        answer4.setText(myQuestions.getChoice4(num));

        myAnswer = myQuestions.getCorrectAnswer(num);
    }

    private void gameOver() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setMessage("Game over! Your score is" + myScore + "points").setCancelable(false).setPositiveButton("NEW GAME", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }).setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}