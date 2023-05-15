package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonLike;
    Button buttonDelete;
    TextView likes;

    int likesAm=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLike =findViewById(R.id.button1);
        buttonDelete = findViewById(R.id.button2);
        likes= findViewById(R.id.textlikes);

        buttonLike.setOnClickListener(view -> {
            likesAm++;
            likes.setText(likesAm + " polubień");
        });
        buttonDelete.setOnClickListener(view -> {
            if(likesAm>0) {
                likesAm--;
                likes.setText(likesAm + " polubień");
            }
        });
    }
}