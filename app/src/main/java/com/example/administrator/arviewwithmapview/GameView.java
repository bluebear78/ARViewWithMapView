package com.example.administrator.arviewwithmapview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;


public class GameView extends View {
    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    protected void onDraw(Canvas canvas) {
        Paint p = new Paint();
        p.setTextSize(60);
        p.setColor(Color.GREEN);
        canvas.drawText("GameView", 300,300, p);
    }
}