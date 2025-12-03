import java.util.Scanner;

public class DeleteBook {
    static Scanner in = new Scanner(System.in);
    static void runDeleteBook() {
        boolean check = true;
        System.out.println("Введите название книга, которого вы хотите удалить: ");
        String titleBookDelete=in.nextLine();
        for(int i = 0 ; i < AddABook.booksArray.size() ; i++){
            if(titleBookDelete.equals(AddABook.booksArray.get(i).title)){
                AddABook.booksArray.remove(i);
                System.out.println("Удалено успешно");
                check=false;
            }
        }
        if(check){
            System.out.println("Этот книги нет в библиотеке");
        }




    }
}
