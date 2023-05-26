package com.standre1974;
/*
Зробити клас Person та в ньому метод personInfo()
На вхід передавати йому чотири параметри: ім'я, прізвище, місто, телефон
Всередині методу формувати рядок у форматі:
Зателефонувати громадянину + ІМ'Я ПРІЗВИЩЕ + із міста + МІСТО можна за номером + ТЕЛЕФОН
Метод має повертати String
У main-методі зробити три виклики методу personInfo, щоразу передаючи нову людину;
Повинен вийти висновок такого типу:
Зателефонувати громадянинові Will Smith з міста New York можна за номером 2936729462846.
Зателефонувати громадянинові Jackie Chan з міста Shanghai можна за номером 12312412412.
Зателефонувати до громадян Sherlock Holmes з міста London можна за номером 37742123513.
 */
public class PersonHw13 {
    public String name;
    public String surname;
    public String city;
    public long phoneNumber;

//    public PersonHw13(String name, String surname, String city, long phoneNumber){
//        String[] names = {this.name = name};
//        String[] surnames = {this.surname = surname};
//        String[] cities = {this.city = city};
//        long[] phoneNumbers = {this.phoneNumber = phoneNumber};
//    }


    public String personInfo(){
        return String.format("Call citizen %s %s from %s, you can call +%d", name, surname, city,phoneNumber);

    }

    public static void main(String[] args) {

        PersonHw13 person1 = new PersonHw13();
        person1.name = "Will";
        person1.surname = "Smith";
        person1.city = "New York";
        person1.phoneNumber = 2936729462846L;

        PersonHw13 person2 = new PersonHw13();
        person2.name = "Jackie";
        person2.surname = "Chan";
        person2.city = "Shanghai";
        person2.phoneNumber = 12312412412L;

        PersonHw13 person3 = new PersonHw13();
        person3.name = "Sherlock";
        person3.surname = "Holmes";
        person3.city = "London";
        person3.phoneNumber = 37742123513L;

        System.out.print(person1.personInfo());
        System.out.print("\n");

        System.out.print(person2.personInfo());
        System.out.print("\n");

        System.out.print(person3.personInfo());



    }
}
