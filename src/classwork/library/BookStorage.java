package classwork.library;

public class BookStorage {

    private Book[] books = new Book[10];
    private int size;

    public void add(Book book){
        if (size == books.length){
            extend();
        }
        books[size++] = book;
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println("TITLE: " + books[i].getTitle());
            System.out.println("AUTHOR NAME: " + books[i].getAuthorName());
            System.out.println("PRICE: " + books[i].getPrice());
            System.out.println("COUNT: " + books[i].getCount());
            System.out.println("---------------------");
        }
    }

    public void search(String keyword){
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword) || books[i].getAuthorName().contains(keyword)){
                System.out.println("TITLE: " + books[i].getTitle());
                System.out.println("AUTHOR NAME: " + books[i].getAuthorName());
                System.out.println("PRICE: " + books[i].getPrice());
                System.out.println("COUNT: " + books[i].getCount());
                System.out.println("---------------------");
            }else {
                System.out.println("We have not that book");
            }
        }
    }

    private void extend() {
        Book [] tmp = new Book[books.length + 10];
        System.arraycopy(books,0,tmp,0,books.length);
        books = tmp;
    }
}
