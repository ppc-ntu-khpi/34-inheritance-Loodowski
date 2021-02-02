package domain;

public class Bear extends Predator {

    private String kind;

    public Bear(String name, int age, int weight, String kind) {
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.kind=kind;
    }

    public Bear() {
        this("Bob",14,420,"Brown bear");
    }
    public Bear(String name){
        this(name,14,420,"Brown bear");
    }

    @Override
    public void hunt() {
        System.out.println("Bear hunting for a deer...");
    }

    @Override
    public String toString() {
        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is Bear!";
    }

    @Override
    public void sleep() {
        System.out.println("The bear is sleeping...");
    }

    @Override
    public void eat() {
        System.out.println("Bear eats meat...");
    }
    
}
