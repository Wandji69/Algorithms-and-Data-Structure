package com.company.inheritance;

class A {
    public int x;
    private int y;

    public void get_x(int x)
    {
        this.x = x;
    }

    public void show_private(int y) {
        this.y = y;
        System.out.println("Show value of Y is = " + y);
    }

}
class B extends A {
    private int z;

    public void get_z(int z) {
        this.z = z;
    }

    public int sum() {

        return x + z;
    }
}
public class InheritanceDemo {

    public static void main(String[] args) {

        B b = new B();
        b.get_x(10);
        b.get_z(20);
        b.show_private(40);
        int ans = b.sum();

        System.out.println("the sum is equal " + ans);

    }
}
