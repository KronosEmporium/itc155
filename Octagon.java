//*******************************************************************
//
//  Assignment 11
//
// Creates two classes, Janitor and HarvardLawyer which extend the
// pre-existing classes Employee and Lawyer respectively. Janitors
// get half the hours and vacation days and $10K less in salary and
// have the unique function clean(), Harvard Lawyers receive 20% more
// salary, 3 extra vacation days, and must fill out four pink forms
// to apply for vacation. EmployeeMain5 class tests these classes.
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

