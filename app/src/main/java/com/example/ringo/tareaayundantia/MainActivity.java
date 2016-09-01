package com.example.ringo.tareaayundantia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final LinearLayout lay1= (LinearLayout) findViewById(R.id.fr_layout1);
        final LinearLayout lay2= (LinearLayout) findViewById(R.id.fr_layout2);

        lay2.setVisibility(View.GONE);

        Button btn1 = (Button) findViewById(R.id.fr_button1);
        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                lay2.setVisibility(View.GONE);
                lay1.setVisibility(View.VISIBLE);
            }

        });

        Button btn2 = (Button) findViewById(R.id.fr_button2);
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                lay2.setVisibility(View.VISIBLE);
                lay1.setVisibility(View.GONE);
            }

        });
    }

}
