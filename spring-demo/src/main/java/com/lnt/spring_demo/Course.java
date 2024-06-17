package com.lnt.spring_demo;

public class Course {
    int id;
    String title;
    double price;
    public Course(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Course [id=" + id + ", title=" + title + ", price=" + price + "]";
    }

    
}
