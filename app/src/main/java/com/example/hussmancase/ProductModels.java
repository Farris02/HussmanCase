package com.example.hussmancase;

public class ProductModels {

    String Model_Name;
    int Model_Image;


    public ProductModels(String Model_Name, int Model_Image){
        this.Model_Name = Model_Name;
        this.Model_Image = Model_Image;

    }

    public ProductModels() {
    }

    public String getModel_Name() {
        return Model_Name;
    }

    public void setModel_Name(String Model_Name) {
        this.Model_Name = Model_Name;
    }

    public int getModel_Image() {
        return Model_Image;
    }

    public void setModel_Image(int Model_Image) {
        this.Model_Image = Model_Image;
    }


}
