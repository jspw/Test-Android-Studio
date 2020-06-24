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
        img.animate().translationXBy(500f).setDuration(2000);

    }

    public void animatex(View view){
        ImageView img = findViewById(R.id.img2);
        img.animate().translationXBy(-500f).setDuration(2000);
    }

    public void rotate(View view){
        ImageView img = findViewById(R.id.img2);
        img.animate().rotationBy(360f).setDuration(3000);
    }

    public void scale(View view){
        ImageView img = findViewById(R.id.imageView);
        img.animate().alpha(1f).setDuration(1000);
        img.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
    }

    public void all(View view){
        ImageView img = findViewById(R.id.img2);
        img.animate()
                .translationXBy(100f)
                .translationYBy(150f)
                .scaleXBy(1.5f)
                .scaleY(1.3f)
                .rotationBy(360f)
                .alpha(0.5f)
                .setDuration(5000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
