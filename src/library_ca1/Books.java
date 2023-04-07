
package library_ca1;

import Utilities.MyOwnQueue;


public class Books {
    // Creating variables for our Books Class
    private String ID;
    private String title;
    private String authorFirstName;
    private String authorLastName;
    private String genre;
    private boolean isRented = false;
    private MyOwnQueue students_queue= new MyOwnQueue();
    
    // Constructor for our Book Class 
    public Books(String ID, String title, String authorFirstName, String authorLastName, String genre, String rentStatus) {
        this.ID = ID;
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.genre = genre;
        this.isRented = Boolean.parseBoolean(rentStatus);
    }
    
    
    //Getters and Setters

    public String getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isIsRented() {
        return isRented;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setIsRented(boolean isRented) {
        this.isRented = isRented;
    }
    
    // Creating Array to store book data
    
    public String[] getBookArray(){
        String txt[] = new String[students_queue.size() + 6];
        txt[0] = ID;
        txt[1] = authorFirstName;
        txt[2] = authorLastName;
        txt[3] = title;
        txt[4] = genre;
        txt[5] = String.valueOf(isRented);
        if(!students_queue.isEmpty()){
            String[] arrayQueue = new String[students_queue.size()];
            arrayQueue = students_queue.getFullQueue();
            for(int i=6; i<arrayQueue.length+6; i++){
                txt[i] = arrayQueue[i-6];
            }
        }
        return txt;
    }
    
    public void add_Student_To_Queue(String id){
    this.students_queue.Enqueue(id);
    }
   
    /**
     * Method that rents the book to the next person in the Queue.
     * @return it returns the ID of the student who rented the book.
    */
    public String Rent_To_Queue(){
        setIsRented(true);
        String r = this.students_queue.First();
        this.students_queue.Dequeue();
        return r;
    }
    
   public void get_next_in_queue(){
       System.out.println(students_queue.First());
   }
    
    public String[] get_Waiting_List(){
        return this.students_queue.getFullQueue();
    } 
    
}
