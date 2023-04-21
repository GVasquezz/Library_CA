/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Scanner;
import CSV_FileReader.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import Utilities.*;
import java.io.IOException;
import java.util.List;








/**
 *
 * @author Francisco + Gonzalo
 */
public class CCT_Library{
    
    
   
    
   
    
   //private String[] books = {"The Great Gatsby", "To Kill a Mockingbird", "1984"};
    // A METHOD COMES FROM FILE READER.JAVA
   
  
    public void displayMenu() throws FileNotFoundException, IOException {
        
      
      Search search = new Search(); 
    
      
        
        System.out.println("Welcome to the Library!");
        System.out.println("Please choose an option:");
        System.out.println("1. Display all books");
        System.out.println("2. Search a book by title"); 
        System.out.println("3. Register a student to borrow a book ");
        System.out.println("4. Return a book");
        System.out.println("5. List all students by alphabetical name");
        System.out.println("6. List all students by id ");
        System.out.println("7. Quit");

        Scanner myKB = new Scanner(System.in);
        int menuChoice = myKB.nextInt();
        String bookChoice = myKB.nextLine();
        
        Data data = new Data();
         ArrayList<Students> students = (ArrayList<Students>)data.getAllStudents();
         Sort sort = new Sort();

        switch (menuChoice) {
            
           
            case 1:
                
              System.out.println("All books by title: \n");
               
                 displayBooks();
                 displayMenu();
            
                break;
            case 2:
                Data bookData = new Data();
                
                System.out.println("Type the book title");
                String booktitle = myKB.nextLine();
                System.out.println("The book: " + bookData.getAllBooks() + "was found");
//                search.SearchBookTitle(bookData.getAllBooks(), booktitle );
                
                displayMenu();
                
                break;
            case 3:
                
                 System.out.println("BORROWED BOOKS");
                 borrowBook();
               
                break;
            case 4:
//                returnBook();
                break;
            case 5 :
                
                sortStudents(students,sort ,"name");
                displayMenu();
                
                
                
                
                break;
            case 6:
                sortStudents(students,sort,"id");
                displayMenu();
                break;
            case 7:
                System.out.println("Thanks for visiting the Library!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                displayMenu();
                break;
        }
    }
    
   //This methods returns all available books in the library, and displays the menu again.    
   public  void displayBooks() throws FileNotFoundException, IOException {
       
        Data data = new Data();  
        
       List<Books> books = (List<Books>) data.getAllBooks();
        
        System.out.println("Available books:");
        System.out.println(books);
        displayMenu();
    }

   public void borrowBook()  throws FileNotFoundException, IOException{
       
     
        
       Data data = new Data();  
        
       ArrayList<Books> books = (ArrayList<Books>) data.getAllBooks();
        System.out.println("Which book would you like to borrow?");
      
        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();

         String [] array = {book};
        System.out.println("You have borrowed  : " +data.booksborrowed(array)  );
       

        displayMenu();
        
    }

//    private void returnBook() throws FileNotFoundException, IOException {
//        System.out.println("Which book would you like to return?");
//
//       Scanner scanner = new Scanner(System.in);
//        String book = scanner.nextLine();
//
//        if (bookExists(book)) {
//            System.out.println("You have returned " + book + ".");
//        } else {
//           System.out.println("Sorry, " + book + " is not a valid book.");
//        }
//
//        displayMenu();
//    }
//
//    public boolean bookExists(String book) {
//     
//        
//        for (String b : books) {
//            if (b.equals(book)) {
//                return true;
//            }
//        }
//        return false;
//    }
   
    public static void sortStudents(ArrayList<Students> students, Sort sort, String column) {
        int n = students.size();
        sort = new Sort();
        sort.sortStudent(students, 0, n - 1, column);
        Sort.printArrayStudent(students);

    }
}
