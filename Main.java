package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

    Books paper= new PaperBook("3333s","game of thrones",2024,200,100);
    Books ebook=new EBook("2000s","Titanic",1900,400,"romantic");
    Books showcase=new ShowCase("3444f","Harry poter",2015,300);

    BookOperations bookOperations= new BookOperations();

    bookOperations.AddBooks(paper);
    bookOperations.AddBooks(ebook);
    bookOperations.AddBooks(showcase);

    bookOperations.BuyBooks("3333s",1,"game of thrones","rwanashraf@gmail.com","Elsheikh Zayed");
    bookOperations.BuyBooks("2000s",1,"Titanic","rwanashraf@gmail.com",null);
    bookOperations.BuyBooks("3444f",3,"Harry poter",null,"Elsheikh Zayed");

    System.out.println("The book removed: " +bookOperations.RemoveBooks());
    }
}