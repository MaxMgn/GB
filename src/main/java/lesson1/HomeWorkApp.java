package lesson1;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println ("Orange");
        System.out.println ("Banana");
        System.out.println ("Apple");
    }
    public static void checkSumSign(){
        int a= 2;
        int b= -3;
        if (a+b >= 0) {
            System.out.println ("Сумма положительная");
        } else{
            System.out.println ("Сумма отрицательная");
        }
    }
    public static void printColor(){
        int color = 175;
        if (color < 0){
            System.out.println ("Красный");
        } else if (color <= 100) {
            System.out.println ("Жёлтый");
        } else {
            System.out.println ("Зелёный");
        }
    }
    public static void compareNumbers() {
        int a = 100;
        int b = 15;
        if (a >= b) {
            System.out.println ("a >= b");
        } else {
            System.out.println ("a < b");
        }
    }

}
