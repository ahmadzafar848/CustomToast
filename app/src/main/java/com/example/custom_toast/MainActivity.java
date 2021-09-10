package com.example.custom_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnCustomToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCustomToast=findViewById(R.id.btnCustomToast);
        btnCustomToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                custom_toast.ct(MainActivity.this,"Congrats",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

//TODO:15.Now go to MainActivity Class and define a class of Button and makes its refrence variable            Line No 11
//TODO:16.findViewById                                                                                         Line No 17
//TODO:17.Make its ClickListener                                                                               Line No 18
//TODO:18.Inside this,call your customToast.                                                                   Line No 21