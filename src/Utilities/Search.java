
package Utilities;

import java.util.ArrayList;
import Model.*;

/**
 *
 * @author Gonzalo Vasquez
 */
public class Search {
    
    public boolean SearchBookTitle(ArrayList<Books> book, String title) {
        boolean found = false;
        for (Books b : book) {
            if (b.getBook_title().equalsIgnoreCase(title)) {
                System.out.println(b);
                
                found = true;
            }
            else{
                
                System.out.println("Book not found");
            }
        }
        
        return found;
    }
    
}
