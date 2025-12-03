import java.util.Scanner;

public class SearchInArray {
    static void runSearshInArray(){
        Scanner in = new Scanner(System.in);
        boolean Check=true;
        System.out.println("Введите название книги:");
        String titleBook= in.nextLine();
        for(int i =0 ; i< AddABook.booksArray.size();i++){
            if(titleBook.equals(AddABook.booksArray.get(i).title)){
                System.out.println(AddABook.booksArray.get(i));
                Check=false;
            }
        }
        if(Check){
            System.out.println("Этот книги нет в библиотеке");
        }

    }
}
