package com.example.jeremy.sudokuv01;


import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Case {

    protected Integer x;
    protected Integer y;
    protected Integer numeroCase;
    protected char valeur;
    protected int cote;

    public Case(Integer unX, Integer unY, Integer unNumeroCase) {
        x = unX;
        y = unY;
        numeroCase = unNumeroCase;
        cote = 53;
    }

    public void draw(Canvas canvas){
        Paint paint = new Paint();
        paint.setColor(Color.rgb(128, 128, 128));

        canvas.drawRect(x, y, x+cote, y+cote, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1);
        paint.setColor(Color.BLACK);
        canvas.drawRect(x, y, x+cote, y+cote, paint);
        paint.setStyle(Paint.Style.FILL);
        if(numeroCase>0){
            paint.setColor(Color.BLUE);
            paint.setTextSize(40);
            canvas.drawText(""+numeroCase, x+18, y+42, paint);
        }
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }
    public Integer getNumeroCase() {
        return numeroCase;
    }

    public char getValeur() {
        return valeur;
    }

    public void setValeur(char nouvelleValeur) {
        valeur = nouvelleValeur;
    }

    public void setNumeroCase(int nouvelleValeur) {
        numeroCase = nouvelleValeur;
    }
}