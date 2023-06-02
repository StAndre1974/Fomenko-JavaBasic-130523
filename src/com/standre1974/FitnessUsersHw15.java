package com.standre1974;

public class FitnessUsersHw15 {

    private final String name; // is
    private final int dayBirth; // is
    private final int monthBirth; // is
    private final int yearBirth; // is
    private final int age;
    private final String email; // is
    private final String phoneNumber; // is
    private String surname; // is
    private Float weight; // is
    private String pressure; // is
    private int steps;

    public FitnessUsersHw15(String name, String surname, int dayBirth, int monthBirth, int yearBirth, String email,
                            String phoneNumber, Float weight, String pressure, int steps) {

        this.name = name;
        this.dayBirth = dayBirth;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
        this.age = 2020 - yearBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public int getDayBirth() {
        return dayBirth;
    }

    public int getMonthBirth() {
        return monthBirth;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public Float getWeight() {
        return weight;
    }

    public String getPressure() {
        return pressure;
    }

    public int getSteps() {
        return steps;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(Float weight) {
        if (weight > 0 && weight < 300) {
            this.weight = weight;
        } else {
            System.out.print("Incorect value");
        }
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setSteps(int steps) {
        if (steps > 0) {
            this.steps = steps;
        } else System.out.print("Incorect value");
    }

    public void printAccountInfo() {
        String stringFormat = "%-20s %-15s\n";
        String intFormat = "%-20s %-15d\n";
        String floatFormat = "%-20s %,-15.2f\n";

        String birthday = String.format("%d.%d.%d", dayBirth, monthBirth, yearBirth);
        System.out.printf(stringFormat, "Name: ", name);
        System.out.printf(stringFormat, "Surname: ", surname);
        System.out.printf(stringFormat, "Birthday: ", birthday);
        System.out.printf(intFormat, "Age: ", age);
        System.out.printf(stringFormat, "Email: ", email);
        System.out.printf(stringFormat, "Phone number: ", phoneNumber);
        System.out.printf(floatFormat, "Weight: ", weight);
        System.out.printf(stringFormat, "Pressure: ", pressure);
        System.out.printf(intFormat, "Count of steps: ", steps);
        System.out.print("\n");
    }

}

class RunTracker {
    public static void main(String[] args) {

        FitnessUsersHw15 user1 = new FitnessUsersHw15("Ivan", "Mazepa", 14, 04, 1974,
                "email1@i.ua", "+111222333", 75.5F, "90/130", 10000);
        user1.printAccountInfo();

        FitnessUsersHw15 user2 = new FitnessUsersHw15("Sergii", "Petrenko", 18, 11, 1978,
                "email2@i.ua", "+222333444", 69.2F, "80/120", 11000);
        user2.printAccountInfo();

        FitnessUsersHw15 user3 = new FitnessUsersHw15("Petro", "Durov", 18, 11, 1978,
                "email3@i.ua", "+333444555", 84.8F, "95/140", 14000);
        user3.printAccountInfo();

        user1.setSteps(9999);
        user1.setWeight(74.2F);
        user1.setPressure("93/128");
        System.out.print("User1 after chamges:\n");
        user1.printAccountInfo();

        user2.setSteps(11500);
        user2.setWeight(71.4F);
        user2.setPressure("88/131");
        System.out.print("User2 after chamges:\n");
        user2.printAccountInfo();

    }

}