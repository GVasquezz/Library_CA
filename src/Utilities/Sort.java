
package Utilities;
import Model.*;

import java.util.ArrayList;


/**
 *
 * @author Gonzalo Vasquez
 */
public class Sort {
    
     public String getBookByString(Books book, String attributeName) {
        if ("title".equals(attributeName)) {
            return book.getBook_title();
        }
        return book.getAuthor_first_name();
        
    }
      public Boolean smallString(String str1, String str2) {
        //upercase used, this way the entire word is the same type
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        return str1.compareTo(str2) <= 0;   
    }
    
     
    public int partitionBook(ArrayList<Books> arr, int low, int high, String column) {
        
        String pivot = getBookByString(arr.get(high), column);
        int i = (low - 1); // index of smaller element
        
        for (int j = low; j < high; j++) {
            //If current element is smaller than or equal to pivot
            if (smallString(getBookByString(arr.get(j), column), pivot)) {
                i++;
                Books temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        Books temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
        return i + 1;

    }
    
    //SORT BOOK by ID
     public void sortBook(ArrayList<Books> books,int low, int high, String column){ 
         
         if(low<high){
             
             int pbook = partitionBook(books, low , high , column);
             
             sortBook(books, low, pbook - 1, column);
             sortBook(books,pbook +1 ,high, column);
         }
         
      
}
     /// SORT BOOK by title
      public void sortBooks(ArrayList<Books> books, Sort sort, String column) {
        int n = books.size();
        sort = new Sort();

        sort.sortBook(books, 0, n - 1, column);
        Sort.printBooks(books);
    }
    
        // THIS METHOD WAS DONE IN CLASS AS EXAMPLE
    public int partitionStudent(ArrayList<Students> arr, int low, int high, String column) {

        String pivot = arr.get(high).getName();        
        Long longPivot = arr.get(high).getId();
        int i = (low - 1); // index of smaller element
        
        for (int j = low; j < high; j++) {
            //If current element is smaller than or equal to pivot
            if ("id".equals(column)) {
                Long id = arr.get(j).getId();
                if (longPivot > id) {
                    i++;
                    Students temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            } else {
                if(smallString(arr.get(j).getName(), pivot)){
                    i++;

                    Students temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }

        Students temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
        return i + 1;

    }
    
     public void sortStudent(ArrayList<Students> students, int low, int high, String column) {
        if (low < high) {
            //pi is partitioning index, arr[pi] is now at right place 
            int pi = partitionStudent(students, low, high, column);
            //recursively sort elements before partition and after partition
            sortStudent(students, low, pi - 1, column);
            sortStudent(students, pi + 1, high, column);
        }
    }
     public static void printArrayStudent(ArrayList<Students> students) {
        for (Students student : students) {
            System.out.println(student.toString());
        }
        System.out.println();
    }
     
      public static void printBooks(ArrayList<Books> books) {
        for (Books book : books) {
            System.out.println(book.toString());
        }
        System.out.println();
    }
   
    
    
    
}
