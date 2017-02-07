package com.example.jeremy.sudokuv01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    AppCompatActivity lecontext;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lecontext = this;



        Button but = (Button) findViewById(R.id.button1);
        but.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(lecontext,FenetreList.class);
                lecontext.startActivity(intent);
            }
        });

        Button but2 = (Button) findViewById(R.id.button2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lecontext, FenetreList.class);
                lecontext.startActivity(intent);
            }
        });
        Button but3 = (Button) findViewById(R.id.button3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lecontext, FenetreList.class);
                lecontext.startActivity(intent);
            }
        });
    }
}