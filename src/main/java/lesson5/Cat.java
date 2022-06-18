package lesson6;

public class Cat extends Animal {
    private static int countCats =0;

    public Cat(String name, String color, int age) {
        super(name, color, age);
        countCats++;
    }

    @Override
    public void run(int distance) {
        if (distance > 0 && distance < 200) {
            System.out.println(this.getName() + " have run " + distance + " meters.");
        } else {
            System.out.println(distance + " is not valid distance for cats to run");
        }
    }


    @Override
    public void swim(int distance) {
            System.out.println("Cats can't swim");
    }


    public static int getCountCats() {
        return countCats;
    }
}
