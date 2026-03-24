
package AnimalHierarchy;

public class Main {
    public static void main(String[] args)
    {
        Animal mydog = new Dog("Oscar", 7);
        Animal mycat = new Cat("Garfield", 5);
        Animal mybird = new Bird("Tweety", 3);
        mydog.makeSound();
        mycat.makeSound();
        mybird.makeSound();
    }
}
