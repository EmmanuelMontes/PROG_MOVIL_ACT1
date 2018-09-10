package com.unam.dmovileseml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView numero_cuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero_cuenta = (TextView) findViewById(R.id.cuenta);

        numero_cuenta.setText("415140230");

       }
}
