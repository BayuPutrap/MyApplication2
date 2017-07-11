package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.rlLayout);

        Button tombol = new Button(this);
        tombol.setText("TOMBOL");
        layout.addView(tombol);

        Button click = (Button) findViewById(R.id.btnClick);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Tombol Diklik", Toast.LENGTH_SHORT).show();

            }
        };

        tombol.setOnClickListener(listener);
        click.setOnClickListener(listener);
    }
}
