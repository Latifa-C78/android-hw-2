package com.example.gradecalculator;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.gradecalculator.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      final   EditText b = findViewById(R.id.editTextTextPersonName);
       final EditText t = findViewById(R.id.editTextTextPersonName2);
        final EditText s = findViewById(R.id.editTextTextPersonName4);
       final EditText f = findViewById(R.id.editTextTextPersonName3);
        Button r = findViewById(R.id.button);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int h = Integer.parseInt(b.getText().toString());
                int x = Integer.parseInt(t.getText().toString());
                int p = Integer.parseInt(s.getText().toString());
                int g = Integer.parseInt(f.getText().toString());
                int sum = h+x+p+g;
                Toast.makeText(MainActivity.this, sum + "", Toast.LENGTH_SHORT).show();

            }
        });


    }
}