package Lesson_5;

public class Person {
    public String name;
    public String position;
    public String email;
    public String phone_number;
    public int zarplata;
    public int age;

    public Person(String name) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.zarplata = zarplata;
        this.age = age;

    }

    public Person(String ivanov_ivan, String engener, String email, String phone_number, int zarplata, int age) {
    }

    public void info() {
        System.out.printf("name: $s, position: $s, email: $s, phone_number: $s, zarplata: $s, age: $s,", name, position, email, phone_number, zarplata, age);
    }


}
