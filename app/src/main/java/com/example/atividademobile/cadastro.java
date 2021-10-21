package com.example.atividademobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cadastro extends AppCompatActivity {

    private Button bota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        getSupportActionBar().hide();

        bota = findViewById(R.id.BTN_Voltar);
        bota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cadastro.this,login.class);
                startActivity(intent);
            }
        });

    }
}