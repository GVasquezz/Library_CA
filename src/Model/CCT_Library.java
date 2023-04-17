/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Scanner;
import CSV_FileReader.*;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;




/**
 *
 * @author Francisco + Gonzalo
 */
public class CCT_Library {
    
  private String[] books = {"The Great Gatsby", "To Kill a Mockingbird", "1984"};
    // A METHOD COMES FROM FILE READER.JAVA
    
  
   
   FileReader fl = new FileReader();
   
   ArrayList<Readers> readers = fl.loadReaders();
    Scanner myKB = new Scanner(System.in);
    
    public void displayMenu() {
        System.out.println("Welcome to the Library!");
        System.out.println("Please choose an option:");
        System.out.println("1. Display all books"); 
        System.out.println("2. Borrow a book");
        System.out.println("3. Return a book");
        System.out.println("4. Quit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                displayBooks();
                fl.sortReadersByName(readers);
                
                break;
            case 2:
                borrowBook();
                break;
            case 3:
                returnBook();
                break;
            case 4:
                System.out.println("Thanks for visiting the Library!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                displayMenu();
                break;
        }
    }

    private void displayBooks() {
        System.out.println("Available books:");
        for (String book : books) {
            System.out.println("" + books);
        }
        displayMenu();
    }

    private void borrowBook() {
        System.out.println("Which book would you like to borrow?");

        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();

        if (bookExists(book)) {
            System.out.println("You have borrowed " + book + ".");
        } else {
            System.out.println("Sorry, " + book + " is not available.");
        }

        displayMenu();
    }

    private void returnBook() {
        System.out.println("Which book would you like to return?");

        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();

        if (bookExists(book)) {
            System.out.println("You have returned " + book + ".");
        } else {
            System.out.println("Sorry, " + book + " is not a valid book.");
        }

        displayMenu();
    }

    private boolean bookExists(String book) {
        for (String b : books) {
            if (b.equals(book)) {
                return true;
            }
        }
        return false;
    }
}
