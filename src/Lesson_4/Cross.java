package Lesson_4;

public class Cross {
    static final int size_X=5;
    static final int size_Y=5;
    static final int size_WIN=4;

    static char [][] pole = new char[size_X][size_Y];

    static final char PLAYER_DOT = 'X';
    static final char AI_DOT = '0';
    static final char EMPTY_DOT = '.';

    public static void initPole() {
        for (int i=0; i < size_Y; i++) {
            for (int j=0; j < size_X; j++) {
                pole [i][j] = EMPTY_DOT;
            }
        }
    }

    public static void printPole() {
        System.out.print("  ");
        for (int i=0; i < size_X; i++) {
            System.out.print( (i + 1) + " ");
        }
        System.out.println();
        for (int i=0; i < size_Y; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size_X; j++) {
                System.out.print(pole[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


    }

    // вход
    public static void main(String[] args) {
        initPole();
        printPole();

    }


}
