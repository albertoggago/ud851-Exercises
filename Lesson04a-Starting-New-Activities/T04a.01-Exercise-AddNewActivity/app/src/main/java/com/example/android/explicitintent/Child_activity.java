package com.example.android.explicitintent;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Child_activity extends AppCompatActivity {

    // Do steps 6 & 7 in ChildActivity.java
    // TODO (6) Create a TextView field to display your message
    // TODO (7) Get a reference to your TextView in Java

    TextView mDisplayText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDisplayText = (TextView) findViewById(R.id.tv_display);
    }

}
