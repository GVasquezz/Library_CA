/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSV_FileReader;

import com.opencsv.CSVReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Model.*;




/**
 *
 * @author Gonzalo Vasquez
 */
public class Data {
    
    
    public static BufferedReader getCsv(String nameFile) throws FileNotFoundException {
        //create file
        File fileBook = new File(nameFile);
       BufferedReader br = new BufferedReader(new FileReader(fileBook));
     return br;
    }

    public static List<Books> getAllBooks() throws IOException {
        //variable of Collection type that contains all books
        List<Books> books = new ArrayList();
        //inform the name of csv file to be read
        BufferedReader br = getCsv("MOCK_DATA.csv");

        //st gets the string of the file
        String st;
        //line_file gets the string list to be add to book method
        String[] line_file = null;
        //skip first line with colluns titles
        br.readLine();
        //loop to run in all lines not empty
        while ((st = br.readLine()) != null) {
            line_file = st.split(",", -1); //splits string to make the list
            Books book = new Books();
            book.setId(line_file[0]); //get the first position and add to book class
            book.setAuthor_first_name(line_file[1]);
            book.setAuthor_last_name(line_file[2]);
            

            //treats error in case the title name contains "
            if (st.contains("\"")) {
                String[] line_one = st.split("\"");
                String genre = line_one[2].replace(",", "");
                book.setBook_title(line_one[1]);
                book.setGenre(genre);
               

            } else {
                book.setBook_title(line_file[3]);
                book.setGenre(line_file[4]);
            }
            

            books.add(book);
        }
        //return all books
        return books;
    }
    
  
}