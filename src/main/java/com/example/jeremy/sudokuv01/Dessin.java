package com.example.jeremy.sudokuv01;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.lang.String;
import java.util.LinkedList;

import android.widget.TextView;

public class Dessin extends View implements View.OnTouchListener{
    LinkedList<Case> cases = new LinkedList<Case>();
    LinkedList<CaseDuBas> casesDuBas = new LinkedList<CaseDuBas>();
    Paint paint = new Paint();
    Paint paint2 = new Paint();
    Paint paint3 = new Paint();
    Paint paint4 = new Paint();
    Paint paint5 = new Paint();
    int x, y, l, L;
    int X, Y;
    String B = new String();
    String C = new String();
    int chiffreStocke = 0;
    int positionGlobaleX = 0;
    int positionGlobaleY = 0;
    boolean firstDraw;



    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int left = (int) event.getX();
        int right = (int) event.getY();
        positionGlobaleX = left;
        positionGlobaleY = right;

        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("message","position" + left + "position" + right);
                if(positionGlobaleY <= 9*53 && positionGlobaleX <= 9*53){
                    int caseSelectionnee = 9*(positionGlobaleY/53)+positionGlobaleX/53;

                    Case macase = cases.get(caseSelectionnee);
                    macase.setNumeroCase(chiffreStocke);
                    int monnum = macase.getNumeroCase();
                    Log.d("mesage", monnum + " " );
                }

                if(positionGlobaleY >= 9*53 && positionGlobaleY <= 10*53 && positionGlobaleX <= 9*53){
                    Log.d("numCase", (positionGlobaleX/53)+"");
                    chiffreStocke = casesDuBas.get(positionGlobaleX/53).getNumeroCase();
                    Log.d("numCase", chiffreStocke+"");
                }
        }

        this.invalidate();
        return true;
    }


    public Dessin(Context context, AttributeSet attrs){
        super(context, attrs);
        this.setOnTouchListener(this);
        firstDraw = true;
    }

    @Override
    public void onDraw(Canvas canvas) {
        paint.setColor(Color.rgb(128, 128, 128));
        paint2.setStrokeWidth(5);
        paint3.setColor(Color.BLUE);
        paint3.setTextSize(40);
        paint4.setColor(Color.WHITE);
        paint5.setColor(Color.BLACK);
        paint5.setTextSize(40);
        canvas.drawColor(Color.rgb(66, 78, 110));

        if (firstDraw) {
            int Var = 0;
            for (int j = 0; j < 9; j++) {

                for (int i = 0; i < 9; i++) {

                    C = "530070000600195000098000060800060003400803001700020006060000280000419005000080079";
                    int first = Character.digit(C.charAt(Var), 10);
                    X = 18 + i * 53;
                    Y = 42 + j * 53;
                    x = 3 + i * 53;
                    y = 3 + j * 53;
                    l = 53 + i * 53;
                    L = 53 + j * 53;
                    Var++;
                    Case casetest = new Case(x, y, first);
                    casetest.draw(canvas);
                    cases.add(casetest);


                }
            }


            int Var2 = 0;
            for (int h = 0; h < 9; h++) {
                B = "123456789";
                int first = Character.digit(B.charAt(Var2), 10);
                X = 18 + h * 53;
                Y = 529;
                x = 3 + h * 53;
                y = 487;
                l = 53 + h * 53;
                L = 537;
                Var2++;

                CaseDuBas caseDuBas = new CaseDuBas(x, y, first);
                caseDuBas.draw(canvas);
                casesDuBas.add(caseDuBas);


                //canvas.drawRect(x, y, l, L, paint4);


                //canvas.drawText(String.valueOf(first2), X, Y, paint5);
            }
            firstDraw = false;
        }else{
            for(Case thisCase : cases){
                thisCase.draw(canvas);
            }

            for(CaseDuBas thisCase : casesDuBas){
                thisCase.draw(canvas);
            }
        }

        canvas.drawLine(3, 160, 480, 160, paint2);
        canvas.drawLine(3, 320, 480, 320, paint2);
        canvas.drawLine(160, 3, 160, 480, paint2);
        canvas.drawLine(320, 3, 320, 480, paint2);

    }



}