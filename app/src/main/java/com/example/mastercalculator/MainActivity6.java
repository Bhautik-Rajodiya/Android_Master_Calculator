package com.example.mastercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    EditText P,R1,N;

    TextView TotalInterest,TotalAmount,TotalPayable;
    ImageView backButton;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
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

                String amount = P.getText().toString();
                String interest = R1.getText().toString();
                String year = N.getText().toString();

                if (amount.isEmpty()) {
                    P.setError("Enter Your Amount");

                }
                else if (interest.isEmpty()) {
                    R1.setError("Enter Your Interest");
                }
                else if (year.isEmpty()) {
                    N.setError("Enter Your Year");
                }
                else {

                    double amount1 = Double.valueOf(P.getText().toString());
                    double interest1 = Double.valueOf(R1.getText().toString());
                    double year1 = Double.valueOf(N.getText().toString());

                    double monthlyInterestRate = (interest1/12)/100;
                    double numberOfPayments = year1 * 12;
                    double emi = amount1 * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments) / ( Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
                    TotalAmount.setText(String.valueOf((int) emi));
                    TotalInterest.setText(String.valueOf((int)((emi*numberOfPayments)-amount1)));
                    TotalPayable.setText(String.valueOf((int)(emi*numberOfPayments)));

                }

            }
        });

    }

    private void initBinding(){
        P = findViewById(R.id.amount);
        R1 = findViewById(R.id.interest);
        N = findViewById(R.id.year);
        btnSubmit = findViewById(R.id.calculate);
        TotalAmount = findViewById(R.id.totalAmount);
        TotalInterest = findViewById(R.id.totalInterest);
        TotalPayable = findViewById(R.id.totalPayable);
        backButton = findViewById(R.id.BackButton4);
    }
}