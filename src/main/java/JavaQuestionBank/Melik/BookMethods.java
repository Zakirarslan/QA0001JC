package JavaQuestionBank.Melik;

import java.util.List;
import java.util.Scanner;

public class BookMethods {
    //Runner obj=new Runner();
    Scanner input=new Scanner(System.in);



    public static void searchUser(List<User> users,List<Book> books){
        int indexOfUser=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter userId ");
        String enteredId=input.next();

        for (int i=0; i<users.size();i++){
            if (users.get(i).getUserId().equals(enteredId)){
                System.out.println("User Name: "+users.get(i).getUserName()+
                        " User Surname:  "+users.get(i).getUserSurname());
                indexOfUser=i;
            }
        }

        System.out.println("Enter title Of book ");
        String title = input.next();
        int indexOfBook=0;
        for (int i=0; i<books.size();i++){

            if (books.get(i).getTittle().equals(title)){
                System.out.println(books.get(i).toString());
                indexOfBook=i;
            }

        }
        System.out.println("Please enter a or A to lend the selected book ");
        String selectedOperatiion=input.next();
        if (books.get(indexOfBook).getAvailability()==1) {

            books.get(indexOfBook).setAvailability(0);
            users.get(indexOfUser).setRentedBook(books.get(indexOfBook));
        }

        System.out.println(users.get(indexOfUser).toString());


    }

}
