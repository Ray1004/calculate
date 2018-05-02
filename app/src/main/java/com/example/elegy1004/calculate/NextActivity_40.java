package com.example.elegy1004.calculate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class NextActivity_40 extends Activity {
    /** Called when the activity is first created. */
    private Button mButton;
    private TextView mTextView01;
    private TextView mTextView02;
    private TextView mTextView03;
    private double s;
    private double an;
    private double am;
    private double ax;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainnext07);
        Bundle bun = this.getIntent().getExtras();
        s = bun.getDouble("s");
        mTextView01 = (TextView) findViewById(R.id.Test45);
        mTextView02 = (TextView) findViewById(R.id.Test46);
        mTextView03 = (TextView) findViewById(R.id.Test47);
        an = s * 1000000;
        String v = s + "立方米" + "=" + an + "立方厘米";
        mTextView01.setText(v);
        am = s * 1000000;
        v = s + "立方米" + "=" + am + "毫升";
        mTextView02.setText(v);
        ax = s * 1000;
        v = s + "立方米" + "=" + ax + "升";
        mTextView03.setText(v);

        mButton = (Button) findViewById(R.id.button45);
        mButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(NextActivity_40.this, NextActivity_04.class);
                startActivity(intent);
                NextActivity_40.this.finish();
            }
        });

    }
}