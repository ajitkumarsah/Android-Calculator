package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText no1,no2,no3;
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    Double n1,n2,n3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no1 = findViewById(R.id.txtNo1);
        no2 = findViewById(R.id.txtNo2);
        no3 = findViewById(R.id.txtNo3);

        b1 = findViewById(R.id.btnAdd);
        b2 = findViewById(R.id.btnSub);
        b3 = findViewById(R.id.btnMu);
        b4 = findViewById(R.id.btnDiv);
        b5 = findViewById(R.id.btnMod);
        b6 = findViewById(R.id.btnSqr);
        b7 = findViewById(R.id.btnCube);
        b8 = findViewById(R.id.btnPer);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Double.parseDouble(no1.getText().toString());
                n2 = Double.parseDouble(no2.getText().toString());
                n3 = n1 + n2;
                no3.setText(String.valueOf(n3));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Double.parseDouble(no1.getText().toString());
                n2 = Double.parseDouble(no2.getText().toString());
                n3 = n1 - n2;
                no3.setText(String.valueOf(n3));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Double.parseDouble(no1.getText().toString());
                n2 = Double.parseDouble(no2.getText().toString());
                n3 = n1 * n2;
                no3.setText(String.valueOf(n3));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Double.parseDouble(no1.getText().toString());
                n2 = Double.parseDouble(no2.getText().toString());
                n3 = n1/n2;
                no3.setText(String.valueOf(n3));
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Double.parseDouble(no1.getText().toString());
                n2 = Double.parseDouble((no2.getText().toString()));
                n3 = n1 % n2 ;
                no3.setText(String.valueOf(n3));
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Double.parseDouble(no1.getText().toString());
                n3 = n1 * n1;
                no3.setText(String.valueOf(n3));

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Double.parseDouble(no1.getText().toString());
                n3 = n1 * n1 *n1;
                no3.setText(String.valueOf(n3));
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Double.parseDouble(no1.getText().toString());
                n2 = Double.parseDouble(no2.getText().toString());
                n3 = (n2 / n1) * 100;
                no3.setText(String.valueOf(n3));
            }
        });
    }
}