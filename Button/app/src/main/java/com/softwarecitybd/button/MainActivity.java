package com.softwarecitybd.button;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int count=0;
    public Button button1;
    public TextView textView1;
    public ImageButton imgB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1=findViewById(R.id.button1);
        textView1=findViewById(R.id.textView1);
        imgB=findViewById(R.id.imgB);

        button1.setOnClickListener(this);
        imgB.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button1)
            textView1.setText("OOOOOH");

        if(view.getId() == R.id.imgB)
            textView1.setText("Owwwww");
    }
}
