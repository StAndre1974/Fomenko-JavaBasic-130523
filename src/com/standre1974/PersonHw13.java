package com.standre1974;

public class PersonHw13 {
    private String name;
    private String surname;
    private String city;
    private long phoneNumber;

    public PersonHw13(String name, String surname, String city, long phoneNumber){
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String personInfo() {
        return String.format("Call citizen %s %s from %s, you can call +%d", name, surname, city, phoneNumber);
    }

    public static void main(String[] args) {

        PersonHw13 person1 = new PersonHw13("Will", "Smith", "New York", 2936729462846L);
        System.out.println(person1.personInfo());


        PersonHw13 person2 = new PersonHw13("Jackie", "Chan", "Shanghai", 12312412412L);
        System.out.println(person2.personInfo());


        PersonHw13 person3 = new PersonHw13("Sherlock", "Holmes", "London", 37742123513L);
        System.out.println(person3.personInfo());
    }
}
