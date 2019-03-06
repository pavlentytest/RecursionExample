package com.samsung.myitschool.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyDraw extends View {

    Paint p = new Paint();
    int w,h;

    public MyDraw(Context context) {
        super(context);
        p = new Paint();
        p.setColor(Color.RED);
        p.setStyle(Paint.Style.STROKE);
        p.setStrokeWidth(3);
    }

    @Override
    protected void onDraw(Canvas c) {
        drawCircles(c,w/2,h/2, 200);
    }

    public void drawCircles(Canvas c, int x, int y, int r) {
        c.drawCircle(x,y,r,p);
        if(r > 10) {
            drawCircles(c, x, y-r,r/2);
            drawCircles(c, x+r, y,r/2);
            drawCircles(c, x, y+r,r/2);
            drawCircles(c, x-r, y,r/2);
        }
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        this.w = w;
        this.h = h;
    }
}