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
    private Button buttonFactorial;
    private Button buttonSin;
    private Button buttonCos;
    private Button buttonTg;
    private Button buttonln;
    private Button buttonlog;
    private Button buttonpower;
    private Button buttonpercent;
    private static final String KEY_TEXT_VALUE = "textValue";
    private static final String KEY_NUM1 = "textValue2";
    private static final String KEY_SIGN = "textValue4";
    private double n1;
    private double n2;
    private double result;
    private boolean dot = false;
    enum Sign{
        PlUS,MINUS,MUL,DIV,POW
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
        buttonFactorial = findViewById(R.id.buttonFactorial);
        buttonSin=findViewById(R.id.buttonSin);
        buttonCos=findViewById(R.id.buttonCos);
        buttonTg=findViewById(R.id.buttonTg);
        buttonlog=findViewById(R.id.buttonlog);
        buttonln=findViewById(R.id.buttonln);
        buttonpower=findViewById(R.id.buttonpower);
        buttonpercent=findViewById(R.id.buttonpercent);
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
        buttonln.setOnClickListener(this);
        buttonlog.setOnClickListener(this);
        buttonSin.setOnClickListener(this);
        buttonCos.setOnClickListener(this);
        buttonTg.setOnClickListener(this);
        buttonFactorial.setOnClickListener(this);
        buttonpower.setOnClickListener(this);
        buttonpercent.setOnClickListener(this);
        if (savedInstanceState != null) {
                CharSequence savedText = savedInstanceState.getCharSequence(KEY_TEXT_VALUE);
                inputnumber.setText(savedText);
                n1 = savedInstanceState.getDouble(KEY_NUM1);
               // n2 = savedInstanceState.getDouble(KEY_NUM2);
                sign = (Sign)savedInstanceState.getSerializable(KEY_SIGN);
           //inputnumber.setText(savedText+"|"+Double.toString(n1)+"|"+Double.toString(n2)+"|"+sign);

        }
    }

    @Override
    protected void onSaveInstanceState (Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putCharSequence(KEY_TEXT_VALUE, inputnumber.getText());
        outState.putDouble(KEY_NUM1, n1);
        //outState.putDouble(KEY_NUM2, n2);
        outState.putSerializable(KEY_SIGN, sign);

    }
    @Override
    public void onClick(View view){
        switch(view.getId()) {
            case R.id.button1: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN") || inputnumber.getText().toString().equals("0")) {
                    inputnumber.setText("");
                }
                inputnumber.append("1");
                break;
            }
            case R.id.button2: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN") || inputnumber.getText().toString().equals("0")) {
                    inputnumber.setText("");
                }
                inputnumber.append("2");
                break;
            }
            case R.id.button3: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN") || inputnumber.getText().toString().equals("0")) {
                    inputnumber.setText("");
                }
                inputnumber.append("3");
                break;
            }
            case R.id.button4: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN") || inputnumber.getText().toString().equals("0")) {
                    inputnumber.setText("");
                }
                inputnumber.append("4");
                break;
            }
            case R.id.button5: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN") || inputnumber.getText().toString().equals("0")) {
                    inputnumber.setText("");
                }
                inputnumber.append("5");
                break;
            }
            case R.id.button6: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN") || inputnumber.getText().toString().equals("0")) {
                    inputnumber.setText("");
                }
                inputnumber.append("6");
                break;
            }
            case R.id.button7: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN") || inputnumber.getText().toString().equals("0")) {
                    inputnumber.setText("");
                }
                inputnumber.append("7");
                break;
            }
            case R.id.button8: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN") || inputnumber.getText().toString().equals("0")) {
                    inputnumber.setText("");
                }
                inputnumber.append("8");
                break;
            }
            case R.id.button9: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN") || inputnumber.getText().toString().equals("0")) {
                    inputnumber.setText("");
                }
                inputnumber.append("9");
                break;
            }
            case R.id.button0: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN")) {
                    inputnumber.setText("");
                }
                if (inputnumber.length() == 0) {
                    inputnumber.append("0");
                    break;
                }
                if (inputnumber.getText().toString().charAt(0) != '0')
                    inputnumber.append("0");

                break;
            }
            case R.id.buttonDot: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN")) {
                    inputnumber.setText("");
                }
                if (!dot & inputnumber.length() > 0) {
                    inputnumber.append(".");
                    dot = true;
                }
                break;
            }
            case R.id.buttonC: {
                inputnumber.setText("");
                dot = false;
                n1 = 0;
                n2 = 0;
                break;
            }
            case R.id.buttonCE: {
                if (inputnumber.length() == 0)
                    break;
                if (inputnumber.length() == 1) {
                    inputnumber.setText("");
                    break;
                }
                if (inputnumber.length() > 2) {
                    if (inputnumber.getText().toString().charAt(inputnumber.length() - 2) == '.') {
                        inputnumber.setText(inputnumber.getText().toString().substring(0, inputnumber.length() - 2));
                        dot = false;
                        break;
                    }
                }
                inputnumber.setText(inputnumber.getText().toString().substring(0, inputnumber.length() - 1));


                break;
            }
            case R.id.buttonDiv: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN")) {
                    inputnumber.setText("");
                }
                if (inputnumber.length() > 0) {
                    n1 = Double.parseDouble(inputnumber.getText().toString());
                    if (n1 == Math.floor(n1)) {
                        n1 = (int) (n1);
                    }
                }
                inputnumber.setText("");

                sign = Sign.DIV;
                break;
            }
            case R.id.buttonMinus: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN")) {
                    inputnumber.setText("");
                }
                if (inputnumber.length() > 0) {
                    n1 = Double.parseDouble(inputnumber.getText().toString());
                    if (n1 == Math.floor(n1)) {
                        n1 = (int) (n1);
                    }
                }
                inputnumber.setText("");
                sign = Sign.MINUS;
                break;
            }
            case R.id.buttonPlus: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN")) {
                    inputnumber.setText("");
                }
                if (inputnumber.length() > 0) {
                    n1 = Double.parseDouble(inputnumber.getText().toString());
                    if (n1 == Math.floor(n1)) {
                        n1 = (int) (n1);
                    }
                }

                inputnumber.setText("");
                sign = Sign.PlUS;
                break;
            }
            case R.id.buttonMul: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN")) {
                    inputnumber.setText("");
                }
                if (inputnumber.length() > 0) {
                    n1 = Double.parseDouble(inputnumber.getText().toString());
                    if (n1 == Math.floor(n1)) {
                        n1 = (int) (n1);
                    }
                }
                inputnumber.setText("");
                sign = Sign.MUL;
                break;
            }
            case R.id.buttonSqr: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN")) {
                    inputnumber.setText("");
                }
                if (inputnumber.length() > 0) {
                    n1 = Double.parseDouble(inputnumber.getText().toString());
                    if (n1 == Math.floor(n1)) {
                        inputnumber.setText(String.valueOf((int) (n1 * n1)));
                    } else {
                        inputnumber.setText(String.valueOf(n1 * n1));
                    }
                }
                break;
            }
            case R.id.buttonSqrt: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN")) {
                    inputnumber.setText("");
                }
                if (inputnumber.length() > 0) {
                    n1 = Double.parseDouble(inputnumber.getText().toString());
                    n1 = Math.sqrt(n1);
                    if (n1 == Math.floor(n1)) {
                        inputnumber.setText(String.valueOf((int) (n1)));
                    } else {
                        inputnumber.setText(String.valueOf(n1));
                    }

                }
                break;
            }
            case R.id.buttonCos: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN")) {
                    inputnumber.setText("");
                }
                if (inputnumber.length() > 0) {
                    n1 = Double.parseDouble(inputnumber.getText().toString());
                    n1 = Math.cos(n1);
                    if (n1 == Math.floor(n1)) {
                        inputnumber.setText(String.valueOf((int) (n1)));
                    } else {
                        inputnumber.setText(String.valueOf(n1));
                    }

                }
                break;
            }
            case R.id.buttonSin: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN")) {
                    inputnumber.setText("");
                }
                if (inputnumber.length() > 0) {
                    n1 = Double.parseDouble(inputnumber.getText().toString());
                    n1 = Math.sin(n1);
                    if (n1 == Math.floor(n1)) {
                        inputnumber.setText(String.valueOf((int) (n1)));
                    } else {
                        inputnumber.setText(String.valueOf(n1));
                    }

                }
                break;
            }
            case R.id.buttonTg: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN")) {
                    inputnumber.setText("");
                }
                if (inputnumber.length() > 0) {
                    n1 = Double.parseDouble(inputnumber.getText().toString());
                    n1 = Math.tan(n1);
                    if (n1 == Math.floor(n1)) {
                        inputnumber.setText(String.valueOf((int) (n1)));
                    } else {
                        inputnumber.setText(String.valueOf(n1));
                    }

                }
                break;
            }
            case R.id.buttonlog: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN")) {
                    inputnumber.setText("");
                }
                if (inputnumber.length() > 0) {
                    n1 = Double.parseDouble(inputnumber.getText().toString());
                    n1 = Math.log10(n1);
                    if (n1 == Math.floor(n1)) {
                        inputnumber.setText(String.valueOf((int) (n1)));
                    } else {
                        inputnumber.setText(String.valueOf(n1));
                    }

                }
                break;
            }


            case R.id.buttonln: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN")) {
                    inputnumber.setText("");
                }
                if (inputnumber.length() > 0) {
                    n1 = Double.parseDouble(inputnumber.getText().toString());
                    n1 = Math.log(n1);
                    if (n1 == Math.floor(n1)) {
                        inputnumber.setText(String.valueOf((int) (n1)));
                    } else {
                        inputnumber.setText(String.valueOf(n1));
                    }

                }
                break;
            }
            case R.id.buttonFactorial: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN")) {
                    inputnumber.setText("");
                }
                if (inputnumber.length() > 0) {
                    n1 = Double.parseDouble(inputnumber.getText().toString());
                    double num = 1;
                    for (int i = 1; i <= n1; i++) {
                        num = num * i;
                    }
                    n1 = num;
                    if (n1 == Math.floor(n1)) {
                        inputnumber.setText(String.valueOf((int) (n1)));
                    } else {
                        inputnumber.setText(String.valueOf(n1));
                    }

                }
                break;
            }
            case R.id.buttonpower: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN")) {
                    inputnumber.setText("");
                }
                if (inputnumber.length() > 0) {
                    n1 = Double.parseDouble(inputnumber.getText().toString());

                    if (n1 == Math.floor(n1)) {
                        inputnumber.setText(String.valueOf((int) (n1)));
                    }
                    inputnumber.append("^");
                    sign = Sign.POW;
                }
                break;
            }
            case R.id.buttonpercent: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN")) {
                    inputnumber.setText("");
                }
                if (inputnumber.length() > 0) {
                    n1 = Double.parseDouble(inputnumber.getText().toString());
                    n1 = n1 / 100;
                    if (n1 == Math.floor(n1)) {
                        inputnumber.setText(String.valueOf((int) (n1)));
                    } else {
                        inputnumber.setText(String.valueOf(n1));
                    }

                }
                break;
            }
            case R.id.buttonEqual: {
                if (inputnumber.getText().toString().equals("Error") || inputnumber.getText().toString().equals("NaN")) {
                    inputnumber.setText("");
                    break;
                }

                if (inputnumber.length() > 0 ) {

                    if (sign == Sign.POW) {
                        int index = 0;
                        for (int i = 0; i < inputnumber.length(); i++) {
                            if (inputnumber.getText().toString().charAt(i) == '^') {
                                index = i;
                                break;
                            }
                        }

                        n2 = Double.parseDouble(inputnumber.getText().subSequence(index + 1, inputnumber.length()).toString());
                        if (n2 == Math.floor(n2)) {
                            n2 = (int) (n2);
                        }
                    } else {
                        n2 = Double.parseDouble(inputnumber.getText().toString());
                        if (n2 == Math.floor(n2)) {
                            n2 = (int) (n2);
                        }
                    }
                } else {
                    break;
                }
if(n2==0){
    break;
}

                if (sign == Sign.PlUS) {
                    result = n1 + n2;
                }

                if (sign == Sign.MINUS) {
                    result = n1 - n2;
                }
                if (sign == Sign.MUL) {
                    result = n1 * n2;
                }
                if (sign == Sign.DIV) {
                    if (Math.floor(n2) == 0) {
                        inputnumber.setText("Error");
                        break;
                    }
                    result = n1 / n2;

                }
                if (sign == Sign.POW) {
                    result = Math.pow(n1, n2);
                }

                if ((result == Math.floor(result)) && !Double.isInfinite(result)) {
                    inputnumber.setText(String.valueOf((int) result));

                } else {
                    inputnumber.setText(Double.toString(result));
                    dot = true;
                }

                n2=0;

            }
        }
    }

}


