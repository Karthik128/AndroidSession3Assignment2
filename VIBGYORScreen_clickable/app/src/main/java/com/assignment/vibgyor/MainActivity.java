package com.assignment.vibgyor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView violet = (TextView)findViewById(R.id.V);
        TextView indigo = (TextView)findViewById(R.id.I);
        TextView blue = (TextView)findViewById(R.id.B);
        TextView green = (TextView)findViewById(R.id.G);
        TextView yellow = (TextView)findViewById(R.id.Y);
        TextView orange = (TextView)findViewById(R.id.O);
        TextView red = (TextView)findViewById(R.id.R);

        violet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "VIOLET Color", Toast.LENGTH_SHORT).show();
                Log.d("Message","Showing Toast");
            }
        });

        indigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "INDIGO Color", Toast.LENGTH_SHORT).show();
                Log.d("Message","Showing Toast");
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "BLUE Color", Toast.LENGTH_SHORT).show();
                Log.d("Message","Showing Toast");
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "GREEN Color", Toast.LENGTH_SHORT).show();
                Log.d("Message","Showing Toast");
            }
        });

        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Yellow Color", Toast.LENGTH_SHORT).show();
                Log.d("Message","Showing Toast");
            }
        });

        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "ORANGE Color", Toast.LENGTH_SHORT).show();
                Log.d("Message","Showing Toast");
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "RED Color", Toast.LENGTH_SHORT).show();
                Log.d("Message","Showing Toast");
            }
        });
    }
}
