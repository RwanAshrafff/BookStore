package org.example;

public class EBook extends Books{
    String FileType;
    public EBook(String ISBN, String title,int year,double price,String FileType){
        super(ISBN,title,year,price);
        this.FileType=FileType;
    }
    @Override
    public void BuyBooks(String ISBN, int quantity, String title,String email,String address) {
        System.out.println("you should pay for ebook: "+ quantity*price);
        EmailService.sent(email);
    }
}
