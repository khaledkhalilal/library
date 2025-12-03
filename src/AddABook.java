
import java.util.ArrayList;
import java.util.Scanner;

public  class AddABook {
    static  Scanner in = new Scanner(System.in);
    static ArrayList<Book> booksArray = new ArrayList<Book>();
  static void runAddBook(){
        boolean check = true;
        System.out.print("Название: ");
        String title = in.nextLine();
        for(int i=0 ; i< booksArray.size();i++){
            if(title.equals(booksArray.get(i).title)){
                System.out.println("Это книга уже есть в библиотеке ");
                check = false;
                break;
            }
        }
        if(check) {
            System.out.print("Автор: ");
            String author = in.nextLine();
            System.out.print("Год: ");
            int year = in.nextInt();
            in.nextLine();
            booksArray.add(new Book(title, author, year));
        }
    }

}
