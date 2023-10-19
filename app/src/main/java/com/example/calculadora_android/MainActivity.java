package com.example.calculadora_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText firstNumberEditText, secondNumberEditText;
    private TextView resultTextView;
    private Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberEditText = findViewById(R.id.firstNumberEditText);
        secondNumberEditText = findViewById(R.id.secondNumberEditText);
        resultTextView = findViewById(R.id.resultTextView);

        calculator = new Calculator();

        Button addButton = findViewById(R.id.addButton);
        Button subtractButton = findViewById(R.id.subtractButton);
        Button multiplyButton = findViewById(R.id.multiplyButton);
        Button divideButton = findViewById(R.id.divideButton);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double primerNumero = Double.parseDouble(firstNumberEditText.getText().toString());
                double segundoNumero = Double.parseDouble(secondNumberEditText.getText().toString());
                double resultado = calculator.sum(primerNumero, segundoNumero);
                resultTextView.setText("Resultado: " + resultado);
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double primerNumero = Double.parseDouble(firstNumberEditText.getText().toString());
                double segundoNumero = Double.parseDouble(secondNumberEditText.getText().toString());
                double resultado = calculator.sub(primerNumero, segundoNumero);
                resultTextView.setText("Resultado: " + resultado);
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double primerNumero = Double.parseDouble(firstNumberEditText.getText().toString());
                double segundoNumero = Double.parseDouble(secondNumberEditText.getText().toString());
                double resultado = calculator.mult(primerNumero, segundoNumero);
                resultTextView.setText("Resultado: " + resultado);
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double primerNumero = Double.parseDouble(firstNumberEditText.getText().toString());
                double segundoNumero = Double.parseDouble(secondNumberEditText.getText().toString());

                if (segundoNumero == 0) {
                    resultTextView.setText("No se puede dividir por 0");
                    return;
                }

                double resultado = calculator.div(primerNumero, segundoNumero);
                resultTextView.setText("Resultado: " + resultado);
            }
        });
    }
}