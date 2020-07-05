package com.example.bt3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.icu.text.BreakIterator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.time.ZoneOffset;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.togbtn);
        textView = findViewById(R.id.txttog);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClickButton();
            }
        });
    }

    private void doClickButton() {
        String text = textView.getText().toString().trim();
        textView.setText("Chúc bạn một ngày vui vẻ");
    }
}
