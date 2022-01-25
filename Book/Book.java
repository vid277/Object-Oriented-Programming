    /**
 * A class that maintains information on a book. 
 *This might form part of a larger application such as a library system, for instance
 *
 * @Vidyoot Senthilvenkatesh (your name)
 * @V1.0 
 */
public class Book
{
    // instance variables - replace the example below with your own
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    
    /**
     * Constructor for objects of class Book
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean courseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        this.courseText = courseText;
    }
    
    //This method prints the author of the book
    public void printAuthor(){
        System.out.println("The author is: "+ author);
    }
    
    //This method prints the title of the book
    public void printTitle(){
        System.out.println("The book title is: "+ title);
    }
    
    ///This method returns the number of pages in the book
    public int getPages(){
        return pages;
    }
    
    //Prints the details of the book
    public void printDetails(){
        if (refNumber.length() > 0){
            System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
            System.out.println("Reference Number: " + refNumber);
            System.out.println("Borrowed: " + borrowed);
        }
        else {
            System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
            System.out.println("Reference Number: ZZZ");
            System.out.println(borrowed);
        }
    }
   
    //This method sets the reference number for the book
    public void setRefNumber (String refr){
        if (refr.length() >= 3){
            refNumber = refr;
        } else {
            System.out.println("Error. Incorrect reference number!");
        }
    }
    
    //Returns the reference number
    public String getRefNumber(){
        return refNumber;
    }
    
    //This method checks the number of times a book has been borrowed
    public void borrow(){
        borrowed++;
    }
    
    //This method returns the number of times a book was borrowed
    public int getBorrowed(){
        return borrowed;
    }
    
    // //This method returns whether this book is part of a course
    public void isCourseText(){
        if (courseText) {
            System.out.println("This book is a textbook");
        } else {
            System.out.println("This book is not a textbook");
        }
    }
}
