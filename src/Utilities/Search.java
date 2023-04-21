
package Utilities;

import CSV_FileReader.Data;
import java.util.ArrayList;
import Model.*;
import java.io.IOException;

/**
 *
 * @author Gonzalo Vasquez
 */
public class Search {
    /**
     * 
     * @param bookTitle
     * @return This method returns an specific book, searched by title.
     * @throws IOException 
     */
    
    
    public ArrayList<Books> searchByBookTitle(String bookTitle) throws IOException {
    
    Data booksData = new Data();
    //Loads all book data into my new myBooks ArrayList
    ArrayList<Books> myBooks = booksData.getAllBooks();
    //Creates an ArrayList of books by author where all books that match author's last name will be stored.
    ArrayList<Books> booksByTitle = new ArrayList<>();
    
    
    for (Books book : myBooks) {
        if (book.getBook_title().equalsIgnoreCase(bookTitle)) {
            booksByTitle.add(book);
        }
    }
        System.out.println("We have found the following book: " + booksByTitle);  
        
    return booksByTitle;
}
    
    
 
    /**
     * 
     * @param authorLastName
     * @return This method returns an specific book, searched by author's last name.
     * @throws IOException 
     */
    
    public ArrayList<Books> searchByAuthorLastName(String authorLastName) throws IOException {
    
    Data booksData = new Data();
    //Loads all book data into my new myBooks ArrayList
    ArrayList<Books> myBooks = booksData.getAllBooks();
    //Creates an ArrayList of books by author where all books that match author's last name will be stored.
    ArrayList<Books> booksByAuthor = new ArrayList<>();
    
    
    for (Books book : myBooks) {
        if (book.getAuthor_last_name().equalsIgnoreCase(authorLastName)) {
            booksByAuthor.add(book);
        }
    }
        System.out.println("We have found the following book: " + booksByAuthor);  
        
    return booksByAuthor;
}
    
    
    /**
     * 
     * @param studentLastName
     * @return This method returns a specific Student, searched by Student's last name.
     * @throws IOException 
     */
    public ArrayList<Students> searchStudentLastName(String studentFullName) throws IOException {
    
    Data studentsData = new Data();
    //Loads all Students data into my new myStudents ArrayList
    ArrayList<Students> myStudents = studentsData.getAllStudents();
    //Creates an ArrayList of books by author where all books that match author's last name will be stored.
    ArrayList<Students> studentsByName = new ArrayList<>();
    
    
    for (Students student : myStudents) {
        if (student.getName().equalsIgnoreCase(studentFullName)) {
            studentsByName.add(student);
        }
    }
        System.out.println("We have found the following student: " + studentsByName); 

        
    return studentsByName;
}
 
    
    /**
     * 
     * @param studentLastName
     * @return This method returns a specific Student, searched by Student's last name.
     * @throws IOException 
     */
    public ArrayList<Students> searchStudentID(Long ID) throws IOException {
    
    Data studentsData = new Data();
    //Loads all Students data into my new myStudents ArrayList
    ArrayList<Students> myStudents = studentsData.getAllStudents();
    //Creates an ArrayList of books by author where all books that match author's last name will be stored.
    ArrayList<Students> studentsByID = new ArrayList<>();
    
    
    for (Students student : myStudents) {
        if (student.getId().equals(ID)) {
            studentsByID.add(student);
        }
    }
        System.out.println(myStudents.get(0).getId());
        System.out.println("We have found the following student: " + studentsByID); 

        
    return studentsByID;
}
    
}
