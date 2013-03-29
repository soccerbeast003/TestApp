package com.example.TestApp;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final Button button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                button.setVisibility(View.INVISIBLE);
            }
        });
    }
}
