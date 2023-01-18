package com.example.lab10p01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {

    GestureDetector detektorGestow;
    TextView licznik;
    double wartosc =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        detektorGestow = new GestureDetector(this, this );
        licznik = findViewById(R.id.licznik);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        detektorGestow.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
//        String s="";
//        s+=Math.round(e1.getX())+ " " + Math.round(e1.getY())+ "\n\n";
//        s+=Math.round(e2.getX())+ " " + Math.round(e2.getY())+ "\n\n";
//        s+=Math.round(distanceX)+ " " + Math.round(distanceY);
        if(distanceY>0) wartosc+=0.25;
        if (distanceY<0) wartosc-=0.25;
        licznik.setText(String.valueOf(Math.round(wartosc)));
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
}