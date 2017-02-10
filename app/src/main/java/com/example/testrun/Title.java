package com.example.testrun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Title extends AppCompatActivity {

    Button single;
    Button multi;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

     single = (Button) findViewById(R.id.single);
     multi = (Button) findViewById(R.id.multi);
     tv = (TextView) findViewById(R.id.title);

        single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Title.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}