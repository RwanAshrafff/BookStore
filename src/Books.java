package org.example;

public abstract class Books {
    protected String ISBN,title;
    protected int year;
    protected double price;
    public Books (String ISBN, String title,int year,double price)
    {
        this.ISBN=ISBN;
        this.title=title;
        this.year=year;
        this.price=price;
    }
    public abstract void BuyBooks(String ISBN,int quantity,String title,String email,String address);
}
