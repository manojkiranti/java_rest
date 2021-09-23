package com.java.restservices.spring.buildingblock;

public class UserDetail {
    private String fistName;
    private String lastName;
    private String city;

//    Fields Constructor
    public UserDetail(String fistName, String lastName, String city) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.city = city;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
