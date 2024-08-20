class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking...");
    }
}
public class TestInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method from Animal
        dog.bark(); // Method specific to Dog
    }
}
