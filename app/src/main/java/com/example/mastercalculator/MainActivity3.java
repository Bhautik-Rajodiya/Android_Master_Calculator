package com.example.mastercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    EditText M,R1,T;
    ImageView BackButton;
    TextView TotalInterest,TotalAmount,TotalPayable;
    Button calculation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initBinding();

        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        calculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String amount = M.getText().toString();
                String interest = R1.getText().toString();
                String year = T.getText().toString();

                if (amount.isEmpty()) {
                   M.setError("Enter Your Amount");

                }
                else if (interest.isEmpty()) {
                    R1.setError("Enter Your Interest");
                }
                else if (year.isEmpty()) {
                    T.setError("Enter Your Year");
                }
                else {

                    double amount1 = Double.valueOf(M.getText().toString());
                    double interest1 = Double.valueOf(R1.getText().toString());
                    double year1 = Double.valueOf(T.getText().toString());

                    double monthlyRate = interest1 / 12 / 100;
                    double numberOfPayments = year1 * 12;

                    double  numerator = Math.pow((1 + monthlyRate), (numberOfPayments)) - 1;
                    double denominator = monthlyRate * Math.pow((1 + monthlyRate),(numberOfPayments));
                    double sipAmount = amount1 * (numerator / denominator);
                    Log.e("TAG", "onClick: "+sipAmount);

//                    TotalAmount.setText(String.valueOf((int)(cv)));
//                    TotalInterest.setText(String.valueOf((int)(ans-cv)));
//                    TotalPayable.setText(String.valueOf((int) ans));

                }
            }
        });
    }

    private void initBinding(){
        M = findViewById(R.id.MonthlyInvest);
        R1 = findViewById(R.id.Return);
        T = findViewById(R.id.TimePeriod);
        calculation = findViewById(R.id.calculate);
        TotalAmount = findViewById(R.id.TotalInvested);
        TotalInterest = findViewById(R.id.TotalReturns);
        TotalPayable = findViewById(R.id.TotalValue);
        BackButton = findViewById(R.id.BackButton1);
    }


}