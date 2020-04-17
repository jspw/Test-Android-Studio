package com.softwarecitybd.button3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView text1,text2;
    private Button button1,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text1 = findViewById(R.id.text1);
        text2= findViewById(R.id.text2);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);



    }


    public void showMessage(View v){
        if(v.getId()==R.id.button1){
            text1.setText("FUCK");

            text2.setText("");
            Toast toast = Toast.makeText(MainActivity.this,"Toasted 2",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();
        }
        else if(v.getId() == R.id.button2){
            text2.setText("21313421");
            text1.setText("");
            Toast toast = Toast.makeText(MainActivity.this,"Toasted",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();
        }
    }


}
