
package Model;



/**
 *
 * @author Francisco + Gonzalo
 */
public class Students {
    
    private Long id;
    private String name;
    private String country;

    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    //print student details
    @Override
    public String toString() {
        return "\n______\n"
                + "ID = " + id + "\n"
                + "Name = " + name + "\n"
                + "Nationality = " + country;
    }
}

