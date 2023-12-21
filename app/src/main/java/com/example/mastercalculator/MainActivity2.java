package com.example.mastercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity2 extends AppCompatActivity {
    LinearLayout MutualFund,Interest,Discount,EMI,SchoolResult,SquareOrHour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initBinding();

        MutualFund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent1);

            }
        });

        Interest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(intent1);
            }
        });

        Discount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity2.this, MainActivity5.class);
                startActivity(intent1);
            }
        });

        EMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity2.this, MainActivity6.class);
                startActivity(intent1);
            }
        });

        SchoolResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity2.this, MainActivity7.class);
                startActivity(intent1);
            }
        });

        SquareOrHour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });


    }

    private void initBinding(){
        MutualFund = findViewById(R.id.MutualFund);
        Interest = findViewById(R.id.Interest);
        Discount = findViewById(R.id.Discount);
        EMI = findViewById(R.id.EMI);
        SchoolResult = findViewById(R.id.SchoolResult);
        SquareOrHour = findViewById(R.id.SquareOrHour);
    }
}