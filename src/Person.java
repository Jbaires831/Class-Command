/*
Author: Jonathan Baires
Date: March 1, 2023
Description: this is a class to represent a person.
 */

public class Person {
    private Double power;
    private String name;
    private String location;

    public Person(Double power, String name, String location) {
        this.power = power;
        this.name = name;
        this.location = location;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
