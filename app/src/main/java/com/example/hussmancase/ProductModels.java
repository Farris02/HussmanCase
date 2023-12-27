package com.example.hussmancase;

public class ProductModels {

    String name;
    String image;


    public ProductModels(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public ProductModels(){}

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
