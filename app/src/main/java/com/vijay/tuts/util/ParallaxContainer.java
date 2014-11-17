package com.vijay.tuts.util;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by vijay on 11/16/14.
 */
public class ParallaxContainer extends LinearLayout {

    Context context;
    public ParallaxContainer(Context context) {
        super(context);
        this.context = context;
    }

    public ParallaxContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        /*View content = getChildAt(0);
        int childWidth = content.getMeasuredWidth();
        int childHeight = content.getMeasuredHeight();

        Log.d("test", "height: " + getMeasuredHeight() +
            "pheight..: " + ((View)getParent()).getMeasuredHeight());
        int pHeight = ((View)getParent()).getMeasuredHeight();
        //content.layout(l, (pHeight - childHeight), r, childHeight);
        setChildFrame(content, l, (pHeight  - 300), childWidth, childHeight);

        Log.d("test", "bottom: " + content.getBottom());
        setMinimumHeight(content.getBottom());*/
    }

    private void setChildFrame(View child, int left, int top, int width, int height) {
        Log.d("test", "left: " + left
                     + "top: " + top
                     + "right: " + (left+width)
                     + "height.: " + (top+height)) ;
        child.layout(left, top, left + width, top + height);
    }
}