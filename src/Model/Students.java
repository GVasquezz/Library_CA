/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import Utilities.MyOwnQueue;

/**
 *
 * @author Francisco + Gonzalo
 */
public class Students {
    
    // Creating variables for Students Class
    
    private String ID;
    private String studentFirstName;
    private String studentLastName;
    private String nationality;
    private ArrayList<String> booksBorrowed = new ArrayList<String>();
    private String lastBookBorowed = "null"; 
    
    public String[] getStudentArray(){
        String txt[] = new String[booksBorrowed.size() + 5];
        txt[0] = ID;
        txt[1] = studentFirstName;
        txt[2] = studentLastName;
        txt[3] = nationality;
        txt[4] = booksBorrowed.toString();
        
        if(!booksBorrowed.isEmpty()){
            String[] arrayQueue = new String[booksBorrowed.size()];
            
            for(int i=6; i<arrayQueue.length+6; i++){
                txt[i] = arrayQueue[i-6];
            }
        }
        return txt;
    }
}

