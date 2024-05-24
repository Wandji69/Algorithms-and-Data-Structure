package com.company.inheritance;
class Animal {
    public void eat() {
        System.out.println("Animals are eating");
    }
    public void sleep() {
        System.out.println("Animals are sleeping");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dogs bark");
    }
}
class Labrador extends Dog{
    public void breed() {
        System.out.println ("This breed is labrador");
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.sleep();

        Labrador labrador = new Labrador();
        labrador.breed();
    }
}
