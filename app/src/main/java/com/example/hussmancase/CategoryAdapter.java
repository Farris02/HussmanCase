package com.example.hussmancase;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyHolder>
{
    private ArrayList<CategoryModel> category;
    Intent intent;
    Context context;

    public CategoryAdapter(Context context, ArrayList<CategoryModel> category){
        this.context = context;
        this.category = category;
    }
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.category_model, parent, false );
        MyHolder holder = new MyHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        CategoryModel model = category.get(position);
        holder.image.setImageResource(model.getCat_image());
        holder.cat.setText(model.getCat_name());

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String catName = holder.cat.getText().toString();

            switch(catName){
                case "Frozen Foods":
                    intent = new Intent(holder.itemView.getContext(), FrozenFood.class);
            }

            }

        });
        holder.itemView.getContext().startActivity(intent);
    }

    @Override
    public int getItemCount() {
        return category.size();
    }


    class MyHolder extends RecyclerView.ViewHolder {
        TextView cat;

        ImageView image;
        public MyHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.CatImage);
            cat = itemView.findViewById(R.id.CatText);
        }
    }
}

