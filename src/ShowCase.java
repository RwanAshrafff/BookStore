package org.example;

public class ShowCase extends Books{

    public ShowCase(String ISBN, String title,int year,double price){
        super(ISBN,title,year,price);
    }

    @Override
    public void BuyBooks(String ISBN,int quantity, String title,String email,String address) {
        System.out.println("Show case book is not for sale ");
    }
}
