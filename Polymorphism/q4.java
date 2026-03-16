// Create class Book:
// title, author
// Two books should be equal if:
// title AND author are same
// Override:
// equals()
// hashCode()
import java.util.*;
public class q4{
    public static void main(String[] args) {
        Book b = new Book("Java", "Kirat");
        Book b1 = new Book("Java", "Kirat");
        Book b2 = new Book("CPP", "Itish");

        System.out.println(b.equals(b1));
        System.out.println(b.hashCode());
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }
}

class Book{
    String title;
    String author;

    Book(String title, String author){
        this.author = author;
        this.title = title;
    }

    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Book book = (Book) obj;
        return title.equals(book.title) && author.equals(book.author);
    }

    public int hashCode(){
        return Objects.hash(title, author);
    }
}