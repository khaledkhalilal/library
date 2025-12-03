public class Book {
    String  title;
    String author;
    int year;
    Book(String title, String author,int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }
    public String toString() {
        return "\n Название: ["+ title +"] -- Автор: ["+ author+"] -- Год: [("+year+")]"+
                "\n::::::::::::::::::::::::::::::::::";
    }



}
