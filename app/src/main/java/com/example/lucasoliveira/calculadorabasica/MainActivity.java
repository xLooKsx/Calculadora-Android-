package com.example.lucasoliveira.calculadorabasica;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*; //usada para manipular componentes

public class MainActivity extends AppCompatActivity {

    private EditText vlr1;
    private EditText vlr2;
    private EditText vlrresult;

    private Button somar;
    private Button dividir;
    private Button multiplicar;
    private Button subtrair;

    private double num1 = 0;
    private double num2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vlr1 = (EditText)findViewById(R.id.txtVlr1);
        vlr2 = (EditText)findViewById(R.id.txtVlr2);
        vlrresult = (EditText)findViewById(R.id.txtResult);

        somar = (Button)findViewById(R.id.btnSoma);
        dividir = (Button)findViewById(R.id.btnDividir);
        multiplicar = (Button)findViewById(R.id.btnMultiplica);
        subtrair = (Button)findViewById(R.id.btnSubtracao);

        num1 = 0;
        num2 = 0;

        //Soma
        somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(vlr1.getText().toString());
                num2 = Double.parseDouble(vlr2.getText().toString());
                vlrresult.setText(String.valueOf(num1+num2));
            }
        });

        //Divisão
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(vlr1.getText().toString());
                num2 = Double.parseDouble(vlr2.getText().toString());
                vlrresult.setText(String.valueOf(num1/num2));
            }
        });

        //multiplicacao
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(vlr1.getText().toString());
                num2 = Double.parseDouble(vlr2.getText().toString());
                vlrresult.setText(String.valueOf(num1*num2));
            }
        });

        //Subtracao
        subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.valueOf(vlr1.getText().toString());
                num2 = Double.valueOf(vlr2.getText().toString());
                vlrresult.setText(String.valueOf(num1-num2));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
