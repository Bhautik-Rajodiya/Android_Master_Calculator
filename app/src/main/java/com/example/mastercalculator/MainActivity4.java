package com.example.mastercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    EditText Amount,ReturnAmount,Time;
    Button btnSubmit;
    ImageView backButton;
    TextView TotalAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        initBinding();

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double amount1 = Double.valueOf(Amount.getText().toString());
                double interest1 = Double.valueOf(ReturnAmount.getText().toString());
                double year1 = Double.valueOf(Time.getText().toString());


                double b = 1 + ((interest1 / 100) * (year1));
                TotalAmount.setText(String.valueOf((int)(amount1*b)));

            }
        });
    }
    private void initBinding(){
        Amount = findViewById(R.id.PrincipalAmount);
        ReturnAmount = findViewById(R.id.InterestReturn);
        Time = findViewById(R.id.TimePeriod);
        btnSubmit = findViewById(R.id.calculate);
        TotalAmount = findViewById(R.id.TotalInterestAmount);
        backButton = findViewById(R.id.BackButton2);
    }

}