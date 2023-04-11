/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library_ca1;

import java.util.Scanner;
import static javafx.application.Platform.exit;

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
           
           int userselected;
           do{
               userselected = Menudata();
               switch(userselected){
                   case 1: 
                       System.out.println("OPTION 1 :TITLE ");
                       String title = myKB.nextLine(); // TYPE THE TIPE OF THE TITLE WITH THESE WE CAN CREATE A CLASS TO GET THE DATA OF THE LIST OF TITLES . APPLY THE SAMES WITH ALL
                       
                       break;
                   case 2: 
                       System.out.println("OPTION 2 : AUTHOR NAME ");// TYPE THE TIPE OF THE AUTHOR WITH THESE WE CAN CREATE A CLASS TO GET THE DATA OF THE LIST OF TITLES
                       String author = myKB.nextLine();
                   break;
                   
                   case 3 : 
                       System.out.println("OPTION 3 : BOOKS BY TITLE ");
                       break;
                       
                   case 4 : 
                       System.out.println("OPTION 4 : BOOKS BY AUTHOR ");
                       break;
                   case 5 :
                      System.out.println("OPTION 5  : NAME OF READER ");
                       break; 
                   case 6 : 
                        System.out.println("OPTION 6  : ID OF READER ");
                       break;
                    case 7 : 
                        System.out.println("OPTION 7  : ALL READERS BY NAME ");
                       break;
                       case 8 : 
                        System.out.println("OPTION 8  : ALL READERS BY ID ");
                       break;
                       case  9 : 
                        System.out.println("OPTION 9  : BORROW REGISTRATION ");
                       break; 
                       case  10: 
                        System.out.println("OPTION 10  : RETURN REGISTRATION ");
                       break; 
                       case 11 : 
                        System.out.println("OPTION 11  : BOOKS BORROWED BY ID");
                       break; 
                       case 12 : 
                        exit();
                       default:
                           System.out.println("IS WRONG");
                           break;
                       
                           
                       
                       
                       
               }
           }while(userselected >12 );
          // while(true);
           
           
     
         
    }
    
    public static int Menudata(){
        int selection;
        Scanner myKB = new Scanner(System.in);
        System.out.println("£££ MENU £££");
        System.out.println("1- SEARCH BOOK BY TITLE");
        System.out.println("2- SEARCH BOOK BY AUTHOR NAME");
        System.out.println("3- ALL BOOKS BY TITLE");
        System.out.println("4- ALL BOOKS BY AUTHOR");
        System.out.println("5- SEARCH READER BY NAME");
        System.out.println("6- SEARCH READER BY ID ");
        System.out.println("7- MAKE A LIST OF ALL READERS BY NAME");
        System.out.println("8- MAKE A LIST OF ALL READERS BY ID ");
        System.out.println("9- MAKE A BORROW REGISTRATION ");
        System.out.println("10- MAKE A RETURN REGISTRATION");
        System.out.println("11- BOOKS BORROWED BY ID");
        System.out.println("12- EXIT");
        
        
        
        System.out.println(" SELECTED OPTIONS IS : ");
        
        
       selection = myKB.nextInt();
       return selection;
      
       
    }
    
}
