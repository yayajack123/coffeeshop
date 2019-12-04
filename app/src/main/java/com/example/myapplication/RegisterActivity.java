package com.example.praktikumprogmob;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    Button regis;
    TextView masuk;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);



        regis = (Button) findViewById(R.id.btnDaftar);
        masuk = (TextView) findViewById(R.id.masuk);

        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegisterActivity.this,SetFotoActivity.class);
                startActivity(i);
            }
        });

        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent masuk = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(masuk);
            }
        });

    }
}
