
	final public class Audibook extends Book {
		  double length;
		  double size;
	  
		  public Audibook(String author, double price, int chapterCount, String title) {
		    super(author, 0, price, chapterCount, title);
		    System.out.println("Hello from audiobook constructor!");
		  
		  } 
		  public void setAuthor(String author) {
		    //we are calling parent version of method setAuthor
		    super.setAuthor(author);
		    System.out.println("AudioBook class: setting author");
		    this.author = author;
		  }
	}