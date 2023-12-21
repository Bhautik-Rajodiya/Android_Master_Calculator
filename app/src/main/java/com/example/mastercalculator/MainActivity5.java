package com.example.mastercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    EditText P,D;
    Button btnSubmit;
    ImageView backButton;
    TextView Price,SavePrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
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
                String price = P.getText().toString();
                String discount = D.getText().toString();

                if (price.isEmpty()) {
                    P.setError("Enter Your Amount");

                }
                else if (discount.isEmpty()) {
                    D.setError("Enter Your Discount");
                }
                else {

                    double amount1 = Double.valueOf(P.getText().toString());
                    double interest1 = Double.valueOf(D.getText().toString());

                    double  a = ((amount1) * (interest1)) / 100;

                    Price.setText(String.valueOf((int)(amount1-a)));
                    SavePrice.setText(String.valueOf((int) a));

                }
            }
        });
    }

    private void initBinding(){
        P = findViewById(R.id.Price);
        D = findViewById(R.id.DiscountPrice);
        btnSubmit = findViewById(R.id.calculate);
        Price = findViewById(R.id.TotalPrice);
        SavePrice = findViewById(R.id.SavePrice);
        backButton = findViewById(R.id.BackButton3);
    }
}