package com.example.android.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public void clickedButton(View view){
    EditText currencyConverter =(EditText) findViewById(R.id.editText);
    Log.i("android",currencyConverter.getText().toString());
    Double ruppesDouble=Double.parseDouble(currencyConverter.getText().toString());
Double dollaraMOUNT= ruppesDouble * 0.015;
    Toast.makeText(MainActivity.this,"$" + dollaraMOUNT.toString(),Toast.LENGTH_LONG).show();
}
public void clicked(View view){
    EditText currencyConverter =(EditText) findViewById(R.id.editText);
    Log.i("android",currencyConverter.getText().toString());
    Double ruppesDouble=Double.parseDouble(currencyConverter.getText().toString());
    Double dollaraMOUNT= ruppesDouble * 66.67;
    Toast.makeText(MainActivity.this,"Rs" +"" + dollaraMOUNT.toString(),Toast.LENGTH_LONG).show();
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
