package com.tuts.vijay.effects;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.vijay.tuts.util.ObservableScrollView;


public class SimpleParallaxEffect extends Activity implements ObservableScrollView.ScrollViewListener {

    ObservableScrollView scrollView;
    ImageView imgBkg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_parallax_effect);
        scrollView = (ObservableScrollView) findViewById(R.id.obsScrollView);
        scrollView.setScrollViewListener(this);
        imgBkg = (ImageView) findViewById(R.id.bkgImg);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.simple_parallax_effect, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onScrollChanged(ScrollView scrollView, int x, int y, int oldx, int oldy) {
        Log.d("test", "x: " + x + ", y: " + y);
        imgBkg.scrollTo(imgBkg.getScrollX(), y / 2);
    }

    @Override
    public void onScrollStopped() {

    }
}