package com.example.hussmancase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView category;

    ArrayList<CategoryModel> cat;

    CategoryAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        category = findViewById(R.id.Categories);
        cat = new ArrayList<>();

        cat.add(new CategoryModel("Frozen Food", R.drawable.frozen_food));
        cat.add(new CategoryModel("Chilled Food", R.drawable.chilled_foods));
        cat.add(new CategoryModel("Integral Cases", R.drawable.chilled_foods));
        cat.add(new CategoryModel("TCO2 Condensing Units", R.drawable.tco_condensing_unit));

        adapter = new CategoryAdapter(this, cat);
        category.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        category.setAdapter(adapter);

    }





}