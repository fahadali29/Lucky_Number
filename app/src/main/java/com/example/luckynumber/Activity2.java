package com.example.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
        int result = rendom();
        rendom.setText("" + result);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShareResult(input , result);
            }
        });

    }
    public int rendom(){
        Random random = new Random();
        int uperrlimit = 1000;
        int rendomgenerte = random.nextInt(uperrlimit);
        return rendomgenerte;
    }
    public void ShareResult(String input , int result ){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT , input + " got lucky today" );
        intent.putExtra(Intent.EXTRA_TEXT , "His lucky number is " + result);
        startActivity(Intent.createChooser(intent , "Choose a platform"));
    }
}
