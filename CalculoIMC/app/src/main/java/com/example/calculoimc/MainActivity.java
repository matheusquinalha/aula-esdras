package com.example.calculoimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText stringPeso;
    EditText stringAltura;
    TextView resultado;
    Button calcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stringAltura = findViewById(R.id.editTextNumberDecimal);
        stringPeso = findViewById(R.id.editTextNumberDecimal2);
        resultado = findViewById(R.id.txtViewImc);
        calcular = findViewById(R.id.btnCalcular);

    }

    public void btnCalcular(View view){
        double altura = Double.parseDouble(stringAltura.getText().toString());
        double peso = Double.parseDouble(stringPeso.getText().toString());
        double imc = peso / (altura * altura);
        resultado.setText(String.format("%.2f", imc));
        Intent intent1 = new Intent(getApplicationContext(),ImcDetalhesMainActivity.class);
        intent1.putExtra("imc",imc);
        startActivity(intent1);
        }

    }
