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

//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void invertMassUmn(String[] args) {
        int[] mass3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 10};
        for (int i = 0; i < mass3.length; i++) {
            if (mass3[i]<6){
                mass3[i]*=2;
            }
        }
    }
    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void kvadratMass(String[] args) {
        int [][] table = new int[5][5];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++){
            if (i==j||i+j==table.length-1){
                table [i][j]=0;
                } else {
                table [i][j]=1;
            }
            }
        }



    }
    //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

    //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    // если в массиве есть место, в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
    // граница показана символами ||, эти символы в массив не входят.

}
