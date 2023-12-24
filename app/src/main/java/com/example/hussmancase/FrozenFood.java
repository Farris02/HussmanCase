package com.example.hussmancase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class FrozenFood extends AppCompatActivity {

    RecyclerView recyv;
    FrozenAdapter adap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frozen_food);

        recyv = findViewById(R.id.frozen_recycler);
        recyv.setLayoutManager(new GridLayoutManager(this, 2));

        Query query = FirebaseDatabase.getInstance()
        .getReference()
        .child("frozen");

        FirebaseRecyclerOptions<ProductModels> options
                = new FirebaseRecyclerOptions.Builder<ProductModels>()
                .setQuery(query, ProductModels.class)
                .build();

        adap = new FrozenAdapter(options, 1);
        recyv.setAdapter(adap);
    }

    protected void onStart() {

        super.onStart();
        adap.startListening();
    }

    protected void onStop() {

        super.onStop();
        adap.stopListening();
    }
}