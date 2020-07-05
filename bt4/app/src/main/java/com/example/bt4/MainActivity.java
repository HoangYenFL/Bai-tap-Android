package com.example.bt4;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity<ContactAdapter, Contact> extends AppCompatActivity {
    private List<Contact> arrayContact;
    private ContactAdapter adapter;
    private EditText edtname;
    private EditText edtnuber;
    private RadioButton rbtnnam;
    private RadioButton rbtnnu;
    private Button btnthem;
    private ListView lvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setWidget();
        arrayContact = (List<Contact>) new ArrayList<>();
        adapter= new ContactAdapter(this,R.layout.item_contact_listview,arrayContact);
        lvContact.setAdapter((ListAdapter) adapter);
    }
    public void setWidget(){
        edtname=(EditText) findViewById(R.id.edt_ht);
        edtnuber=(EditText) findViewById(R.id.edt_sdt);
        rbtnnam=(RadioButton) findViewById(R.id.rbtn_nam);
        rbtnnu=(RadioButton) findViewById(R.id.rbtn_nu);
        btnthem=(Button) findViewById(R.id.btnthem);
        lvContact=(ListView) findViewById(R.id.lv_contact);

    }
    public void addContact(View view){
        if (view.getId()==R.id.btnthem){
            String name=edtname.getText().toString().trim();
            String number=edtnuber.getText().toString().trim();
            boolean isnnam=true;
            if(rbtnnam.isChecked())
            {
                isnnam= true;
            } else
            {
                isnnam= false;
            }
            if(TextUtils.isEmpty(name)|| TextUtils.isEmpty(number)){
                Toast.makeText(this,"Vui lòng nhập tên và số điện thoại",Toast.LENGTH_SHORT).show();
            }else {

                Contact contact = new Contact(name, isnnam, number);
                arrayContact.add(contact);
            }
            adapter.notify();

        }
    }
    }

