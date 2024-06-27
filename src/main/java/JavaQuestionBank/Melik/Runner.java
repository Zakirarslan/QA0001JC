package JavaQuestionBank.Melik;

import d39Lambda.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Book book0 = new Book("", "", "", "", "", 1);
        Book book1 = new Book("B1", "Melik", "Java", "education", "22.01.2000", 1);
        Book book2 = new Book("B2", "Isa", "sql", "education", "22.01.2001", 1);
        Book book3 = new Book("B3", "Smitha", "html", "education", "22.01.2002", 0);
        Book book4 = new Book("B4", "Zakir", "jdbc", "education", "22.01.2003", 1);
        Book book5 = new Book("B5", "Burak", "sdlc", "education", "22.01.2004", 1);
        Book book6 = new Book("B6", "Ahmet", "stlc", "education", "22.01.2005", 1);


        List<Book> books = new ArrayList<>();
        books.add(book0);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        User user1=new User("U1","Zakir","Arslanov","123456789",false,book0);
        User user2=new User("U2","Isa","Ar","223456789",true,book0);
        User user3=new User("U3","Bonasmitha","Smitha","323456789",true,book0);
        User user4=new User("U4","Melik","Shah","423456789",false,book0);

        List<User> users=new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);


            BookMethods.searchUser(users,books);
           // Object aktivBook=BookMethods.searchTitle(books);
           // BookMethods.lending(aktivUser,aktivBook,books,users);




    }





}
