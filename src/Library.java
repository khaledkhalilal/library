import java.util.Scanner;

public class Library {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean running= true;
        while (running){
        Choices.Choice();
        int SelectedNumber = in.nextInt();
        switch(SelectedNumber ){
            case 1 :
                System.out.println("Добавить книгу");
                AddABook.runAddBook();
                break;
            case 2 :
                System.out.println("Показать все книги");
                ShowAllArray.runShowAllAraay();
                break;
            case 3 :
                System.out.println("Удалить книгу.");
                DeleteBook.runDeleteBook();
                break;
            case 4:
                System.out.println("Поиск книги по названию");
                SearchInArray.runSearshInArray();
                break;
            case 5:
                running=false;
                break;
            default:
                System.out.println("Неправильный выбор, пожалуйста, попробуй еще раз...");
                break;
        }
    }

    }

}
