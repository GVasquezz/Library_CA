/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library_ca1;

import java.util.Scanner;

/**
 *
 * @author Gonzalo Vasquez
 */
public class Library_CA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
           //MENU
           
           int userselected;
           do{
               userselected = Menudata();
               switch(userselected){
                   case 1: 
                       System.out.println("OPTION 1 IS SELECTED THANK YOU ");
                       break;
               }
           }while(userselected >12 );
           
     
         
    }
    
    public static int Menudata(){
        int selection;
        Scanner myKB = new Scanner(System.in);
        
        
        
   
      
       selection = myKB.nextInt();
       return selection;
       
    }
    
}
