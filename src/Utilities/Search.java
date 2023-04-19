/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.util.ArrayList;
import Model.*;

/**
 *
 * @author Gonzalo Vasquez
 */
public class Search {
    
    public boolean SBooktitle(ArrayList<Books> book, String title) {
        boolean found = false;
        for (Books b : book) {
            if (b.getBook_title().equalsIgnoreCase(title)) {
                System.out.println(b);
                
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Book not found");

        }
        return found;
    }
    
}
