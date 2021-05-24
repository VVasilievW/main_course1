package Lesson_3;

import java.util.Random;
import java.util.Scanner;

public class DZ {
    //1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки
    // угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число
    // чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз?
    // 1 – да / 0 – нет»(1 – повторить, 0 – нет).



    public static void main(String[] args) {
        ugadaiChislo ();

    }

    private static void ugadaiChislo() {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int random_number = random.nextInt(10);
        System.out.println("Угадай число от 0 до 9 с трех раз.");
        int input_number = scan.nextInt();
        if (input_number<random_number) {
            System.out.println("Загаданное число меньше");
        }

    }
}
