package com.example.parcialii;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnIngresar;
    EditText texto1;
    EditText texto2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIngresar = findViewById(R.id.bt1);
        texto1 = findViewById(R.id.txt1);
        texto2 = findViewById(R.id.txt2);


    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto1 = findViewById(R.id.txt1);
        texto2 = findViewById(R.id.txt2);
        btnIngresar = findViewById(R.id.bt1);
        String usuario;
        String contraseña;

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                usuario = (texto1.getText().toString());
                contraseña = (texto2.getText().toString());

                if (usuario == "Carlos" || contraseña == "12345") {
                    Intent pasar = new Intent(MainActivity.this, mapa.class);
                    startActivity(pasar);
                } else {

                }
            }
        };



