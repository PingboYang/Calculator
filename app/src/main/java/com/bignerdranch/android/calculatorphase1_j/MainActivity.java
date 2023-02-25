package com.bignerdranch.android.calculatorphase1_j;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit_text_number1, edit_text_number2;
    Button executeButton;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_text_number1=findViewById(R.id.edit_text_number1);
        edit_text_number2=findViewById(R.id.edit_text_number2);
        executeButton=findViewById(R.id.execute_button);
        resultTextView=findViewById(R.id.resultTextView);

        executeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1=Integer.parseInt(edit_text_number1.getText().toString());
                int number2=Integer.parseInt(edit_text_number2.getText().toString());
                int result=number1+number2;
                resultTextView.setText(String.valueOf(result));
            }
        });

    }
}