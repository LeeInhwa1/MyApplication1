package com.example.inhwalee.myapplication1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {
    EditText edit1;
    Button btnToast, btnHomepage;
    RadioButton rdoGinger, rdoIcecream;
    ImageView ivAndroid;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("좀 그럴듯한 앱");

        edit1 = (EditText) findViewById(R.id.edit1);
        btnToast = (Button) findViewById(R.id.btnToast);
        btnHomepage = (Button) findViewById(R.id.btnHomepage);
        rdoGinger = (RadioButton) findViewById(R.id.rdoGinger);
        rdoIcecream = (RadioButton) findViewById(R.id.rdoIcecream);
        ivAndroid = (ImageView) findViewById(R.id.ivAndroid);

        btnToast.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        edit1.getText().toString(), 0).show();
            }
        });

        btnHomepage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(edit1
                        .getText().toString()));
                startActivity(mIntent);
            }
        });

        rdoGinger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ivAndroid.setImageResource(R.mipmap.marshmallow);
            }
        });

        rdoIcecream.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ivAndroid.setImageResource(R.mipmap.nougat);
            }
        });

    }}