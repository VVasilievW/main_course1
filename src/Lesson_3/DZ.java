package Lesson_3;

import java.util.Random;
import java.util.Scanner;

public class DZ {
    //1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки
    // угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число
    // чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз?
    // 1 – да / 0 – нет»(1 – повторить, 0 – нет).


    public static void main(String[] args) {
     //   ugadaiChislo();
        formatPredlozhenie();


    }

    private static void ugadaiChislo() {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int random_number = random.nextInt(9);
        System.out.println("Угадай число от 0 до 9 с трех раз.");


        for (int i = 1; i <= 3; i++) {

            int input_number = scan.nextInt();

            if (input_number < random_number) {  //do while
                System.out.println("Ваше число меньше");
            } else if (input_number > random_number) {
                System.out.println("Ваше число больше");
            } else {
                System.out.println("Вы угадали число!");
                System.out.println("«Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
            }


        }
    }
 // 3. Отформатировать предложение.
 private static void formatPredlozhenie() {
     String s = "Предложение      один    Теперь     предложение два         Предложение            три";
     String s1 = s.replaceAll(" +", " ");
     System.out.println(s1);

     StringBuilder s2 = new StringBuilder(s1);

     for (int i = 1; i < s1.length(); i++) {
         if (s1.charAt(i) >= 'А' && s1.charAt(i) <= 'Я') {
             s2.setCharAt(i - 1, '.');
         }
     }
     for (int i = s1.length(); i >=0; i-- ) {
         if (s1.charAt(i) >= 'А' && s1.charAt(i) <= 'Я') {

             s2.insert(i-1,' ');
         }
     }

    s2.append('.');

     System.out.println(s2);






 }

}
