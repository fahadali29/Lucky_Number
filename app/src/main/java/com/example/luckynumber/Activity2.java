package com.example.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Activity2 extends AppCompatActivity {
    TextView rendom;
    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        rendom = findViewById(R.id.textView3);
        share = findViewById(R.id.button);
        Intent intent = getIntent();
        String input = intent.getStringExtra("Name");
        rendom.setText("" + rendom());

    }
    public int rendom(){
        Random random = new Random();
        int uperrlimit = 1000;
        int rendomgenerte = random.nextInt(uperrlimit);
        return rendomgenerte;
    }
}
