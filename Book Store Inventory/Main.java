//===================================================  
// Name       :  Emad Tirmizi
// SID        :  31400222
// Course     :  IT114 
// Section    :  
// Instructor :  Maura Deek
// T.A        :   
//===================================================  
//===================================================  
// Assignment # :   1
// Date         :  10/4/2018
//===================================================  
//===================================================  
// Description: This program will create a library of
// books and authors for the user to see/choose from 
// initially. Upon Running it will prompt the user to
// perform an action (be it a search or print). Add 
// the author and book info if not in the system and 
// author caps aren’t reached. 
//===================================================  


import java.util.*;
//create a book class
class Book{
	private String Title;
	private String ISBN;
	private String Genre;
	private double Price;
//create variables   
//create book class for the book's information, this defines what the book is
   public Book(String Title, String ISBN, String Genre, double Price){
		this.Title = Title;
		this.ISBN = ISBN; 
		this.Genre = Genre;
		this.Price = Price;
//give them values
	}//end for Book method
//set and get to retrieve and store the values for the variables to be printed in the toString when the book info is called upon
	public void setTitle(String s){
		this.Title = s;
	}//end for setTitle
	public void setISBN(String s){
		this.ISBN = s;
	}//end for setISBN
	public void setGenre(String s){
		this.Genre = s;
	}//end for setGenre
	public void setPrice(double Price){
		this.Price = Price;
	}//end for setPrice
	public String getTitle(){
		return Title;
	}//end for getTitle
	public String getISBN(){
		return ISBN;
	}//end for getISBN
	public String getGenre(){
		return Genre;
	}//end for getGenre
	public double getPrice(){
		return Price;
	}//end for getPrice
	public String toString(){
		return "Book Title: " + Title + "\n" + "ISBN: " + ISBN + "\n" + "Genre: " + Genre + "\n" + "Price: " + Price + "\n\n";
	}//end for toString
//create string that will be printed when book is displayed
}//end for Book Class
//create class for Author's books
class Author{
	private String Last;
	private String First;
//create an array for books by the author
	private ArrayList<Book> book = new ArrayList<Book>();
//create Author method  to be used when assiging books to authors
	public Author(String Last, String First){
		this.Last = Last;
		this.First = First;
	}//end for Author method
	public String getLast(){
		return Last;
	}//end for getLast
	public String getFirst(){
		return First;
	}//end for getFirst
	public ArrayList<Book> getBooks() {
		return book;
	}//end for getBooks
	public void setLast(String s){
		Last = s;
	}//end for setLast
	public void setFirst(String s){
		First = s;
	}//end for setFirst
	public void setBooks(ArrayList<Book>b){
		book = b;
	}//end for setBooks
//get and set the values for the variables of book, author last, first name
//create a function for adding books into the array for the author
	public boolean addBook(Book b){
		if(book.size()<=5){
			book.add(b);
			return true;
		}//end for if
		else{
			return false;
		}//end for else
	}//end for addBook method
	public String toString(){
		return Last + ", " + First + "\n" + "Book info: " + book;
	}//end for toString method
}//end for Author class
//create a class for an array that holds and add Authors to the array
class AddAuth{
	private ArrayList<Author> Author = new ArrayList<Author>();
	public ArrayList<Author> getAuthor(){
		return Author;
	}//end for ArrayList metod
//if array size is less than or equal to 30 the system will return true and the boolean command will let you add them to the list
//if they are over 30 then the system will return false and the command will not be executed
	public boolean addAuthor(Author A){
		if(Author.size()<=30){
			Author.add(A);
			return true;
		}//end if
		else{
			return false;
		}//end else
	}//end addAuth method
}//end addAuth class
//create a main method to run the system
public class Main{
	public static void main(String[] args){    
//create books to be added into the system so that its not empy.
//The order displayed is Title, ISBN, Genre, Price
		Book b1 = new Book("Catcher in the Rye", "11511151", "Literary Realism", 4.93);       
		
      Book b2 = new Book("The Outsiders", "1212154", "Young Adult Fiction", 14.00);     
		
      Book b3 = new Book("The Giver", "13245616", "Young Adult Fiction", 6.99);     
//These are only sperated by spaced because it was making it easier for me to assign them to the correct authors.      
		Book b4 = new Book("Harry Potter and the Sorcerer's Stone", "465498465", "Fantasy Fiction", 8.99);
		Book b5 = new Book("Harry Potter and the Chamber of Secrets", "4194119", "Young Adult Fiction", 8.99);
		Book b6 = new Book("Harry Potter and the Prisoner of Azkaban", "559121", "Young Adult Fiction", 8.99);
		Book b7 = new Book("Harry Potter and the Goblet of Fire", "131881", "Young Adult Fiction", 8.99);
		Book b8 = new Book("Harry Potter and the Order of the Phoenix", "33652", "Young Adult Fiction", 8.99);
//add authors to the array
//add a book to that author specifically
      AddAuth addA = new AddAuth(); 
		Author A1 = new Author("Salinger", "Jerome");
		A1.addBook(b1);
//Adding programmed authors
		addA.addAuthor(A1); 
//add authors to the array
//add a book to that author specifically     
		Author A2 = new Author("Hinton", "Susan");
		A2.addBook(b2);
//Adding programmed authors
		addA.addAuthor(A2);
//add authors to the array
//add a book to that author specifically     
		Author A3 = new Author("Lowry", "Lois");
		A3.addBook(b3);
//Adding programmed authors
		addA.addAuthor(A3);     
//add authors to the array
//add a book to that author specifically
//I gave J.K Rowling more books to demonstrate it not being allowed to add more than 5 books.
		Author A4 = new Author("Rowling", "Joanne");
//Add the Books to the author
		A4.addBook(b4);
		A4.addBook(b5);
		A4.addBook(b6);
		A4.addBook(b7);
		A4.addBook(b8);
//Adding programmed authors
		addA.addAuthor(A4);
//Create a selection screen for the user to interact with
		System.out.println(" Enter '1': to Show all authors \n Enter '2': to Search for an Author" + "\n Enter '3': to Exit and Close the Operation");
//This picks up the input from the user
		Scanner sc = new Scanner(System.in);
//The int option is for the selection screen. I found it the easiest way to use an int value rather than a string for the choices 
			int option = sc.nextInt();
			while(option!= 3) {
				sc.nextLine();        
//if 1 is entered into the system. The function calls Author to display all the authors and books stored.
				if(option == 1) {
					for(Author A : addA.getAuthor()) {
						System.out.println(A);
					}//end for
				}//end if
//else if 2 is selected the system asks to enter the Authors Name
			else if(option == 2) {
//The point of the check is to see if the Author is or isn’t in the library. If it is the check will = 1, if not check will = 0.
            int check = 0;
            String selection;
				System.out.print("Please Enter Author's Last Name: ");
				String Last = sc.nextLine();
//Value gets stored in Last
				System.out.print("Please Enter Author's First Name: ");
				String First = sc.nextLine();
//Value gets stored in First
          
				for(Author A : addA.getAuthor()) {
//This takes in the author's full name, disregarding cap sensitivity, and prints out all the books and book info that are under that author
					if(A.getLast().equalsIgnoreCase(Last) && A.getFirst().equalsIgnoreCase(First)) {
					   System.out.println(A);
					   check = 1;
					}//end if
				}//end for     
//since the check was not changed that means that the book wasn't in the system.
//the book will now add the Author and Book information to the system 
				if(check == 0){
					System.out.println("Sorry but that Author/Book isn't in our library. Lets order it now");
//Retrives the Last name of the author and assigns it to variable Last
					System.out.print("What is the Author's Last Name: ");
					Last = sc.nextLine();
//Retrives the First name of the author and assigns it to variable First
					System.out.print("What is the Author's First Name: ");
					First = sc.nextLine();
//Creates a temp holder for the Variables Last,First used in the last step to be input later with the appropriate book information
					Author temp = new Author(Last,First);
//Adding the author to the array from the temp using .addAuthor
					if(addA.addAuthor(temp)) {
						do {
							System.out.print("Please Enter the Book Title you wish to Order: ");
							String Title = sc.nextLine();
//Retrieves the Title from the User's Input and stores it in Title
							System.out.print("Please Enter the Book's ISBN: ");
							String ISBN = sc.nextLine();
//Retrives the ISBN from the User's Input and stores it in ISBN
							System.out.print("What is it's Genre: ");
							String Genre = sc.nextLine();
//Retrives the Genre from the User's Input and stores it in Genre
							System.out.print("What is the Price of the Book: ");
							double Price = sc.nextDouble();
//Retrives the Price from the User's Input and stores it in Price 
							sc.nextLine();
//Adds the Book information to the corresponding Author
							if(!temp.addBook(new Book(Title,ISBN,Genre,Price))){
								break;
							}//end if
//prompts user if they would like to add more books/authors by entering either yes or no.
							System.out.print("Would You Like to Add more Books? Please enter yes or no: ");
							selection = sc.nextLine();
						}//end do
//this allows the user to enter it without having to worry about spelling it in Uppercase or Lowercase
						while(selection.equalsIgnoreCase("yes"));
					}//end if
//if the author has 5 books than this will be prompted to the user, and the information will not be added
					else{
						System.out.println("Sorry The Author Can Only Have 5 Books in the Storage");
					}//end else
				}//end if
			}//End else if
//if no is selected or if the user chose to print, the user will be promted with the selection of what to do next.
			System.out.print("Press 1 to Print all, Press 2 to Search for an Author, Press 3 to Exit the program:\n");
			option = sc.nextInt();
//allows for the user to move on to the next selection
		}//End While
	}//End Main Method
}//End Class
