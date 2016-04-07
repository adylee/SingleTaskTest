package com.example.administrator.singletasktest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/4/7.
 */
public class SecondActivity extends AppCompatActivity {
    @Override
    protected  void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        setContentView(linearLayout);
        TextView tv = new TextView(this);
        tv.setText("Acitivity is:"+this.toString()
                  +"\n"+", Task ID is:"+this.getTaskId());
        Button btn = new Button(this);
        btn.setText("start mainactivity");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        linearLayout.addView(tv);
        linearLayout.addView(btn);

    }
}
