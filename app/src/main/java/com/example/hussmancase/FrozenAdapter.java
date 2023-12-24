package com.example.hussmancase;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.bumptech.glide.Glide;
public class FrozenAdapter extends FirebaseRecyclerAdapter<ProductModels, FrozenAdapter.FrozenHolder> {


    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
private int j;
View view;

    public FrozenAdapter(@NonNull FirebaseRecyclerOptions<ProductModels> options) {
        super(options);
    }
    public FrozenAdapter(@NonNull FirebaseRecyclerOptions<ProductModels> options, int i) {
        super(options);
        j = i;
    }


    @Override
    protected void onBindViewHolder(@NonNull FrozenHolder holder, int position, @NonNull ProductModels model) {
    holder.prod.setText(model.getModel_Name());
    holder.image.setImageResource(model.getModel_Image());
    Glide.with(holder.image.getContext()).load(model.getModel_Image()).into(holder.image);

    holder.card.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        Intent intent = new Intent(holder.itemView.getContext(), Specifications.class);
               intent.putExtra("Item_Name", model.getModel_Name());
               intent.putExtra("Item_Image", model.getModel_Image());
        }
    });



    }

    @NonNull
    @Override
    public FrozenHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_model, parent, false);
        return new FrozenHolder(view);
    }


    class FrozenHolder extends RecyclerView.ViewHolder {
        TextView prod;
        ImageView image;
        CardView card;
        public FrozenHolder(@NonNull View itemView) {
            super(itemView);
            prod = itemView.findViewById(R.id.product_text);
            image = itemView.findViewById(R.id.product_image);
            card = itemView.findViewById(R.id.product_view);
        }
    }
}
