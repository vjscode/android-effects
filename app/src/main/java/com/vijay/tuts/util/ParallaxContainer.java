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
    }
}