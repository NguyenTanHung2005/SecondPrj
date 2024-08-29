package edu.iuh.fit.ex1;

/**
 * Decription: this class
 */
public class Rectangle {
    private double width;
    private double length;

    public Rectangle (){
        length =0.0;
        width=0.0;
    }

public Rectangle(double w, double l){
        if(length<0 || width<0){
            throw new ArithmeticException();
        }
        width = w;
        length = l;
}

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<0){
            throw new IllegalArgumentException("Length must be greater than zero");
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<0){
            throw new IllegalArgumentException("Length must be greater than zero");
        }
        this.length = length;
    }
    public double getArea(){
        return this.length * this.width;
    }
    public double getPerimeter(){
        return 2*(this.length+this.width);
    }

}
