package com.example.jeremy.sudokuv01;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

public class GrilleSudoku extends Activity {
    Dessin drawView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grille_sudoku);
        drawView = (Dessin) findViewById(R.id.dessin);
        //drawView.setBackgroundColor(Color.WHITE);
        //setContentView(drawView);
    }
}