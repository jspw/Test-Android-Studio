package com.softwarecitybd.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText input1,input2;
    private TextView result;
    private Button sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);

        sum= findViewById(R.id.sum);

        result = findViewById(R.id.result);


    }


    public void handle (View v){
        try{
            if(v.getId()==R.id.sum){
                result.setText("Result = "+ (Double.parseDouble(input1.getText().toString())+ Double.parseDouble(input2.getText().toString())));
                input1.setText("Enter a number");
                input2.setText("Enter a number");
            }

        }catch(Exception e){
            Toast warn = Toast.makeText(MainActivity.this,"Invalid input",Toast.LENGTH_SHORT);
            warn.show();
        }

    }


}
