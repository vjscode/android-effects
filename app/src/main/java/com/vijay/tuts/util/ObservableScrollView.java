package com.vijay.tuts.util;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/**
 * Created by vijay on 11/16/14.
 */
public class ObservableScrollView extends ScrollView {

    public interface ScrollViewListener {

        void onScrollChanged(ScrollView scrollView, int x, int y, int oldx, int oldy);

    }

    private ScrollViewListener scrollViewListener = null;

    public ObservableScrollView(Context context)
    {
        super(context);
    }

    public ObservableScrollView(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
    }

    public ObservableScrollView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public void setScrollViewListener(ScrollViewListener scrollViewListener)
    {
        this.scrollViewListener = scrollViewListener;
    }

    @Override
    protected void onScrollChanged(int x, int y, int oldx, int oldy)
    {
        super.onScrollChanged(x, y, oldx, oldy);

        if (scrollViewListener != null)
        {
            scrollViewListener.onScrollChanged(this, x, y, oldx, oldy);
        }

    }
}
