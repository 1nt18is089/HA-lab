package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button one,two,three,four,five,six,seven,eight,nine,clear,zero,equal,add,sub,mul,div;
    EditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        clear = findViewById(R.id.clear);
        equal = findViewById(R.id.equal);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        zero = findViewById(R.id.zero);

        result = findViewById(R.id.result);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        clear.setOnClickListener(this);
        equal.setOnClickListener(this);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        zero.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String symbol = " ";
        double finalresult;
        switch (view.getId()){
            case R.id.one:
                result.append("1");break;
            case R.id.two:
                result.append("2");break;
            case R.id.three:
                result.append("3");break;
            case R.id.four:
                result.append("4");break;
            case R.id.five:
                result.append("5");break;
            case R.id.six:
                result.append("6");break;
            case R.id.seven:
                result.append("7");break;
            case R.id.eight:
                result.append("8");break;
            case R.id.nine:
                result.append("9");break;
            case R.id.clear:
                result.setText("");break;
            case R.id.add:
                result.append("+");break;
            case R.id.sub:
                result.append("-");break;
            case R.id.mul:
                result.append("*");break;
            case R.id.div:
                result.append("/");break;

            case R.id.equal: finalresult = evaluateExpression(result.getText().toString(),symbol);
                                           result.setText(String.valueOf(finalresult));break;

        }

    }
    private double evaluateExpression(String toString,String symbol){
        String[] tokens = toString.split("\\+\\-\\*\\/");
        double valOne = Double.parseDouble(tokens[0]);
        double valTwo = Double.parseDouble(tokens[1]);

        switch (symbol)
        {
            case "+": return valOne + valTwo;
            case "-": return valOne - valTwo;
            case "*": return valOne * valTwo;
            case "/": return valOne / valTwo;
            default:return 0;
        }

    }
}