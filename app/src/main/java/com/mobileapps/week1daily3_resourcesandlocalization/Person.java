package com.mobileapps.week1daily3_resourcesandlocalization;

public class Person extends Animal{

    private String Name;
    private String LastName;

    public Person (String Name, String LastName){
        this.Name=Name;
        this.LastName=LastName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }


    }


