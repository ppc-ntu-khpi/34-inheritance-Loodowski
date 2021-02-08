package domain;


 /**
 * The class Animal
 */ 
public class Animal {

    protected String name;

    protected int age;

    protected int weight;


/** 
 *
 * It is a constructor. 
 *
 */
    public Animal() { 

        name="gerenic animal";
        age=14;
        weight=25;
    }


/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println("Animal eating...");
    }


/** 
 *
 * Sleep
 *
 */
    public void sleep() { 

        System.out.println("Animal sleeping...");
    }


/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return "Animal:" + "\nName:\t" + name + "\nAge:\t" + age + "\nWeight:\t" + weight;
    }
}
