package com.softwarecitybd.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button login,button,buttonR;
    private CheckBox ch1,ch2,ch3,ch4;
    private TextView text,text2;

    private RadioButton r1;
    private RadioGroup rd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login=findViewById(R.id.login);
        button=findViewById(R.id.button);
        buttonR=findViewById(R.id.buttonR);

        text = findViewById(R.id.text);
        text2 = findViewById(R.id.text2);

        ch1 = findViewById(R.id.cb1);
        ch2 = findViewById(R.id.cb2);
        ch3 = findViewById(R.id.cb3);
        ch4 = findViewById(R.id.cb4);

        rd = findViewById(R.id.rd);

    }

    public void handle (View v){
        StringBuilder builder = new StringBuilder();


        if(v.getId() == R.id.login){
            LayoutInflater inf = getLayoutInflater();
            View customView = inf.inflate(R.layout.customtoastlayout,(ViewGroup)findViewById(R.id.customloast));
            Toast toast = new Toast(MainActivity.this);
            toast.setView(customView);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.show();
        }

                if(ch1.isChecked()){
                    String str =ch1.getText().toString();
                    builder.append(str + " ");
                }
                if(ch2.isChecked()){
                    String str=ch2.getText().toString();
                    builder.append(str+ " ");
                }
                if(ch3.isChecked()){
                    String str= ch3.getText().toString();
                    builder.append(str+ " ");

                }
                if(ch4.isChecked()) {
                    String str= ch4.getText().toString();
                    builder.append(str+ " ");

                }

                if(v.getId()==R.id.button){
                    if(!ch1.isChecked() && !ch2.isChecked() && !ch3.isChecked() && !ch4.isChecked())
                         Toast.makeText(MainActivity.this,"invalid input",Toast.LENGTH_SHORT);

                    else
                        text.setText(builder +" selected\n");
                }

                if(v.getId()==R.id.buttonR){
                    int id = rd.getCheckedRadioButtonId();
                    r1= findViewById(id);

                    String  value = r1.getText().toString();
                    text2.setText("You have selected "+ value);
                }




    }

}
