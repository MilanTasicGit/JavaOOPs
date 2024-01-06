package org.JavaOOPs;

public interface Shape {
    double calculateArea();
    double calculatePerimeter();
}
class Circle implements Shape {
    private double numR;

    public Circle(double numR) {
        this.numR = numR;
    }

    @Override
    public double calculateArea() {
        return numR * numR * 3.14;
    }

    @Override
    public double calculatePerimeter() {
        return numR * 2 * 3.14;
    }
    static class Square implements Shape {
        private double num1;

        public Square(double num1) {
            this.num1 = num1;
        }
        @Override
        public double calculateArea() {
            return num1*num1;
        }
        @Override
        public double calculatePerimeter() {
            return 4*num1;
        }
    }
}

