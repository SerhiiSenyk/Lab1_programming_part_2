
package lab_1;

/**
 *
 * @author Serhii-PC
 */

public class Lab_1 {
    public static void main(String[] args) {
        Book firstBook = new Book(343,"Brian Kernighan",450,
                "The C Programming language",1978,"Prentice Hall",10000);
        Book secondBook = new Book(500,"Jerome Selindger",200.5,
        "The Catcher in the Rye");
        Book thirdBook = new Book();
        System.out.println(firstBook.toString());
        System.out.println(secondBook.toString());
        System.out.println(thirdBook.toString());
        Book.printStaticField();
        firstBook.printField();
    }
    
}
