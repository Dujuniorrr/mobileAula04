package com.example.aula04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    Button buttonSum, buttonSub, buttonMult, buttonDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        buttonSum = findViewById(R.id.buttonSum);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonMult = findViewById(R.id.buttonMult);
        buttonSub = findViewById(R.id.buttonSub);

        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent redirect = new Intent(HomeActivity.this, SumActivity.class);
                startActivity(redirect);
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent redirect = new Intent(HomeActivity.this, SubActivity.class);
                startActivity(redirect);
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent redirect = new Intent(HomeActivity.this, MultiActivity.class);
                startActivity(redirect);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent redirect = new Intent(HomeActivity.this, DivActivity.class);
                startActivity(redirect);
            }
        });

    }
}