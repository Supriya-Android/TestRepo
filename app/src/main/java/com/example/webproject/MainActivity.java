package com.example.webproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.Button;
import android.widget.EditText;

import com.example.webviewlibaryay.CromeWebActivity;
import com.example.webviewlibaryay.DefaultWebviewActivity;

public class MainActivity extends AppCompatActivity {

    Button button1, button2;
    EditText url_et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        url_et = findViewById(R.id.url_et);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DefaultWebviewActivity.class).putExtra("url",url_et.getText().toString()));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CromeWebActivity.class).putExtra("url",url_et.getText().toString()));
            }
        });
    }
}