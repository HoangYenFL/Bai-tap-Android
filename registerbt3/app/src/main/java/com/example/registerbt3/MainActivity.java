package com.example.registerbt3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView thongtin;
    EditText name,nickname;
    CheckBox viet, han, my;
    Switch chon;
    Button dangki;
    ToggleButton bat;
    ImageButton thoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.etName);
        nickname = (EditText) findViewById(R.id.ednickname);
        viet = (CheckBox) findViewById(R.id.cbhobby1);
        han = (CheckBox) findViewById(R.id.cbhobby2);
        my = (CheckBox) findViewById(R.id.cbhobby3);
        chon = (Switch) findViewById(R.id.swhonnhan);
        dangki = (Button) findViewById(R.id.btnregister);
        bat = (ToggleButton) findViewById(R.id.btnhien);
        thoat = (ImageButton) findViewById(R.id.btnthoat);
        thongtin= (TextView) findViewById(R.id.txttieude);
        dangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Check();
            }
        });
        bat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggle();
            }
        });
        thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("");
                nickname.setText("");
                Toast.makeText(MainActivity.this, "Bạn hãy đăng kí", Toast.LENGTH_LONG).show();
            }
        });
    }
    public void Check() {
        if (name.getText().toString().equals("") && nickname.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this, "Bạn nhập thiếu", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(MainActivity.this, "Đăng kí thành công", Toast.LENGTH_LONG).show();
        }
    }
    public void toggle()
    {
        boolean check= bat.isChecked();
        if(check)
        {
            thongtin.setText("Họ và tên: "+ name.getText()+"\n Biệt danh: "+ nickname.getText()+"\n Thích nhạc: "+ checkboxhobby()+ "\n Chọn này đi: "+ttchon());
            thongtin.setTextColor(Color.BLUE);
            thongtin.setTextSize(14);
        }
        else
        {
            thongtin.setText("Register");
            thongtin.setTextColor(Color.BLUE);
            thongtin.setTextSize(36);
        }
    }
    public String checkboxhobby()
    {
        String hobby="";
        if(viet.isChecked())
        {
            hobby+=viet.getText();
        }
        if(han.isChecked())
        {
            hobby+=","+han.getText();
        }
        if(my.isChecked())
        {
            hobby+=","+my.getText();
        }
        return hobby;
    }
    public String ttchon()
    {
        String tt="";
        boolean b= chon.isChecked();
        if(b)
            tt="Đã chọn";
        else
            tt="chọn rồi nè";

        return tt;
    }
    }

