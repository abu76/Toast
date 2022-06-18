package com.a.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Duration;

public class MainActivity extends AppCompatActivity {

    ImageView imageV;
    Button imgshow, imgremove;
    Button showtoast;
    TextView secondpage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageV=findViewById(R.id.imagev);
        imgshow= findViewById(R.id.imgshow);
        imgremove=findViewById(R.id.imgremove);
        showtoast=findViewById(R.id.showtoast);
        secondpage=findViewById(R.id.secondpage);
        secondpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent twopage = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(twopage);
            }
        });
        imgshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageV.setVisibility(View.VISIBLE);

            }
        });
        imgremove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageV.setVisibility(View.GONE);

            }
        });
        showtoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "sucessfully done", Toast.LENGTH_SHORT).show();
            }
        });


    }
}