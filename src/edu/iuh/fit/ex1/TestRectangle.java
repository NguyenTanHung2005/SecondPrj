package edu.iuh.fit.ex1;

public class TestRectangle {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(20.5,5);

        r1.setLength(5);

        System.out.println("r1:"+ r1.getLength());
        System.out.println("r2:" + r2.getLength());
        System.out.println("Area r1:" + r2.getArea());
        System.out.println("Perimeter r2:" + r2.getPerimeter());
    }
}
