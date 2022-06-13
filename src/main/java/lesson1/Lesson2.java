package lesson1;

public class Lesson2 {

    public static void main(String[] args) {
        printDayOfWeek(3);
    }

    public static void printDayOfWeek(int a) {
        switch (a) {
            case 1:
                System.out.println("Сегодня понедельник");
                break;
            case 2:
                System.out.println("Сегодня вторник");
                break;
            case 3:
                System.out.println("Сегодня среда");
                break;
            case 4:
                System.out.println("Сегодня четверг");
                break;
            case 5:
                System.out.println("Сегодня пятница");
                break;
            case 6:
                System.out.println("Сегодня суббота");
                break;
            case 7:
                System.out.println("Сегодня воскресенье");
                break;
            default:
                System.out.println("Введён неверный номер дня");
        }
    }
}
