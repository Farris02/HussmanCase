package com.example.hussmancase;


    public class CategoryModel {

        String cat_name;
        int cat_image;

        public CategoryModel(String cat, int image){
            this.cat_name = cat;
            this.cat_image = image;
        }
        public CategoryModel(){}

        public String getCat_name() {
            return cat_name;
        }

        public void setCat_name(String cat_name) {
            this.cat_name = cat_name;
        }

        public int getCat_image() {
            return cat_image;
        }

        public void setCat_image(int cat_image) {
            this.cat_image = cat_image;
        }
    }

