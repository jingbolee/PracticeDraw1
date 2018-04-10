package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        Paint mPaint = new Paint();
        //1.实心圆
        mPaint.setStyle(Style.FILL);
        canvas.drawCircle(200, 100, 100, mPaint);
        //2.空心圆
        mPaint.setStyle(Style.STROKE);
        canvas.drawCircle(500, 100, 100, mPaint);
        //3.蓝色实心圆
        mPaint.setStyle(Style.FILL);
        mPaint.setColor(Color.BLUE);
        canvas.drawCircle(200, 500, 100, mPaint);
        //4.线宽为 20 的空心圆
        mPaint.setStyle(Style.STROKE);
        mPaint.setStrokeWidth(20);
        canvas.drawCircle(500, 500, 100, mPaint);

    }
}
