package com.android.bt7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtnumber;
    Button btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnumber = (TextView) findViewById(R.id.txtnumber);
        btnStart = (Button) findViewById(R.id.btnstart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(20000, 1000) {
                    public void onTick(long millisUntilFinished) {
                        txtnumber.setText("" + millisUntilFinished / 1000);
                    }

                    public void onFinish() {
                        Toast.makeText(MainActivity.this, "hoàn thành", Toast.LENGTH_SHORT).show();
                    }
                }.start();
            }
        });
    }
}