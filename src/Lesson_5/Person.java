package Lesson_5;

public class Person {
    public String name;
    public String position;
    public String email;
    public int phone_number;
    public int zarplata;
    public int age;

    public Person(String name, String position, String email, String phone_number, String zarplata, String age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.zarplata = zarplata;
        this.age = age;

    }

    public Person(String ivanov_ivan, String engener, String email, int phone_number, String s1, String s2) {
    }

    public void info() {
        System.out.printf("name: $s, position: $s, email: $s, phone_number: $i, zarplata: $i, age: $i,", name, position, email, phone_number, zarplata, age);
    }


}
