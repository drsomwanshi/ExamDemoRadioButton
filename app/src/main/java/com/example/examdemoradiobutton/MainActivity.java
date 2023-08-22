package com.example.examdemoradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void check(View view) {

        RadioButton r3=findViewById(R.id.op3);
        if(r3.isChecked())
        {
            Toast.makeText(this, "Congratulation!\nYour Answer is Correct", Toast.LENGTH_SHORT).show();

        }
        else {
            Toast.makeText(this, "Wrong Answer!\nPlease Check Again", Toast.LENGTH_SHORT).show();

        }




    }

    public void next(View view) {

        Intent i=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(i);

    }
}