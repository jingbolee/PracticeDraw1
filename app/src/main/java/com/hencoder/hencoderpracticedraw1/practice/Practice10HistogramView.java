package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint mPaint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        int right = getRight();
        int bottom = getBottom();
        int left = getLeft();
        int top = getTop();

        mPaint.setStrokeWidth(3);
        mPaint.setColor(Color.WHITE);

        canvas.drawLine(100, 50, 100, bottom - 200, mPaint);
        canvas.drawLine(100, bottom - 200, right - 100, bottom - 200, mPaint);
        mPaint.setTextSize(50);
        canvas.drawText("直方图", right / 2 - 100, bottom - 50, mPaint);

        drawRectAndText(canvas, 120, bottom - 202, 220, bottom - 200, "Froyo");
        drawRectAndText(canvas, 240, bottom - 220, 340, bottom - 200, "GB");
        drawRectAndText(canvas, 360, bottom - 230, 460, bottom - 200, "ICS");
        drawRectAndText(canvas, 480, bottom - 360, 580, bottom - 200, "JB");
        drawRectAndText(canvas, 600, bottom - 490, 700, bottom - 200, "KitKat");
        drawRectAndText(canvas, 720, bottom - 650, 820, bottom - 200, "L");
        drawRectAndText(canvas, 840, bottom - 340, 940, bottom - 200, "M");

    }

    private void drawRectAndText(Canvas canvas, int left, int top, int right, int bottom, String text) {
        mPaint.setColor(Color.GREEN);
        Rect rect = new Rect(left, top, right, bottom);
        canvas.drawRect(rect, mPaint);
        mPaint.setTextSize(20);
        mPaint.setColor(Color.WHITE);
        canvas.drawText(text, left + 20, bottom + 20, mPaint);
    }
}
