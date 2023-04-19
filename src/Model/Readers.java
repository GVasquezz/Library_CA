
package Model;

/**
 *
 * @author Francisco + Gonzalo
 */
public class Readers {
    //Creating attributes fo the Readers Class
    private int id;
    private String name;
    private String address;
    
    //Constructor
    public Readers(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    
    
    //Getters and setters
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getAddress() {
        return address;
    }

    
    public void setAddress(String address) {
        this.address = address;
    }
    
    //Overriden toString method.
    @Override
    public String toString(){
        return "# READER # ID: "+getId()+", Name: "+name+", Address: "+getAddress()+"\n";
    }
    
    
}
