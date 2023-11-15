package Day15;
import java.util.Scanner;
class Book{
  private String title;
  private String author;
  private String isbn;
  private String publisher;

  public String getTitle(){
    return title;
  }
 
  public String getAuthor(){
    return author;
  }
  public void setAuthor(String author){
    this.author=author;
  }

public void setTitle(String next) {
	this.title=title;
	
}

public void setisbn(String next) {
	this.isbn=isbn;
	
}

public void setPublisher(String next) {
	this.publisher=publisher;
	
}

public String getisbn() {

	return isbn ;
}

public String getpublisher() {
	
	return publisher;
} 
}

class Author extends Book{
  Book b[];
  int i=0;
  Author(int size){
    b=new Book[size];
  }
  public void addBook(Book book){
	  int j=0;
    for(int i=0; i<b.length;i++){
      if(b[i].getTitle().equals(book)){
       
		for(int pos=j; pos<i-1; pos++){
          b[pos]=b[pos+1];
        }
        b[i-1]=null;
        i--;
      }
    }
  }
  public void print(){
    for(int j=0; j<i; j++){
      System.out.println(b[j].getTitle()+ " " +b[j].getAuthor()+ " "+b[j].getisbn()+ " " +b[j].getpublisher());
    }
  }
}
  
public class LibraryManagement{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of books:");
    int numBooks = sc.nextInt();
    Book b[] = new Book[numBooks];
    Author l = new Author(numBooks);
    for(int i=0; i<numBooks; i++){
      b[i]=new Book();
      System.out.println("Enter the title:");
      b[i].setTitle(sc.next());
      System.out.println("Enter the author:");
      b[i].setAuthor(sc.next());
      System.out.println("Enter the ISBN:");
      b[i].setisbn(sc.next());
      System.out.println("Enter the publisher:");
      b[i].setPublisher(sc.next());
      l.addBook(b[i]);
     l.print();
  }
}
}

