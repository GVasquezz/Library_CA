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
        
        Scanner myKB = new Scanner(System.in);
        int userselected = MenuData();
        switch(userselected){
            case 1: 
                System.out.println("OPTION 1 IS SELECTED");
                break;
                case 2: 
                System.out.println("OPTION 2 IS SELECTED");
                break;
                case 3: 
                System.out.println("OPTION 3 IS SELECTED");
                break;
                case 4: 
                System.out.println("OPTION 4 IS SELECTED");
                break;
                case 5: 
                System.out.println("OPTION 5 IS SELECTED");
                break;
                case 6: 
                System.out.println("OPTION 6 IS SELECTED");
                break;
                case 7: 
                System.out.println("OPTION 7 IS SELECTED");
                break;
                case 8: 
                System.out.println("OPTION 8 IS SELECTED");
                break;
                case 9: 
                System.out.println("OPTION 9 IS SELECTED");
                break;
                case 10: 
                System.out.println("OPTION 10 IS SELECTED, THANK YOU ");
                break;
                case 11: 
                System.out.println("OPTION 11 IS SELECTED");
                break;
                case 12: 
                System.out.println("OPTION 12 IS SELECTED");
                break;
                
        }while(userselected > 12);
     
    }
    
    public static int MenuData(){
        
        int selection;
        Scanner MyKB = new Scanner(System.in);
        
        System.out.println("SELECT YOUR OPTION");
         System.out.println("/////////////////////////");
         
          System.out.println("1-SELECT BOOK BY TITLE ");
           System.out.println("2-SELECT BOOK BY AUTHOR NAME");
            System.out.println("3-LIST ALL BOOKS BY AUTHOR ");
             System.out.println("4-LIST ALL BOOKS BY TITLE");
              System.out.println("5-SEARCH SPECIFIC BOOK BY NAME");
              System.out.println("6-SEARCH SPECIFIC BOOK BY ID");
               System.out.println("7-LIST ALL READERS BY ID");
                System.out.println("8-LIST ALL READES BY NAME ");
                 System.out.println("9-BORROW REGISTRATION");
                  System.out.println("10-RETURN REGISTRATION");
                   System.out.println("11-BOOKS BORROWED BY ID ");
                    System.out.println("EXIT ");
      
                     System.out.println("OPTION");
                    
                   selection = MyKB.nextInt();
                    System.out.println("THE OPTION SELECTED IS : ");
                    
                    return selection;
                   
    }
    
}
