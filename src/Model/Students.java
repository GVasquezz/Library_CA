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
        return "\n_______________\n"
                + "ID = " + id + "\n"
                + "Name = " + name + "\n"
                + "Address = " + country;
    }
}

