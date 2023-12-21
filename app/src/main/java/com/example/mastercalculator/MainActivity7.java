package com.example.mastercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {

    EditText P,D;
    Button btnSubmit;
    ImageView backButton;
    TextView Price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
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
                    P.setError("Enter Your Marks");

                }
                else if (discount.isEmpty()) {
                    D.setError("Enter Your Total Marks");
                }
                else {

                    double marks = Double.valueOf(P.getText().toString());
                    double totalMarks = Double.valueOf(D.getText().toString());

                    double  a = (marks / totalMarks) * 100;

                    Price.setText(String.valueOf((int)(a)+"%"));

                }
            }
        });
    }

    private void initBinding(){
        P = findViewById(R.id.Marks);
        D = findViewById(R.id.TotalMarks);
        btnSubmit = findViewById(R.id.calculate);
        Price = findViewById(R.id.TotalParsentece);
        backButton = findViewById(R.id.BackButton8);
    }
}