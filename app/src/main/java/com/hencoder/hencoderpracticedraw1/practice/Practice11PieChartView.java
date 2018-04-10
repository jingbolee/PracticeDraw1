package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint mPaint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        int left = getLeft();
        int right = getRight();
        int top = getTop();
        int bottom = getBottom();
        mPaint.setAntiAlias(true);

        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(50);
        canvas.drawText("饼图", right / 2, bottom - 30, mPaint);

        mPaint.setTextSize(25);
        canvas.drawText("Lollipop", left + 5, top + 25, mPaint);

        canvas.drawText("KitKat", left + 20, bottom - 100, mPaint);

        canvas.drawText("Marshmallow", right - 290, top + 104, mPaint);

        canvas.drawText("Froyo", right - 290, top + 327, mPaint);

        canvas.drawText("Gingerbread", right - 290, top + 377, mPaint);

        canvas.drawText("Ice Cream Sandwich", right - 290, top + 427, mPaint);

        canvas.drawText("Jelly Bean", right - 290, top + 557, mPaint);

        mPaint.reset();
        mPaint.setColor(Color.WHITE);
        mPaint.setStyle(Style.STROKE);
        mPaint.setStrokeWidth(3);

        Path mPath = new Path();
        mPath.moveTo(left + 100, top + 25);
        mPath.lineTo(left + 200, top + 25);
        mPath.lineTo(left + 250, top + 50);
        canvas.drawPath(mPath, mPaint);

        mPath.moveTo(left + 100, bottom - 100);
        mPath.lineTo(left + 200, bottom - 100);
        mPath.lineTo(left + 250, bottom - 160);
        canvas.drawPath(mPath, mPaint);

        mPath.moveTo(right - 300, top + 105);
        mPath.lineTo(right - 400, top + 105);
        mPath.lineTo(right - 430, top + 160);
        canvas.drawPath(mPath, mPaint);

        mPath.moveTo(right - 300, top + 320);
        mPath.lineTo(right - 400, top + 320);
        canvas.drawPath(mPath, mPaint);

        mPath.moveTo(right - 300, top + 370);
        mPath.lineTo(right - 350, top + 370);
        mPath.lineTo(right - 420, top + 330);
        canvas.drawPath(mPath, mPaint);

        mPath.moveTo(right - 300, top + 420);
        mPath.lineTo(right - 360, top + 420);
        mPath.lineTo(right - 420, top + 380);
        canvas.drawPath(mPath, mPaint);

        mPath.moveTo(right - 300, top + 550);
        mPath.lineTo(right - 420, top + 550);
        mPath.lineTo(right - 470, top + 500);
        canvas.drawPath(mPath, mPaint);

        mPaint.reset();
        mPaint.setStyle(Style.FILL);
        mPaint.setColor(Color.RED);
        RectF rectF = new RectF(120, 1, 700, 591);
        canvas.drawArc(rectF, 180, 140, true, mPaint);

        mPaint.setColor(Color.parseColor("#FCAF17"));
        RectF rectF1 = new RectF(130, 20, 710, 610);
        canvas.drawArc(rectF1, 320, 39, true, mPaint);

        mPaint.setColor(Color.parseColor("#8B008B"));
        canvas.drawArc(rectF1, 1, 9, true, mPaint);

        mPaint.setColor(Color.parseColor("#A9A9A9"));
        canvas.drawArc(rectF1, 12, 7, true, mPaint);

        mPaint.setColor(Color.parseColor("#007D65"));
        canvas.drawArc(rectF1, 21, 50, true, mPaint);

        mPaint.setColor(Color.BLUE);
        canvas.drawArc(rectF1, 73, 107, true, mPaint);
    }
}
