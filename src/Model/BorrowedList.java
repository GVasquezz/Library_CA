
package Model;

import java.util.ArrayList;

/**
 *
 * @author Francisco + Gonzalo
 */
public class BorrowedList {
    //Creating variables for the Borrowed list Class.
    private String userName;
    private String bookName;
    private String borrowDate;
    private ArrayList<String> borrowedList = new ArrayList<>();
    
    //Constructor
    public BorrowedList(String userName, String bookName, String borrowDate, ArrayList<String> borrowedList) {
        this.userName = userName;
        this.bookName = bookName;
        this.borrowDate = borrowDate;
        this.borrowedList = borrowedList;
    }
    
    //Getters and setters

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public ArrayList<String> getBorrowedList() {
        return borrowedList;
    }

    public void setBorrowedList(ArrayList<String> borrowedList) {
        this.borrowedList = borrowedList;
    }
    
    
    
    //Overiden toString method.
    @Override
    public String toString(){
        return "User name: "+userName+"\n"+"Book: "+bookName+"\n"+"Date it was borrowed: "+borrowDate+"\n";
    }
    
}
