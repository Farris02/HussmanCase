package com.example.hussmancase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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

private ImageView plus1, plus2, plus3, plus4, minus1, minus2, minus3, minus4, LH_plus,
        RH_plus, LH_minus, RH_minus, Common_plus, Common_minus;

private TextView first_0, second_0, third_0, fourth_0, LH_0, RH_0, Common_0;
int quantity = 0, quantity2 = 0, quantity3 = 0, quantity4 = 0, quantity5 = 0, quantity6 = 0, quantity7 = 0;

int two_door_price = 4000, three_door_price = 5000, four_door_price = 6000, LH_price = 500, RH_price = 500, Common_price = 1000;
    private void getSpecs() {

        Intent intent = getIntent();
        if (intent != null) {

            name = intent.getStringExtra("Name");
            image = intent.getStringExtra("Image");

            Glide.with(this).load(image).into(spec_image);

            minus1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (quantity > 0) {
                        quantity--;
                        first_0.setText(Integer.toString(quantity));
                    }


                }


            });
            plus1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (quantity >= 20) {

                    } else {
                        quantity++;
                        first_0.setText(Integer.toString(quantity));
                    }


                }
            });
            minus2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (quantity2 > 0) {
                        quantity2--;
                        second_0.setText(Integer.toString(quantity2));
                    }


                }

            });
            plus2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (quantity2 >= 20) {

                    } else {
                        quantity2++;
                        second_0.setText(Integer.toString(quantity2));
                    }


                }

            });
            minus3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (quantity3 > 0) {
                        quantity3--;
                        third_0.setText(Integer.toString(quantity3));
                    }
                }
            });
            plus3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (quantity3 >= 20) {

                    } else {
                        quantity3++;
                        third_0.setText(Integer.toString(quantity3));
                    }
                }
            });
            minus4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (quantity4 > 0) {
                        quantity4--;
                        fourth_0.setText(Integer.toString(quantity4));
                    }
                }
            });
            plus4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (quantity4 >= 20) {

                    } else {
                        quantity4++;
                        fourth_0.setText(Integer.toString(quantity4));
                    }
                }
            });
            LH_minus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (quantity5 > 0) {
                        quantity5--;
                        LH_0.setText(Integer.toString(quantity5));
                    }
                }
            });
            LH_plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (quantity5 >= 20) {

                    } else {
                        quantity5++;
                        LH_0.setText(Integer.toString(quantity5));
                    }
                }
            });
            RH_minus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (quantity6 > 0) {
                        quantity6--;
                        RH_0.setText(Integer.toString(quantity6));
                    }
                }
            });
            RH_plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (quantity6 >= 20) {

                    } else {
                        quantity6++;
                        RH_0.setText(Integer.toString(quantity6));
                    }
                }
            });
            Common_minus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (quantity7 > 0) {
                        quantity7--;
                        Common_0.setText(Integer.toString(quantity7));
                    }
                }
            });
            Common_plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (quantity7 >= 20) {

                    } else {
                        quantity7++;
                        Common_0.setText(Integer.toString(quantity7));
                    }
                }
            });

        }


    }
private void initViews() {

        spec_image = findViewById(R.id.specifications_image);
        plus1 = findViewById(R.id.plus1);
        plus2 = findViewById(R.id.plus2);
        plus3 = findViewById(R.id.plus3);
        plus4 = findViewById(R.id.plus4);
        minus1 = findViewById(R.id.minus1);
        minus2 = findViewById(R.id.minus2);
        minus3 = findViewById(R.id.minus3);
        minus4 = findViewById(R.id.minus4);
        LH_plus = findViewById(R.id.LH_plus);
        LH_minus = findViewById(R.id.LH_minus);
        RH_minus = findViewById(R.id.RH_minus);
        RH_plus = findViewById(R.id.RH_plus);
        Common_plus = findViewById(R.id.Common_plus);
        Common_minus = findViewById(R.id.Common_minus);
        first_0 = findViewById(R.id.first_0);
        second_0 = findViewById(R.id.second_0);
        third_0 = findViewById(R.id.third_0);
        fourth_0 = findViewById(R.id.fourth_0);
        LH_0 = findViewById(R.id.LH_0);
        RH_0 = findViewById(R.id.RH_0);
        Common_0 = findViewById(R.id.Common_0);






    }

}