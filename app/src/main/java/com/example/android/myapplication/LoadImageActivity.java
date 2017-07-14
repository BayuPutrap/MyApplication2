package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class LoadImageActivity extends AppCompatActivity {

    ImageView ivPicaso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_image);

        ivPicaso = (ImageView) findViewById(R.id.ivPicaso);
        Picasso.with(this)
                .load("http://i.imgur.com/DvpvklR.png")
                .placeholder(R.mipmap.ic_launcher)
                .resize(200,200)
                .into(ivPicaso);
    }
}
