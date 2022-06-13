package TicTacToe;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static char[][] table;
    static int x, y;
    static int size = 3;
    static final char xMark = 'X';
    static final char oMark = 'O';
    static final char empty = '.';


    public static void main(String[] args) {
        do {
            System.out.println("Введите размер поля: 3 или 5");
            size = scanner.nextInt();
        } while (size != 3 && size != 5);

        initTable(size);
        printTable(size);

        while (true) {
            humanMove();
            if (win()) {
                System.out.println("Вы выиграли");
                break;
            }
            if (draw()) {
                System.out.println("Ничья");
                break;
            }
            compMove();
            if (win()) {
                System.out.println("Вы проиграли");
                break;
            }

        }

    }
    public static boolean draw() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++){
                if (!cellIsFilled(i, j)){
                    return false;
                }
            }
        }
        return  true;
    }
    public static boolean win() {
        switch (size){
            case 3: return win3();
            case 5: return win5();
        }
        return false;
    }
    public static boolean win3() {
        for (int i = 0; i < size; i++) {
            int j = 0;
            char check = table[i][j];
            if (check != empty) {
                do {
                    //System.out.println("Checking " + i + " " + j + " " + table[i][j]);
                    j++;
                    if (j == size) {
                        return true;
                    }
                } while (table[i][j] == check);
            }
        }

        for (int j = 0; j < size; j++) {
            int i = 0;
            char check = table[i][j];
            if (check != empty) {
                do {
                    //System.out.println("Checking " + i + " " + j + " " + table[i][j]);
                    i++;
                    if (i == size) {
                        return true;
                    }
                } while (table[i][j] == check);
            }
        }
        int i = 0;
        char check = table[i][i];
        if (check != empty) {
            do {
                //System.out.println("Checking " + i + " " + i + " " + check + table[i][i]);
                i++;
                if (i == size) {
                    return true;
                }
            } while (table[i][i] == check);
        }
        i = 0;
        check = table[i][size-i-1];
        if (check != empty) {
            do {
                //System.out.println("Checking " + i + " " + (size - i - 1) + " " + table[i][size - i - 1]);
                i++;
                if (i == size) {
                    return true;
                }
            } while (table[i][size - i - 1] == check);
        }
            return false;
    }
    public static boolean win5() {
        for (int i = 0; i < size; i++) {
            for (int k = 0; k <2; k++){ // k -сдвиг
                int j =0;
                char check = table[i][j+k];
                if (check != empty) {
                    do {
                        //System.out.println("Checking row "+i+" cell " + i + " " + j + " " + table[i][j+k]);
                        j++;
                        if (j == size - 1) {
                            return true;
                        }
                    } while (table[i][j+k] == check);
                }

            }
        }
        for (int j = 0; j < size; j++) {
            for (int k = 0; k <2; k++){ // k -сдвиг
                int i =0;
                char check = table[i+k][j];
                if (check != empty) {
                    do {
                        //System.out.println("Checking column "+i+" cell " + i + " " + j + " " + table[i][j+k]);
                        i++;
                        if (i == size - 1) {
                            return true;
                        }
                    } while (table[i+k][j] == check);
                }

            }
        }
        // прямая диагональ
        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < 2; l++) {
                int i =0;
                //int j =0;
                char check = table[i+k][i+l];
                if (check != empty) {
                    do {
                        //System.out.println("Checking dia1 "+(i+1)+" cell" + (i+k+1) + " " + (i+l+1) + " there's a symbol " + table[i+k][i+l]);
                        i++;
                        if (i == size - 1) {
                            return true;
                        }
                    } while (table[i+k][i+l] == check);
                }
            }
        }
        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < 2; l++) {
                int i =0;
                char check = table[i+k][size-i-l-1];
                if (check != empty) {
                    do {
                        //System.out.println("Checking cell" + (i+1) + " " + (size-i-k) + " there's a symbol " + table[i+k][size-i-l-1]);
                        i++;
                        if (i == size - 1) {
                            return true;
                        }
                    } while (table[i+k][size-i-l-1] == check);
                }
            }
        }
        return false;
    }
    public static void initTable (int size){
        table = new char [size] [size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                table [i][j] = empty;

            }
        }
    }

    public static void printTable (int size){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print(table [i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void humanMove (){
        do {
            System.out.println("Enter row and column numbers from 1 to " + size);
            x = scanner.nextInt() - 1 ;
            y = scanner.nextInt() - 1;
        }
        while (cellIsNotValid(x, y));
        System.out.println("Human made a move "+ (x+1) + " " + (y+1));
        table [x][y] = xMark;
        printTable (size);
    }

    public static void compMove(){
        if (!blockHumanMove()) {
                do {
                    x = random.nextInt(size);
                    y = random.nextInt(size);
                    System.out.println("Computer tries to make a move "+(x+1) + " " + (y+1));
                }  while (cellIsFilled(x,y));
        } ;
         System.out.println("Computer made a move "+ (x+1) + " " + (y+1));
        table [x][y] = oMark;
        printTable (size);
    }
    public static boolean cellIsNotValid (int x, int y) {
        if (x <0 || x >= size || y < 0 || y >= size) {
            return true;
        }
        else return cellIsFilled(x, y);
    }
    public static boolean cellIsFilled (int x, int y) {
        return table[x][y] != empty;
    }
    public static boolean blockHumanMove(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (table[i][j] == empty) {
                    table[i][j] = xMark;
                    if (win()) {
                        x = i;
                        y = j;
                        System.out.println("Computer blocked a cell "+ (x+1) + " " + (y+1));
                        table[i][j] = empty;
                        return true;
                    }
                    table[i][j] = empty;
                }

            }
        }
        return false;
    }
}
