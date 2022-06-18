package lesson6;

public class Dog extends Animal{
    private static int countDogs =0;

    public Dog(String name, String color, int age) {
        super(name, color, age);
        countDogs++;
    }

    @Override
    public void run(int distance) {
        if (distance > 0 && distance < 500) {
            System.out.println(this.getName() + " have run " + distance + " meters.");
        } else {
            System.out.println(distance + " is not valid distance for dogs");
        }
    }

    @Override
    public void swim(int distance) {

            if (distance > 0 && distance < 10){
                System.out.println(this.getName() + " have swum " + distance + "meters.");
            }   else {
                System.out.println(distance + " is not valid distance for dogs to swim");
            }
    }

    public static int getCountDogs() {
        return countDogs;
    }
}
