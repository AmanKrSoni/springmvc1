package com.cvt.model;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favLang;
    private String[] operatingSystems;

    private LinkedHashMap<String ,String> countryOptions;

    public Student() {
        //populate Country Option : use ISO Country code
        countryOptions=new LinkedHashMap<String, String>();
        countryOptions.put("BR","Brazil");
        countryOptions.put("CN","China");
        countryOptions.put("FR","France");
        countryOptions.put("IN","India");
        countryOptions.put("US","United State");
        countryOptions.put("DE","Germany");

    }

    public Student(String firstName, String lastName, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavLang() {
        return favLang;
    }

    public void setFavLang(String favLang) {
        this.favLang = favLang;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", favLang='" + favLang + '\'' +
                ", operatingSystems=" + Arrays.toString(operatingSystems) +
                ", countryOptions=" + countryOptions +
                '}';
    }
}
