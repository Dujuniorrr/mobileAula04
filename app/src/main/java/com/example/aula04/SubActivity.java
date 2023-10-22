package com.example.aula04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class SubActivity extends AppCompatActivity {


    EditText editText1 = findViewById(R.id.editTextNumber1);
    EditText editText2 = findViewById(R.id.editTextNumber2);
    EditText editTextResult = findViewById(R.id.resultTextEdit);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);


        if (!editText1.getText().toString().isEmpty() || !editText2.getText().toString().isEmpty()) {
            editTextResult.setText(Integer.parseInt(editText1.getText().toString()) - Integer.parseInt(editText2.getText().toString()));
        }
    }
}