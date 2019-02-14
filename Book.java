
package lab_1;

/**
 *
 * @author Serhii-PC
 */
public class Book {
    private static int numberOfbooks = 0;

    private int countOfPages;
    private String author;
    private double  priceInHryvnias;
    private String title;
    private int yearOfPublication;

    protected String publisher;
    protected int circulation;
    
    public void setCountOfPages(int countOfPages){
        this.countOfPages = countOfPages;
    }      
    public int getCountOfPages(){
        return countOfPages;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String GetAuthor(){
        return author;
    }
    public void setPriceInHryvnias(double priceInHryvnias){
        this.priceInHryvnias = priceInHryvnias;
    }
    public double getPriceInHryvnias(){
        return priceInHryvnias;
    } 
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setYearOfPublication(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }
    public int getYearOfPublication(){
        return yearOfPublication;
    }
    
    Book(int countOfPages,
           String author,
           double  priceInHryvnias,
           String title,
           int yearOfPublication,
           String publisher,
           int circulation){
        this.countOfPages = countOfPages;
        this.author = author;
        this.priceInHryvnias = priceInHryvnias;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.publisher = publisher;
        this.circulation = circulation; 
        ++numberOfbooks;
    }
    Book(int countOfPages,
           String author,
           double  priceInHryvnias,
           String title){
        this(countOfPages,author,priceInHryvnias,title,0,"0",0);
    }
    Book(){
       this(0,"0",0,"0",0,"0",0);    
    }
    @Override
    public String toString(){
        String informationAboutBook = "\nInformation about book :\n"
                + "Count of pages : " + countOfPages +
                "\nauthor : " + author + "\nprice in hryvnias : "
                + priceInHryvnias + "\ntitle : " + title +
                "\nyear of publication : " + yearOfPublication +
                "\npublisher : " + publisher +
                "\ncirculation : " + circulation;
        return informationAboutBook;          
    }
    public static void printStaticField(){
        System.out.println(numberOfbooks);
    }
    public void printField(){
        System.out.println(numberOfbooks);
    }
    public void resetValues(int countOfPages,
           String author,
           double  priceInHryvnias,
           String title,
           int yearOfPublication,
           String publisher,
           int circulation){
        setCountOfPages(countOfPages);
        setAuthor(author);
        setPriceInHryvnias(priceInHryvnias);
        setTitle(title);
        setYearOfPublication(yearOfPublication);
        this.publisher = publisher;
        this.circulation = circulation;
    }
}
