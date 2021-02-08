package test;

import domain.Bear;


 /**
 * The class Test animal
 */ 
public class TestAnimal {


/** 
 *
 * Main
 *
 * @param args  the args
 */
    public static void main(String[] args) { 

        Bear bear = new Bear("Dendi");
        System.out.println(bear);
        bear.hunt();
        bear.eat();
        bear.sleep();
    }
}
