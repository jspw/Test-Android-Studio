package com.softwarecitybd.button2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text1,text2;
    private Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text1 = findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        button1 = findViewById(R.id.button1);
        button2=  findViewById(R.id.button2);

        inputHandler handle = new inputHandler();

        button1.setOnClickListener(handle);
        button2.setOnClickListener(handle);


    }


    class inputHandler implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            if(view.getId()==  R.id.button1 ){
                text1.setText("AaAAAAaaaaaaaaa");
                text2.setText("");
            }

            else if(view.getId() == R.id.button2){
                text2.setText("OOOOOOOOO");
                text1.setText("");
            }


        }
    }



}
