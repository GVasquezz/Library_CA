/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSV_FileReader;

import Model.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;




/**
 *
 * @author Gonzalo Vasquez
 */


public class FileReader {
    
    
     public ArrayList<Readers> loadReaders() throws FileNotFoundException {

        ArrayList<Readers> readers = new ArrayList<Readers>();
        FileInputStream bookDataFile = new FileInputStream("MOCK_DATA.csv");
        String line = "";

        try (BufferedReader breader = new BufferedReader(new InputStreamReader(bookDataFile))) {
            line = breader.readLine();
            while (line != null) {
                String[] parts = line.split(",");
                readers.add(new Readers(Integer.parseInt(parts[0]), parts[1], parts[2]));
                line = breader.readLine();
            }

        } catch (IOException e) {

        }
        return readers;

    }
     
     public void sortReadersByName(ArrayList<Readers> readers)  {

        for (int i = 0; i < readers.size(); i++) {
            for (int j = 0; j < readers.size() -1; j++) {
                if ( readers.get(j).getName().compareTo(readers.get(j+1).getName())>0 ) {
                    Readers r = readers.get(j);
                    readers.set(j, readers.get(j + 1));
                    readers.set(j + 1, r);
                }
            }
        }
        
        System.out.println(readers);
        
    }

    public ArrayList<Readers> sortReadersByName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    

}