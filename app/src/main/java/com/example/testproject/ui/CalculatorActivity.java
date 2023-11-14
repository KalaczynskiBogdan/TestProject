package com.example.testproject.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.testproject.R;

public class CalculatorActivity extends AppCompatActivity {
    int result = 0;
    String symbol = "";

    String number = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        TextView textView = findViewById(R.id.textView);

        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (symbol.equals("+")) {
                    number = number + "1";
                    textView.setText(number);

                } else if (symbol.equals("-")) {
                    number = number + "1";
                    textView.setText(number);
                } else if (symbol.isEmpty()) {
                    number = number + "1";
                    textView.setText(number);
                }

            }
        });
        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (symbol.equals("+")) {
                    number = number + "2";
                    textView.setText(number);

                } else if (symbol.equals("-")) {
                    number = number + "2";
                    textView.setText(number);
                } else if (symbol.isEmpty()) {
                    number = number + "2";
                    textView.setText(number);
                }
            }
        });
        Button b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (symbol.equals("+")) {
                    number = number + "3";
                    textView.setText(number);

                } else if (symbol.equals("-")) {
                    number = number + "3";
                    textView.setText(number);
                } else if (symbol.isEmpty()) {
                    number = number + "3";
                    textView.setText(number);
                }
            }
        });
        Button b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (symbol.equals("+")) {
                    number = number + "4";
                    textView.setText(number);

                } else if (symbol.equals("-")) {
                    number = number + "4";
                    textView.setText(number);
                } else if (symbol.isEmpty()) {
                    number = number + "4";
                    textView.setText(number);
                }
            }
        });
        Button b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (symbol.equals("+")) {
                    number = number + "5";
                    textView.setText(number);

                } else if (symbol.equals("-")) {
                    number = number + "5";
                    textView.setText(number);
                } else if (symbol.isEmpty()) {
                    number = number + "5";
                    textView.setText(number);
                }
            }
        });
        Button b6 = (Button) findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (symbol.equals("+")) {
                    number = number + "6";
                    textView.setText(number);

                } else if (symbol.equals("-")) {
                    number = number + "6";
                    textView.setText(number);
                } else if (symbol.isEmpty()) {
                    number = number + "6";
                    textView.setText(number);
                }
            }
        });
        Button b7 = (Button) findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (symbol.equals("+")) {
                    number = number + "7";
                    textView.setText(number);

                } else if (symbol.equals("-")) {
                    number = number + "7";
                    textView.setText(number);
                } else if (symbol.isEmpty()) {
                    number = number + "7";
                    textView.setText(number);
                }
            }
        });
        Button b8 = (Button) findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (symbol.equals("+")) {
                    number = number + "8";
                    textView.setText(number);

                } else if (symbol.equals("-")) {
                    number = number + "8";
                    textView.setText(number);
                } else if (symbol.isEmpty()) {
                    number = number + "8";
                    textView.setText(number);
                }
            }
        });
        Button b9 = (Button) findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (symbol.equals("+")) {
                    number = number + "9";
                    textView.setText(number);

                } else if (symbol.equals("-")) {
                    number = number + "9";
                    textView.setText(number);
                } else if (symbol.isEmpty()) {
                    number = number + "9";
                    textView.setText(number);
                }
            }
        });
        Button bPlus = (Button) findViewById(R.id.buttonPlus);
        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!number.isEmpty()) {
                    int count = Integer.parseInt(number);
                    result += count;
                    textView.setText("+");
                    symbol = "+";
                    number = "";
                }
                textView.setText("+");
                symbol = "+";
                number = "";
            }

        });
        Button bMinus = (Button) findViewById(R.id.buttonMinus);
        bMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!number.isEmpty()) {
                    int count = Integer.parseInt(number);
                    result = result + count;
                    textView.setText("-");
                    symbol = "-";
                    number = "";
                }
                textView.setText("-");
                symbol = "-";
                number = "";
            }
        });
        Button bEquals = (Button) findViewById(R.id.buttonEquals);
        bEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = Integer.parseInt(number);
                if (symbol.equals("+")) {
                    result += count;
                } else if (symbol.equals("-")){
                    result = result - count;
                }
                String stringResult = String.valueOf(result);
                textView.setText(stringResult);
                symbol = "";
                number = "";
            }


        });

    }


}
