package com.mobileapps.week1daily3_resourcesandlocalization;

public class Animal {

    private String Phylum;
    private String Family;

    public Animal (String Phylum, String Family){
        this.Phylum=Phylum;
        this.Family=Family;
    }

    public Animal() {
    }

    public String getFamily() {
        return Family;
    }

    public void setFamily(String family) {
        this.Family = family;
    }


    public String getPhylum() {
        return Phylum;
    }

    public void setPhylum(String phylum) {
        this.Phylum = phylum;
    }
}
