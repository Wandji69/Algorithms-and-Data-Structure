package com.company.overriddenmethods;
class A {
    int x;

    public void show(int x) {
        this.x = x;
        System.out.println("The value of x = "+x );
    }
}

class B extends A {
    int y;
    public void show(int y) {
        this.y=y;
        System.out.println("the value of Y = "+y);
    }
}

public class JavaOverride {
    public static void main(String[] args) {
        B b = new B();
        b.show(3);
    }
}
