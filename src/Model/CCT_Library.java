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
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;







/**
 *
 * @author Francisco + Gonzalo
 */
public class CCT_Library{
    
    
   
   
    //Method that displays the main menu
   
  
    public void displayMenu() throws FileNotFoundException, IOException {
          
        Search search = new Search(); 
    
      
        
        System.out.println("Welcome to the Library!" + "\n");
        System.out.println("Please choose an option:" + "\n");
        System.out.println("1. Display all books");
        System.out.println("2. Search a book by title"); 
        System.out.println("3. Search a book by author's last name ");
        System.out.println("4. Search a student by name ");
        System.out.println("5. Search a student by ID ");
        System.out.println("6. List all students by alphabetical name ");
        System.out.println("7. List all students by ID ");
        System.out.println("8. List all books by title ");
        System.out.println("9. List all books by author ");
        System.out.println("10. Borrow a book");
        System.out.println("11. Return a book ");
        System.out.println("12. Quit");
        
        
        //Validation loop that will run as long as user input is not an integer from 1-12 inclusively.
        Scanner myKB = new Scanner(System.in);
        int menuChoice = 0;
        boolean validInput = false;
        do{
            try{
                
                menuChoice = myKB.nextInt();
                validInput = true;
                
        
            }catch (InputMismatchException e) {
                
                System.out.println("Wrong input. You must type an integer from 1-12" + "\n");
                myKB.nextLine();
                displayMenu();
            }
        } while (!validInput);
        
        
        String bookChoice = myKB.nextLine();
        
        
        
        Data studentData = new Data();
        
        ArrayList<Students> students = (ArrayList<Students>)studentData.getAllStudents();
        
        Sort sort = new Sort();
        
        Data bookdata = new Data();
          ArrayList<Books> books = (ArrayList<Books>) bookdata.getAllBooks();
        
        //Switch statement for menu choice.
          switch (menuChoice) {
            
           
            case 1:
                
              System.out.println("All books by title: \n");
               
                 displayBooks();
                 displayMenu();
            
                break;
            case 2:
               
                
                //Asks for books title
                System.out.println("Type book's title: ");
                String bookTitle = myKB.nextLine();
                
                search.searchByBookTitle(bookTitle);
                System.out.println("\n");
                displayMenu();
                
                break;
            case 3:
                
                 //Asks for author last name
                System.out.println("Type author's last name: ");
                String bookAuthor = myKB.nextLine();
                
                search.searchByAuthorLastName(bookAuthor);
                
                System.out.println("\n");
                displayMenu();
               
                break;
            case 4:
                 //Asks for student's last name
                System.out.println("Type student's full name: ");
                String studentsFullName = myKB.nextLine();
                
                search.searchStudentFullName(studentsFullName);
                
                System.out.println("\n");
                displayMenu();

                break;
            case 5:
                 //Asks for student's ID
                System.out.println("Type student's ID: ");
                Long studentsID = myKB.nextLong();
                
                search.searchStudentID(studentsID);
                
                System.out.println("\n");
                displayMenu();
            case 6 :
                
             
                // code here to list students by alphabetical order
                 sort.sortStudents(students, sort, "name");
                System.out.println("\n");
                displayMenu();
                
              
                
                break;
            case 7:
              // code here to list students by ID
                sort.sortStudents(students, sort, "id");
                System.out.println("\n");
                displayMenu();
                break;
            case 8:
                //Code here to list books by title
                
                
                sort.sortBooks(books, sort, "title");
                
               
                System.out.println("\n");
                displayMenu();
                break;
             case 9:
                //Code here to list books by author
                 sort.sortBooks(books, sort, "name");
                
                System.out.println("\n");
                displayMenu();
                break;   
             case 10:
                 //Creates a custom made queue object to use as a waiting list. 
                 MyOwnQueue waitingList = new MyOwnQueue();
                //Creates reader object
                 Readers reader = new Readers();
                //Code here to return a book
                 System.out.println("Enter Username: ");
                 reader.setName(myKB.nextLine());
                 System.out.println("Enter book name: ");
                 String bookName = myKB.nextLine();
                 //Creates an arraylist of all the bokos in the library.
                 Data data = new Data();  
        
                 ArrayList<Books> fullBookCollection = (ArrayList<Books>) data.getAllBooks();
                 
                 //Checks our full book collection for the book requested using a forEach loop.
                 //
                 boolean bookFound = false;
                 for (Books book : fullBookCollection) {
                    
                    if (book.getBook_title().equalsIgnoreCase(bookName)) {
                    bookFound = true;
                    fullBookCollection.remove(book);
         
                    reader.borrowBook(book);
                    System.out.println("Book borrowed successfully!");
                    break;
                    }
                }           
                //If it's not found, reader will be added to the waiting list
                if (!bookFound) {
                    
                    waitingList.Enqueue(reader);
                    System.out.println("The book " + bookName + " is currently unavailable. " + reader.getName() +  " has been added to the waiting list." + "\n");
                    displayMenu();
                }
                
                // write the borrowed list to a file
                try {
                    File borrowedFile = new File("borrowed_list.txt");
                    FileWriter writer = new FileWriter(borrowedFile, true);
                    writer.write(reader.getName() + " borrowed " + reader.getBorrowedBook().getBook_title() + "\n");
                    writer.close();
                 } catch (IOException e) {
                    e.printStackTrace();
                    }
                
                    
               System.out.println("\n");  
               displayMenu();
                break;
             case 11:
               //Code here to return a book
               System.out.println("Sorry, The current feature is not available for the moment. " + "\n" + "Please, try a different option.");
               displayMenu();
                break;
            case 12:
                System.out.println("Thanks for visiting the Library!");
               System.exit(0);
                break;
            default:
               System.out.println("Wrong input. You must type an integer from 1-12" + "\n");
                
                displayMenu();
                break;
        }
        
      
      
      
        
    }
      
    
   //This methods returns all available books in the library, and displays the menu again.    
   public  void displayBooks() throws FileNotFoundException, IOException {
       
        Data data = new Data();  
        
       ArrayList<Books> books = (ArrayList<Books>) data.getAllBooks();
        
        System.out.println("Available books:" + "\n") ;
        System.out.println(books);
        displayMenu();
    }

 


   
   
    
     
}

