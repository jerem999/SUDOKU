package com.example.jeremy.sudokuv01;


import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class CaseDuBas extends Case {

    public CaseDuBas(Integer unX, Integer unY, Integer unNumeroCase) {
        super(unX, unY, unNumeroCase);
    }

    public void draw(Canvas canvas){
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);

        canvas.drawRect(x, y, x+cote, y+cote, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1);
        paint.setColor(Color.BLACK);
        canvas.drawRect(x, y, x+cote, y+cote, paint);
        paint.setStyle(Paint.Style.FILL);
        if(numeroCase>0){
            paint.setColor(Color.BLACK);
            paint.setTextSize(40);
            canvas.drawText(""+numeroCase, x+18, y+42, paint);
        }
    }
}
