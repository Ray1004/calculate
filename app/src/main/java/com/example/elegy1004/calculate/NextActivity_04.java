package com.example.elegy1004.calculate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NextActivity_04 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainnext06);
        Button en = (Button) findViewById(R.id.button40);
        Button back = (Button) findViewById(R.id.button41);
        en.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                EditText et = (EditText) findViewById(R.id.edit40);
                double s = Double.parseDouble(et.getText().toString());
                Intent intent = new Intent();
                intent.setClass(NextActivity_04.this, NextActivity_40.class);

                Bundle bundle = new Bundle();
                bundle.putDouble("s", s);

                intent.putExtras(bundle);

                startActivity(intent);
                NextActivity_04.this.finish();
            }
        });
        back.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(NextActivity_04.this, danwei.class);
                startActivity(intent);
                NextActivity_04.this.finish();
            }
        });

    }
}