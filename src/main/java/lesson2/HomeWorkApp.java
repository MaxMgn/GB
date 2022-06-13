package lesson2;

public class HomeWorkApp {

    public static void main(String[] args) {
        System.out.println (checkSumValue(7, 14));
        printNumberSign(9);
        System.out.println (checkNumberSign(9));
        printString("Java", 1);
        System.out.println (leapYear(1707));
    }
    public static boolean checkSumValue(int a, int b) {
        return a + b >= 10 && a + b <= 20;

    }
    public static void printNumberSign(int c){
        if (c >= 0) {
            System.out.println ("Число положительное");
        } else{
            System.out.println ("Число отрицательное");
        }
    }
    public static boolean checkNumberSign(int c){
        return c >= 0;
    }
    public static void printString(String a, int b){
        while (b>0){
            System.out.println (a);
            b--;
         }
    }


    public static boolean leapYear(int year) {
        if (year % 4 != 0) {
            return false;
            // обычные невисокосные года
        } else if (year % 100 != 0) {
            return true;
            //  високосные года, которые не оканичиваются на 00
        }
          else return year % 400 == 0;
        // проверяем  года, которые оканичиваются на 00 если год делится на 400, то он високосный, если нет, то невисокосный
        }

}
