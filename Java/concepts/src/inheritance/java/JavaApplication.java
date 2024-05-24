package com.company.inheritance;

class Box {
    double length;
    double width;
    double height;

    Box(double length, double width, double height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public void volume()
    {
        double vol = length * width * height;
        System.out.println("The volume of the box = " + vol);
    }
}

class BoxWeight extends Box
{
    double weight;
    BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }
    public void display() {
        System.out.println("The weight of the box = " + weight);
    }
}

public class JavaApplication {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(12,2, 4, 56);
        boxWeight.volume();
        boxWeight.display();
    }

}
