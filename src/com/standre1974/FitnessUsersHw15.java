package com.standre1974;
/*
Зробіть програму для фітнес трекера, яка реєструватиме нового користувача створюючи йому обліковий запис, приймаючи
наступні параметри:
Незмінні (задаються тільки при створенні облікового запису, і можуть бути отримані лише за допомогою гетерів):
Ім'я
Дата народження (окремо день, місяць, рік)
Емейл
Телефон
Змінювані:
Прізвище
Вага
Тиск
Кількість пройдених за день кроків
Створювати кожного користувача необхідно через конструктор, беручи всі поля на вхід конструктора.
Додати метод printAccountInfo(), при виклику якого друкувати всі дані про користувача
Після прийому року народження - вираховувати вік користувача у внутрішню змінну age (відштовхуючись просто
від 2020 року, ускладнювати тут не будемо), на яку зробити тільки геттер і виводити на екран разом з іншими
полями в методі printAccountInfo(); у конструкторі або геттерах/сеттерах не використовуємо виведення в консоль.
У main-класі створити 3-5 користувачів та роздрукувати дані кожного через виклик методу printAccountInfo();
для двох користувачів змінити кілька полів та роздрукувати нові дані повторно
 */

public class FitnessUsersHw15 {

    private String name; // is
    private int dayBirth; // is
    private int monthBirth; // is
    private int yearBirth; // is
    private int age;
    private String email; // is
    private String phoneNumber; // is
    private String surname; // is
    private Float weight; // is
    private String pressure; // is
    private int steps;

    public FitnessUsersHw15(String name, String surname, int dayBirth, int monthBirth, int yearBirth, String email,
                            String phoneNumber, Float weight, String pressure, int steps) {
//        "Pressure: %s\nCount of steps%d\n", name, surname, dayBirth, monthBirth, yearBirth, age, email,
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
        }


}

//class RunTracker {
//    public static void main(String[] args) {
//
//        FitnessUsersHw15 user1 = new FitnessUsersHw15("Ivan", "Mazepa", 14, 04, 1974,
//                "email1@i.ua", "+111222333", 75.5F, "90/130", 10000);
//        user1.printAccountInfo();
//
//        FitnessUsersHw15 user2 = new FitnessUsersHw15("Sergii", "Petrenko", 18, 11, 1978,
//                "email2@i.ua", "+222333444", -69.2F, "80/120", 11000);
//        user2.printAccountInfo();
//
//        FitnessUsersHw15 user3 = new FitnessUsersHw15("Petro", "Durov", 18, 11, 1978,
//                "email3@i.ua", "+333444555", 84.8F, "95/140", 14000);
//        user3.printAccountInfo();
//
//
//
//
//
//    }
//
//}