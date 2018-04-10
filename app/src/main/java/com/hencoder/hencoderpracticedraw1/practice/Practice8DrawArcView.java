package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Build.VERSION_CODES;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int left = getLeft();
        int right = getRight();
        int top = getTop();
        int bottom = getBottom();
//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        Paint mPaint = new Paint();
        mPaint.setStyle(Style.FILL);
        //弧形
        if (VERSION.SDK_INT >= VERSION_CODES.LOLLIPOP) {
            canvas.drawArc(200, 300, 800, bottom-100, 0, 120, false, mPaint);
            canvas.drawArc(200, 300, 800, bottom-100, -150, 120, true, mPaint);
        } else {
            RectF rectF = new RectF(200, 300, 800, bottom-100);
            canvas.drawArc(rectF, 0, 120, false, mPaint);
            canvas.drawArc(rectF, -150, 120, true, mPaint);
        }


    }
}
