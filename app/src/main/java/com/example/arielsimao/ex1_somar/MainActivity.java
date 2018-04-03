package com.example.arielsimao.ex1_somar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        num1 = (EditText) findViewById(R.id.editTextN1);
        num2 = (EditText) findViewById(R.id.editTextN2);
        result = (TextView) findViewById(R.id.textViewResultado);

        Button btnSomar = (Button) findViewById(R.id.btnSomar);
        btnSomar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if ((num1.getContext()==null) || (num2.getContext()==null)) {
                    Toast toast = Toast.makeText(getApplicationContext(),"Valor Nulo",1000);
                    toast.show();
                }else{

                    float number1 = Float.valueOf(num1.getText().toString());
                    float number2 = Float.valueOf(num2.getText().toString());
                    float res = number1 + number2;

                    result.setText(String.valueOf(res));
                }
            }
        });

        Button btnLimpar = (Button) findViewById(R.id.btnLimpar);
        btnLimpar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                num1.setText(null);
                num2.setText(null);
                result.setText(null);
            }
        });

    }
    EditText num1 = null;
    EditText num2 = null;
    TextView result = null;
    Button btnSomar;
    Button btnLimpar;
}