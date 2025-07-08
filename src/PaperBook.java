package org.example;

public class PaperBook extends Books{
    private int stock;
    public PaperBook(String ISBN, String title,int year,double price,int stock)
    {
        super(ISBN,title,year,price);
        this.stock=stock;
    }

    @Override
    public void BuyBooks(String ISBN,int quantity, String title,String email,String address) {
        if (stock < quantity)
        {
            System.out.println("There is no enough quantity of books");
        }

        else {
            stock-=quantity;
            ShippingService.send(address);
            System.out.println("You should pay for paper book: " + price*quantity );
        }
    }
}
