package com.skylinelin.neterrorview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

/**
 * @author skylinelin
 * @date 2018/2/6
 *
 * */

public class MainActivity extends AppCompatActivity {

    private FrameLayout mFrameLayout;
    private FrameLayout mErrorFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFrameLayout = findViewById(R.id.frame_layout);
        mErrorFrame = findViewById(R.id.error_frome);

        //mFrameLayout.setVisibility(View.GONE);

    }

    @Override
    protected void onResume() {
        super.onResume();
        mErrorFrame.setVisibility(View.GONE);
    }
}
