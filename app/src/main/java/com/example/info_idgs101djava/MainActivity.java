package com.example.info_idgs101djava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText etNombres, etPrimerApellido, etSegundoApellido, etEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vincular los elementos del XML al código
        etNombres = findViewById(R.id.etNombres);
        etPrimerApellido = findViewById(R.id.etPrimerApellido);
        etSegundoApellido = findViewById(R.id.etSegundoApellido);
        etEdad = findViewById(R.id.etEdad);
        Button btnEnviar = findViewById(R.id.btnEnviar);

        // Configurar el evento del botón
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarAlerta();
            }
        });
    }

    private void mostrarAlerta() {
        String nombres = etNombres.getText().toString();
        String primerApellido = etPrimerApellido.getText().toString();
        String segundoApellido = etSegundoApellido.getText().toString();
        String edad = etEdad.getText().toString();

        String mensaje = "Nombre: " + nombres +
                "\nPrimer Apellido: " + primerApellido +
                "\nSegundo Apellido: " + segundoApellido +
                "\nEdad: " + edad;

        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
    }
}