package com.day2;

class Animal1 {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}
// Subclass
class Dog1 extends Animal1 {
    // Overriding the makeSound method
//    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}
public class OverridingExample {
    public static void main(String[] args) {
        Animal1 myAnimal = new Animal1();
        Dog1 myDog = new Dog1();
        myAnimal.makeSound(); // Output: Animal makes a sound.
        myDog.makeSound();    // Output: Dog barks.
        // Polymorphism in action:
        Animal1 anotherAnimal = new Dog1();
        anotherAnimal.makeSound(); // Output: Dog barks.
    }
}
 
