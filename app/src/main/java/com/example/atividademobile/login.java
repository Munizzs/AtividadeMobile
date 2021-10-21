package com.example.atividademobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    private Button botao;
    private Button log;
    private EditText usu;
    private EditText senha;
    private EditText admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        getSupportActionBar().hide();

        botao = findViewById(R.id.BTN_EsqueceuSenha);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(login.this,cadastro.class);
                        startActivity(intent);

            }

        });

        log = findViewById(R.id.BTN_Logar);
        usu = findViewById(R.id.EDT_Email);
        senha = findViewById(R.id.EDT_Senha);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        usu = admin;
        senha = admin;

                if (usu == admin && senha == admin){
                    Toast.makeText(getApplicationContext(), "you have been logged in!",Toast.LENGTH_SHORT).show();
                }else{

                    Toast.makeText(getApplicationContext(), "error when logging in",Toast.LENGTH_SHORT).show();

                }

            }
        });



    }
}