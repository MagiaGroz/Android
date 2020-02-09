package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView inputnumber;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonMinus;
    private Button buttonMul;
    private Button buttonDiv;
    private Button buttonDot;
    private Button buttonPlus;
    private Button buttonSqr;
    private Button buttonSqrt;
    private Button buttonC;
    private Button buttonCE;
    private Button buttonEqual;


    private double n1;
    private double n2;
    private double result;
    private boolean check;
    private boolean dot = false;
    private boolean eq;
    enum Sign{
        PlUS,MINUS,MUL,DIV
    }
    private Sign sign;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputnumber = findViewById(R.id.Input);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button0 = findViewById(R.id.button0);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMul = findViewById(R.id.buttonMul);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonDot = findViewById(R.id.buttonDot);
        buttonSqrt = findViewById(R.id.buttonSqrt);
        buttonSqr = findViewById(R.id.buttonSqr);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonC = findViewById(R.id.buttonC);
        buttonCE = findViewById(R.id.buttonCE);
        buttonCE.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button0.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
        buttonSqr.setOnClickListener(this);
        buttonSqrt.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
    }
    public void IsLong(){
        if (inputnumber.length()>8){
            check=true;
        }else{
            check=false;
        }
    }
    @Override
    public void onClick(View view){
        switch(view.getId()){
            case R.id.button1 : {
                if(inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("0") ){
                    inputnumber.setText("");
                }
                inputnumber.append("1");
                break;
            }
            case R.id.button2 : {
                if(inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("0") ){
                    inputnumber.setText("");
                }
                inputnumber.append("2");
                break;
            }
            case R.id.button3 : {
                if(inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("0") ){
                    inputnumber.setText("");
                }
                inputnumber.append("3");
                break;
            }
            case R.id.button4 : {
                if(inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("0") ){
                    inputnumber.setText("");
                }
                inputnumber.append("4");
                break;
            }
            case R.id.button5 : {
                if(inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("0") ){
                    inputnumber.setText("");
                }
                inputnumber.append("5");
                break;
            }
            case R.id.button6 : {
                if(inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("0") ){
                    inputnumber.setText("");
                }
                inputnumber.append("6");
                break;
            }
            case R.id.button7 : {
                if(inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("0") ){
                    inputnumber.setText("");
                }
                inputnumber.append("7");
                break;
            }
            case R.id.button8 : {
                if(inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("0") ){
                    inputnumber.setText("");
                }
                inputnumber.append("8");
                break;
            }
            case R.id.button9 : {
                if(inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("0") ){
                    inputnumber.setText("");
                }
                inputnumber.append("9");
                break;
            }
            case R.id.button0 : {
                if(inputnumber.getText().toString().equals("Error") ){
                    inputnumber.setText("");
                }
                if( inputnumber.length()==0) {
                    inputnumber.append("0");
                    break;
                }
                if (inputnumber.getText().toString().charAt(0) != '0')
                        inputnumber.append("0");

                break;
            }
            case R.id.buttonDot : {
                if(inputnumber.getText().toString().equals("Error") ){
                    inputnumber.setText("");
                }
                if(!dot & inputnumber.length()>0) {
                    inputnumber.append(".");
                    dot=true;
                }
                break;
            }
            case R.id.buttonC : {
                inputnumber.setText("");
                dot=false;
                break;
            }
            case R.id.buttonCE : {
                if(inputnumber.length()==0)
                    break;
                if(inputnumber.length()==1){
                    inputnumber.setText("");
                break;
                }
                if(inputnumber.length()>2) {
                    if (inputnumber.getText().toString().charAt(inputnumber.length()-2) == '.') {
                        inputnumber.setText(inputnumber.getText().toString().substring(0, inputnumber.length() - 2));
                        dot=false;
                        break;
                    }

                }
                inputnumber.setText(inputnumber.getText().toString().substring(0, inputnumber.length() - 1));


                break;
            }
            case R.id.buttonDiv : {
                if(inputnumber.getText().toString().equals("Error")){
                    inputnumber.setText("");
                }
                if(dot) {
                    inputnumber.append("0");

                    n1 = Double.parseDouble(inputnumber.getText().toString());
                    inputnumber.setText("");
                    dot=false;
                }
                else
                    n1 = Integer.parseInt(inputnumber.getText().toString());
                inputnumber.setText("");
                sign=Sign.DIV;
                break;
            }
            case R.id.buttonMinus : {
                if(inputnumber.getText().toString().equals("Error") ){
                    inputnumber.setText("");
                }
                if(dot) {
                    inputnumber.append("0");

                    n1 = Double.parseDouble(inputnumber.getText().toString());
                    inputnumber.setText("");
                    dot=false;
                }
                else
                    n1 = Integer.parseInt(inputnumber.getText().toString());
                inputnumber.setText("");
                sign=Sign.MINUS;
                break;
            }
            case R.id.buttonPlus : {
                if(inputnumber.getText().toString().equals("Error") ){
                    inputnumber.setText("");
                }
                if(dot) {
                    inputnumber.append("0");

                    n1 = Double.parseDouble(inputnumber.getText().toString());
                    inputnumber.setText("");
                    dot=false;
                }
                else
                    n1 = Integer.parseInt(inputnumber.getText().toString());
                inputnumber.setText("");
                sign=Sign.PlUS;
                break;
            }
            case R.id.buttonMul : {
                if(inputnumber.getText().toString().equals("Error") ){
                    inputnumber.setText("");
                }
                if(dot) {
                    inputnumber.append("0");

                    n1 = Double.parseDouble(inputnumber.getText().toString());
                    inputnumber.setText("");
                    dot=false;
                }
                else
                    n1 = Integer.parseInt(inputnumber.getText().toString());
                inputnumber.setText("");
                sign=Sign.MUL;
                break;
            }
            case R.id.buttonSqr : {
                if(inputnumber.getText().toString().equals("Error") ){
                    inputnumber.setText("");
                }
                if(inputnumber.length()>0) {
                    n1 = Double.parseDouble(inputnumber.getText().toString());
                    if(n1 == Math.floor(n1)) {
                        inputnumber.setText(String.valueOf((int)(n1*n1)));
                    }else {
                        inputnumber.setText(String.valueOf(n1*n1));
                    }
                }
                    break;
            }
            case R.id.buttonSqrt:{
                if(inputnumber.getText().toString().equals("Error") ){
                    inputnumber.setText("");
                }
                if(inputnumber.length()>0){
                    n1 = Double.parseDouble(inputnumber.getText().toString());
                    n1 = Math.sqrt(n1);
                    if(n1 == Math.floor(n1)) {
                        inputnumber.setText(String.valueOf((int)(n1)));
                    }else {
                        inputnumber.setText(String.valueOf(n1));
                    }

                }
            break;}
            case R.id.buttonEqual:{
                if(inputnumber.getText().toString().equals("Error") ){
                    inputnumber.setText("");
                    break;
                }
                if(inputnumber.getText().toString()!=""){
                    if(dot)
                    n2 = Double.parseDouble(inputnumber.getText().toString());
                    else
                        n2 = Integer.parseInt(inputnumber.getText().toString());
                }

                else {
                    break;}

                    if (sign == Sign.PlUS) {
                        result = n1 +n2 ;
                    }
                    if (sign == Sign.MINUS) {
                        result = n1 -n2 ;
                    }
                    if (sign == Sign.MUL) {
                        result = n1 *n2 ;
                    }
                    if (sign == Sign.DIV) {
                        if(Math.floor(n2)==0){
                            inputnumber.setText("Error");
                            break;
                        }
                        result = n1 /n2 ;

                    }

                    if((result == Math.floor(result)) && !Double.isInfinite(result)) {
                        inputnumber.setText(String.valueOf((int) result));
                    }
                    else {
                        inputnumber.setText(Double.toString(result));
                    dot=true;
                    }

                    n2=0.0d;


            }
        }
    }

}


