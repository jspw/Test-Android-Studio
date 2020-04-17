package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    public void convertCurrencey(View view){
//        EditText tk = findViewById(R.id.input);
//        String intput = tk.getText().toString();
//        Double ans = Double.parseDouble(intput)/80;
//        String ok = ans.toString();
//
//        EditText output = findViewById(R.id.output);
//        output.setText(ok);
//    }

    public void fade(View view){
        ImageView img = findViewById(R.id.imageView);
        ImageView img1 = findViewById(R.id.img2);

        img.animate().alpha(0f).setDuration(2000);
        img1.animate().alpha(1f).setDuration(2000);

    }

    public void animateup(View view){
        ImageView img = findViewById(R.id.img2);
        img.animate().translationY(-500f).setDuration(1000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
