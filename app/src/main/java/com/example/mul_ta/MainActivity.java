package com.example.mul_ta;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editTextNumber2;
    private EditText editT2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        editT2 = findViewById(R.id.editT2);
    }

    public void calculate(View view) {
        int i, j = 0, n;
        StringBuffer bu = new StringBuffer();
        String s = editTextNumber2.getText().toString();
        n = Integer.parseInt(s);
        for (i = 1; i <= 10; i++) {
            j = i * n;
            bu.append(n + "*" + i + "=" + j + "\n\n");
        }
        editT2.setText(bu);
    }
}