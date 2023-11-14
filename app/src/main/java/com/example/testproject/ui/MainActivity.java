package com.example.testproject.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.testproject.R;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.view);

        editText = findViewById(R.id.editText);

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item);

        adapter.add("usd");
        adapter.add("eur");

        spinner.setAdapter(adapter);


        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (spinner.getSelectedItem().equals("eur")){
                    showResult(38);
                }
                else {
                    showResult(36);
                }
            }
        });
    }
    private void showResult(int currency){
        String input = editText.getText().toString();
        int number = Integer.parseInt(input) * currency;
        String result = String.valueOf(number);
        textView.setText("Result in uah: "+ result);
    }
}