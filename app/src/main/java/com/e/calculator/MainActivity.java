package com.e.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import java.nio.charset.CoderMalfunctionError;


public class MainActivity extends AppCompatActivity {
EditText etText;
 private Button one,two,three,four,five,six,seven,eight,nine,zero,point,add,sub,mult,div,enter;
 public int num1,num2,Result;
 boolean Add,Sub,Mult,Div;
 char temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etText=findViewById(R.id.etText);
        final Button one = findViewById(R.id.btnOne);
        final Button two = findViewById(R.id.btnTwo);
        final Button three = findViewById(R.id.btnThree);
        final Button four = findViewById(R.id.btnFour);
        final Button five = findViewById(R.id.btnFive);
        final Button six = findViewById(R.id.btnSix);
        final Button seven = findViewById(R.id.btnSeven);
        final Button eight = findViewById(R.id.btnEight);
        final Button nine = findViewById(R.id.btnNine);
        final Button zero = findViewById(R.id.btnZero);
        final Button point = findViewById(R.id.btnPoint);
        final Button add = findViewById(R.id.btnAdd);
        final Button sub = findViewById(R.id.btnSub);
        final Button mult = findViewById(R.id.btnMult);
        final Button div = findViewById(R.id.btnDiv);
        final Button enter = findViewById(R.id.btnEquals);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + "0");

            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + "1");

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + "2");

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + "3");

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(etText.getText() + "");
                temp='+';
                etText.setText(null);
            }



        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + "4");

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + "5");

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + "6");

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                num1 = Integer.parseInt(etText.getText() + "");
                temp='-';
                etText.setText(null);


            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + "7");

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + "8");

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + "9");

            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                num1 = Integer.parseInt(etText.getText() + "");
                temp='*';
                etText.setText(null);
            }


        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + ".");

            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etText.setText(etText.getText() + "0");

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Integer.parseInt(etText.getText() + "");
                temp='/';
                etText.setText(null);
            }


        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(etText.getText() + "");

                switch (temp) {

                    case '+':
                        Calculation firstcalculation = new Calculation(num1, num2);
                        Result = firstcalculation.Add();
                        etText.setText(Result + "");
                        break;
                    case '-':
                        Calculation secondcalculation= new Calculation(num1,num2);
                        Result=secondcalculation.Sub();
                        etText.setText(Result + "");
                        break;
                    case '*':
                        Calculation thirdcalculation= new Calculation(num1, num2);
                        result= thirdcalculation.Mult();
                        etText.setText(result + "");
                        break;
                    case '/':
                        Calculation fourthcalculation= new Calculation(num1, num2);
                        Result= fourthcalculation.Div();
                        etText.setText(Result + "");
                        break;


                }

            }
        });


    }
}
