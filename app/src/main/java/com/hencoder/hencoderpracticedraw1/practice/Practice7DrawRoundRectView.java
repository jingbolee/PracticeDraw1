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

public class Practice7DrawRoundRectView extends View {

    public Practice7DrawRoundRectView(Context context) {
        super(context);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int left = getLeft();
        int right = getRight();
        int top = getTop();
        int bottom = getBottom();

//        练习内容：使用 canvas.drawRoundRect() 方法画圆角矩形
        Paint mPaint = new Paint();
        if (VERSION.SDK_INT >= VERSION_CODES.LOLLIPOP) {
            canvas.drawRoundRect(300, 300, 700, bottom-200, 50, 10, mPaint);
        } else {
            RectF rect = new RectF(300, 300, 700, bottom-200);
            canvas.drawRoundRect(rect, 50, 10, mPaint);
        }

    }
}
