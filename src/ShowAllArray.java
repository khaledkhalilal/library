
public class ShowAllArray {
    static void runShowAllAraay(){
        for(int i =0 ; i< AddABook.booksArray.size()-1; i++){
            for(int j=0 ; j< AddABook.booksArray.size()-i-1 ; j++){
                if(AddABook.booksArray.get(j).year<AddABook.booksArray.get(j+1).year){
                    Book temp= AddABook.booksArray.get(j);
                    AddABook.booksArray.set(j,AddABook.booksArray.get(j+1));
                    AddABook.booksArray.set(j+1,temp);
                }
            }
        }
        System.out.println(AddABook.booksArray);
    }
}
