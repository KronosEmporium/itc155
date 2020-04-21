//*******************************************************************
//
//  Octagon.java
//
// Creates a class called Octagon which implements the Shape
// interface from Building Java Programs. The Octagon takes one
// double value for the length of its sides (assuming a regular
// octagon with equal sides). Public class Test creates an object
// of class Octagon and prints a string with the the side length,
// area, and perimeter of the octagon.
//
// By: Crosby Allison
// Date: 11/07/2019
//*******************************************************************

interface Shape {
    public double getArea();
    public double getPerimeter();
}

class Octagon implements Shape {
    private double side;
    
    public Octagon(double side) {
        this.side = side;
    }
    
    public double getArea() {
        return 2 * (1 + Math.sqrt(2)) * Math.pow(side, 2);
    }
    
    public double getPerimeter() {
        return 8 * side;
    }
}

public class Test {
    public static void main (String[] args) {
        
        double octaSideLength = 8.0;
        Octagon octa = new Octagon(octaSideLength);
        String octaStr = String.format("Octagon with side length %.2f has an area of %.4f and a perimeter of %.4f.", octaSideLength, octa.getArea(), octa.getPerimeter());
        
        System.out.println(octaStr);
    }
}

