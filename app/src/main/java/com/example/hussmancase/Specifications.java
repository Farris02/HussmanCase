package com.example.hussmancase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Specifications extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specifications);

   initViews();
   getSpecs();

    }
private ImageView spec_image;
String name, image;


    private void getSpecs() {

        Intent intent = getIntent();
        if(intent != null){

            name = intent.getStringExtra("Name");
            image = intent.getStringExtra("Image");

            Glide.with(this).load(image).into(spec_image);

        }

    }

private void initViews() {

        spec_image = findViewById(R.id.specifications_image);

    }

}