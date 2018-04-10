package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int left = getLeft();
        int right = getRight();
        int top = getTop();
        int bottom = getBottom();

//        练习内容：使用 canvas.drawPath() 方法画心形
        Paint mPaint = new Paint();

        Path mPath = new Path();
        RectF rectF = new RectF(200, 200, 400, 400);
        RectF rectF1 = new RectF(400, 200, 600, 400);
        mPath.addArc(rectF, 135, 225);
        mPath.arcTo(rectF1, -180, 225,false);
        mPath.lineTo(400, 600);
        canvas.drawPath(mPath, mPaint);

    }
}
