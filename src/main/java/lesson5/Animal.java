package lesson6;

public abstract class Animal {
    private String name;
    private String color;
    private int age;
    private static int count =0;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        count++;
    }

    public abstract void run (int distance);
    public abstract void swim (int distance);

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }
}
