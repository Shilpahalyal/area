import java.lang.Math;

public class area{
    // Method to calculate the area of a triangle
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate the area of a rectangle
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a circle
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a square
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static void main(String[] args) {
        double base = 5;
        double height = 7;
        double length = 6;
        double width = 4;
        double radius = 3;
        double side = 5;

        // Calculating and printing the areas
        System.out.println("Area of Triangle: " + calculateTriangleArea(base, height));
        System.out.println("Area of Rectangle: " + calculateRectangleArea(length, width));
        System.out.println("Area of Circle: " + calculateCircleArea(radius));
        System.out.println("Area of Square: " + calculateSquareArea(side));
    }
}
