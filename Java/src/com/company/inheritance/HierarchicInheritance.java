package com.company.inheritance;

class Animals {
    public void eat() {
        System.out.println("Animals are Eating");
    }
}
class Dogs extends Animals {
    public void bark() {
        System.out.println("Dogs bark");
    }
}
class Cat extends Animals {
    public void meow() {
        System.out.println("Cats cry meow");
    }
}

public class HierarchicInheritance {
    public static void main(String[] args) {
        Dogs dogs = new Dogs();
        dogs.eat();
        dogs.bark();

        Cat cat = new Cat();
        cat.meow();
        cat.eat();
    }
}
 
