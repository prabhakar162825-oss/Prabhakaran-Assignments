package com.index.pack;

class ShapeCalculator {

    void area(int side) {
        int result = side * side;
        System.out.println("Area of Square: " + result);
    }
    void area(int length, int width) {
        int result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
    void area(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }

    public static void main(String[] args) {

        ShapeCalculator sc = new ShapeCalculator();

        sc.area(5);        
        sc.area(10, 4);     
        sc.area(3.5);     
    }
}
