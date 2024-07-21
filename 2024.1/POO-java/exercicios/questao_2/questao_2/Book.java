package questao_2;


//classe book
public class Book{
    private String title;
    private String isbn;
    private int availableCopies;
    private Author author;
  
    
    public Book(String title, String isbn, int availableCopies, Author author){
      this.title = title;
      this.isbn = isbn;
      this.availableCopies = availableCopies;
      this.author = author;
    }
  
    //Getters
    public String getTitle(){
      return this.title;
    }
  
    public String getIsbn(){
      return this.isbn;
    }
  
    public int getAvaiableCopies(){
      return this.availableCopies;
    }
  
    public Author getAuthor(){
      return this.author;
    }
    
    //Setters
    public void setTitle(String title){
      this.title = title;
    }
  
    public void setIsbn(String isbn){
      this.isbn = isbn;
    }
  
    public void setAvailableCopies(int availableCopies){
      this.availableCopies = availableCopies;
    }
  
    public void setAuthor(Author author){
      this.author = author;
    }
  
    public void borrowBook(){
      if(this.availableCopies > 0){
        this.availableCopies--;
      }
    }
    public void returnBook(){
      this.availableCopies++;
    }
    
  }
