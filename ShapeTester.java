package org.JavaOOPs;

public class ShapeTester {
            public static void main(String[] args) {
                Circle circle=new Circle(3.8);
                double circleA= circle.calculateArea();
                double circleP= circle.calculatePerimeter();
                System.out.println("The circle area is: "+circleA+" and the circle perimeter is: "+circleP);
                Circle.Square square=new Circle.Square(2.1);
                double squareA= square.calculateArea();
                double squareP= square.calculatePerimeter();
                System.out.println("The square area is: "+squareA+" and the square perimeter is: "+squareP);
            }
}



