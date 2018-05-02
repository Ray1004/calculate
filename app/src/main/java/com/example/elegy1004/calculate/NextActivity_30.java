package com.example.elegy1004.calculate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class NextActivity_30 extends Activity {
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
        setContentView(R.layout.mainnext05);
        Bundle bun = this.getIntent().getExtras();
        s = bun.getDouble("s");
        mTextView01 = (TextView) findViewById(R.id.Test35);
        mTextView02 = (TextView) findViewById(R.id.Test36);
        mTextView03 = (TextView) findViewById(R.id.Test37);
        an = s * 1000000;
        String v = s + "平方米" + "=" + an + "平方毫米";
        mTextView01.setText(v);
        am = s * 10000;
        v = s + "平方米" + "=" + am + "平方厘米";
        mTextView02.setText(v);
        ax = s / 1000000;
        v = s + "平方米" + "=" + ax + "平方公里";
        mTextView03.setText(v);

        mButton = (Button) findViewById(R.id.button35);
        mButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(NextActivity_30.this, NextActivity_02.class);
                startActivity(intent);
                NextActivity_30.this.finish();
            }
        });

    }
}