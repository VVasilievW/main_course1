package Lesson_2;

import java.util.Arrays;

public class Lesson_2 {
    public static void main(String[] args) {
        System.out.println("DZ_2");


    }
    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void invertMass(String[] args) {
        int [] mass1 = { 1, 0, 0, 1, 1, 0, 1, 1, 0, 0};
        System.out.println("Mass_1.1: " + Arrays.toString(mass1));
        for(int i=0; i< mass1.length; i++) {
            if (mass1[i]==0) {
                mass1 [i]=1;
            } else {
                mass1 [i]=0;
            }
        }
        System.out.println("Mass_2.1: " + Arrays.toString(mass1));


    }
//2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void zadatMass(String[] args) {
        int [] mass2= new int[8];
        for(int i=0; i< mass2.length; i++) {
            mass2 [i]=i*3;
        }
        System.out.println("Mass_2: "+ Arrays.toString(mass2));

    }


}
