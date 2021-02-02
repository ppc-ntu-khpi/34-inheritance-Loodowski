package test;

import domain.Bear;

public class TestAnimal {

    public static void main(String[] args) {
        Bear bear = new Bear("Dendi");
        System.out.println(bear);
        bear.hunt();
        bear.eat();
        bear.sleep();
    }
}
