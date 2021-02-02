package domain;

public class Animals {

    protected String name;

    protected int age;

    protected int weight;

    public Animals() {
        name="gerenic animal";
        age=14;
        weight=25;
    }

    public void eat() {
        System.out.println("Animal eating...");
    }

    public void sleep() {
        System.out.println("Animal sleeping...");
    }

    public String toString() {
        return "Animal:" + "\nName:\t" + name + "\nAge:\t" + age + "\nWeight:\t" + weight;
    }
}
