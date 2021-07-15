package com.example.belajarbutton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int nomorAcak;
    public void clickFunction(View view) {
        EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        String edittextNumberString = editTextNumber.getText().toString();
        int edittextNumberInt = Integer.parseInt(edittextNumberString);

        System.out.println(nomorAcak);
        String message = "";
        if (edittextNumberInt > nomorAcak) {
            message = "Telalu besar";
        } else if (edittextNumberInt < nomorAcak) {
            message = "Terlalu kecil";
        } else {
            message = "Tebakan anda benar";
        }

        Toast.makeText(getApplicationContext(),message, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random mesinRandom = new Random();
        nomorAcak = mesinRandom.nextInt(21);


    }
}