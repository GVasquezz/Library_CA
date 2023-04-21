/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSV_FileReader;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import Model.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Collection;
import java.util.LinkedList;




/**
 *
 * @author Gonzalo Vasquez + Francisco Arellano
 */
public class Data {
    
    //This method creates a "Bookfile" object and a bufferedReader "br" object.
    //This br object will read any string stored in the bookFile object.
    public static BufferedReader getCsv(String fileName) throws FileNotFoundException {
        
       File bookFile = new File(fileName);
       BufferedReader br = new BufferedReader(new FileReader(bookFile));
     
       return br;
    }
    
    /**
     * 
     * @return This method returns a full list of all books contained in the CVS file.
     * @throws  java.io.IOException
     */
    public ArrayList<Books> getAllBooks() throws IOException {
        //It creates a list to store all book collection.
        ArrayList<Books> books = new ArrayList();
        //Stores getCsv method in br object.
        BufferedReader br = getCsv("MOCK_DATA.csv");
        
        //fileString variable on which br will be used.
        String fileString;
        //Initializes empty array to store each individual line.
        String[] file_line = null;
        //skip first line with attributes row.
        br.readLine();
        //The loop runs for all lines that are not empty.
        while ((fileString = br.readLine()) != null) {
            /**
             * splits the string with a coma pattern.
             * Pattern will applied as many times as possible and
             * the resulting array can be of any size (-1). 
             */
            file_line = fileString.split(",", -1); 
            
            //Creates a new book object, and sets its attributes according to the .cvs fields.
            Books book = new Books();
            book.setId(file_line[0]); 
            book.setAuthor_first_name(file_line[1]);
            book.setAuthor_last_name(file_line[2]);
            

            //treats error in case the title name contains double quotes
            //and sets the rest of the Books attributes
            if (fileString.contains("\"")) {
                String[] line_one = fileString.split("\"");
                String genre = line_one[2].replace(",", "");
                book.setBook_title(line_one[1]);
                book.setGenre(genre);
               

            } else {
                book.setBook_title(file_line[3]);
                book.setGenre(file_line[4]);
            }
            

            books.add(book);
        }
        
        return books;
    }
    
    
    
        
        public String booksborrowed(String[] borrows) throws IOException {

        try {
            BufferedWriter writeBorrow = new BufferedWriter(new FileWriter("borrows.txt", true));
            writeBorrow.write(borrows[0] + "\n");
            writeBorrow.close();
        } catch (IOException e) {
            System.out.println("Error: make sure the book name is correct");
            e.printStackTrace();
        }

        return "Borrow Registered sucessfully";
    }
        
        /////////// STUDENTS 
        
        public  ArrayList<Students> getAllStudents() throws IOException {
        //variable of Collection type that contains all students
        ArrayList<Students> students = new ArrayList<>();
        //inform the name of csv file to be read
        BufferedReader br = getCsv("STUDENTS.csv");

        //st gets the string of the file
        String st;
        //line_file gets the string list to be add to Student method
        String[] line_file = null;
        //skip first line with colluns titles
        br.readLine();
        //loop to run in all lines not empty
        while ((st = br.readLine()) != null) {
            line_file = st.split(",", -1); //splits string to make the list
            Students student = new Students();

            student.setId(Long.valueOf(line_file[0])); //get the first position and add to student class
            student.setName(line_file[1]); 
            student.setCountry(line_file[2]);

            students.add(student);
        }
        //return all students
        return students;
    }
    
  
}