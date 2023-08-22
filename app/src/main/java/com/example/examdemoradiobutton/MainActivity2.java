package com.example.examdemoradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void check(View view) {

        RadioButton r1=findViewById(R.id.op1);
        if(r1.isChecked())
        {
            Toast.makeText(this, "Congratulation!\nYour Answer is Correct", Toast.LENGTH_SHORT).show();

        }
        else {
            Toast.makeText(this, "Wrong Answer!\nPlease Check Again", Toast.LENGTH_SHORT).show();

        }
    }

}