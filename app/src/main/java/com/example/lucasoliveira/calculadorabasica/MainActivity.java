package com.example.lucasoliveira.calculadorabasica;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*; //usada para manipular componentes

public class MainActivity extends AppCompatActivity {

    private EditText vlr1 = (EditText)findViewById(R.id.txtVlr1);
    private EditText vlr2 = (EditText)findViewById(R.id.txtVlr2);
    private EditText vlrresult = (EditText)findViewById(R.id.txtResult);

    private Button somar = (Button)findViewById(R.id.btnSoma);
    private Button dividir = (Button)findViewById(R.id.btnDividir);;
    private Button multiplicar = (Button)findViewById(R.id.btnMultiplica);;
    private Button subtrair = (Button)findViewById(R.id.btnSubtracao);;

    private double num1 = 0;
    private double num2 = 0;
    private double result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
