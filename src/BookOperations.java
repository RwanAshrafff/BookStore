package org.example;
import java.util.ArrayList;
import java.util.List;

public class BookOperations {
    List<Books> books=new ArrayList<>();
    public void AddBooks(Books book)
    {
        books.add(book);
    }

    int CurrentYear=2025;
    public String RemoveBooks()
    {
       for(Books i:books )
       {
           if (i.year+100<2025)
               return i.title;
       }
        return null;
    }
    public void BuyBooks(String ISBN,int quantity,String title,String email ,String address) throws Exception {
        Books book=null;
        for (Books i: books)
        {
            if (i.ISBN.equals(ISBN))
            {
                book=i;
                break;
            }
        }
        if (book==null)
        {
            throw new Exception("The book doesnot exist");
        }
        else
        {
            book.BuyBooks(ISBN,quantity,title,email,address);
        }
    }
}
