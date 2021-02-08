package domain;


 /**
 * The class Bear extends predator
 */ 
public class Bear extends Predator {

    private String kind;


/** 
 *
 * Bear
 *
 * @param name  the name
 * @param age  the age
 * @param weight  the weight
 * @param kind  the kind
 */
    public Bear(String name, int age, int weight, String kind) { 

        this.name=name;
        this.age=age;
        this.weight=weight;
        this.kind=kind;
    }


/** 
 *
 * Bear
 *
 */
    public Bear() { 

        this("Bob",14,420,"Brown bear");
    }

/** 
 *
 * Bear
 *
 * @param name  the name
 */
    public Bear(String name){ 

        this(name,14,420,"Brown bear");
    }

    @Override

/** 
 *
 * Hunt
 *
 */
    public void hunt() { 

        System.out.println("Bear hunting for a deer...");
    }

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is Bear!";
    }

    @Override

/** 
 *
 * Sleep
 *
 */
    public void sleep() { 

        System.out.println("The bear is sleeping...");
    }

    @Override

/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println("Bear eats meat...");
    }
    
}
