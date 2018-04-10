package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Build.VERSION_CODES;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice5DrawOvalView extends View {

    public Practice5DrawOvalView(Context context) {
        super(context);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawOval() 方法画椭圆
        int left = getLeft();
        int right = getRight();
        int top = getTop();
        int bottom = getBottom();

        Paint mPaint = new Paint();
        if (VERSION.SDK_INT >= VERSION_CODES.LOLLIPOP) {
            canvas.drawOval(right / 2 - 300, bottom / 2 - 200, right / 2 + 300, bottom / 2 + 200, mPaint);
        } else {
            RectF rect = new RectF(right / 2 - 300, bottom / 2 - 200, right / 2 + 300, bottom / 2 + 200);
            canvas.drawOval(rect, mPaint);
        }
    }
}
