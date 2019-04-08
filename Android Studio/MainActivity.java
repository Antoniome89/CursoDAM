package com.example.adivinanumero;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.number);
        result = findViewById(R.id.result);


    }

    int hidden = (int)Math.round(Math.random()*10);

    public void check(View vista) {



        int inputnumber = Integer.parseInt(number.getText().toString());


        if (inputnumber == hidden) {
            result.setText("Correcto");
            result.setTextColor(Color.BLUE);
        } else if (inputnumber > hidden && inputnumber <= 10) {
            result.setText("mas bajo");
            result.setTextColor(Color.RED);
        } else if (inputnumber < hidden && inputnumber > 0) {
            result.setText("mas alto");
            result.setTextColor(Color.RED);
        } else if (inputnumber <= 0 || inputnumber >10) {
            result.setText("número incorrecto");
            result.setTextColor(Color.RED);
        }
    }

}



