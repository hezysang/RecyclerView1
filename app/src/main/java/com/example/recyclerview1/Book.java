package com.example.recyclerview1;

public class Book {

    private String Tittle;
    private String Category;
    private String Description;
    private int Thumbnails;


    public Book() {
    }


    public Book(String tittle, String category, String description, int thumbnails) {
        Tittle = tittle;
        Category = category;
        Description = description;
        Thumbnails = thumbnails;
    }


    public String getTittle() {
        return Tittle;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnails() {
        return Thumbnails;
    }


    public void setTittle(String tittle) {
        Tittle = tittle;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnails(int thumbnails) {
        Thumbnails = thumbnails;
    }
}
