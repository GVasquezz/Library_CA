/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_ca1;

import java.util.ArrayList;

/**
 *
 * @author Francisco + Gonzalo
 */
public class Students {
    
    // Creating variables for Students Class
    
    private String ID;
    private String studentFirstName;
    private String studentLastName;
    private ArrayList<String> booksBorrowed = new ArrayList<String>();
    private String lastBookBorowed = "null"; 
    
    public String[] getStudentArray(){
        String txt[] = new String[booksBorrowed.size() + 4];
        txt[0] = ID;
        txt[1] = studentFirstName;
        txt[2] = studentLastName;
        txt[3] = booksBorrowed.toString();
        
        if(!booksBorrowed.isEmpty()){
            String[] arrayQueue = new String[booksBorrowed.size()];
            arrayQueue = booksBorrowed.getFullQueue();
            for(int i=6; i<arrayQueue.length+6; i++){
                txt[i] = arrayQueue[i-6];
            }
        }
        return txt;
    }
}
