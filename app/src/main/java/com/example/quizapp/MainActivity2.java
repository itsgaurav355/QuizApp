package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
private String questions[]={ "Java is an interpreted language ? ","Java Supports Abstraction ?","Java Supports Interfaces ?","Java is made Using Pythan"};
private boolean answer[]={true,true,true,false};
private int score=0;
Button yes;
Button no;
TextView textView5;
private int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        textView5=findViewById(R.id.textView5);
        textView5.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             if(index <= questions.length-1){
                 if(answer[index]){
                     score++;
                 }
                 index++;
                 if(index <= questions.length-1){
                     textView5.setText(questions[index]);
                 }
                 else{
                     Toast.makeText(MainActivity2.this, "Your Score is:  " +score , Toast.LENGTH_SHORT).show();
                 }
             }else{
                 Toast.makeText(MainActivity2.this, "Restart to play again", Toast.LENGTH_SHORT).show();
             }


            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index <= questions.length-1){
                    if(answer[index]==false){
                        score++;
                    }
                    index++;
                    if(index <= questions.length-1){
                        textView5.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity2.this, "Your Score is:  " +score , Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });
    }

}