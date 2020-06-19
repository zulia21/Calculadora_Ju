package com.example.calculadora;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView result;
    Button btnSoma;
    Button btnSubtracao;
    Button btnDivisao;
    Button btnMultiplicacao;

    int n1,n2,soma;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        result = (TextView) findViewById(R.id.resultado);
        btnSoma = (Button) findViewById(R.id.btnSoma);
        btnSubtracao = (Button) findViewById(R.id.btnSubtracao);
        btnDivisao = (Button) findViewById(R.id.btnDivisao);
        btnMultiplicacao = (Button) findViewById(R.id.btnMultiplicacao);
    }

    public void Somar(View view){
        try {
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());
            if (n1 > 0 && n2 > 0) {
                soma = n1 + n2;
                result.setText(Integer.toString(soma));
            }
        }
        catch(NumberFormatException e)
        {
            result.setText("Esse valor é inválido");
        }


    }
    public void Subtrair(View view){
        try {
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());
            if (n1 > 0 && n2 > 0) {
                soma = n1 - n2;
                result.setText(Integer.toString(soma));
            }
        }
        catch (NumberFormatException e)
        {
            result.setText("Esse valor é inválido");
        }

    }
    public void Dividir(View view){
        try {
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());
            if (n1 > 0 && n2 > 0) {
                soma = n1 / n2;
                result.setText(Integer.toString(soma));
            }
        }
        catch(NumberFormatException e)
        {
            result.setText("Esse valor é inválido");
        }



    }
    public void Multiplicar(View view) {
        try {
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());
            if (n1 > 0 && n2 > 0) {
                soma = n1 * n2;
                result.setText(Integer.toString(soma));
            }
        }
        catch (NumberFormatException e)
        {
            result.setText("Esse valor é inválido");
        }


    }
}
