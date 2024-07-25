// Write a Java program that calculates the area of different shapes (circle, rectangle, and triangle) using method overloading.

public class ProblemStatement_5{
    public static double AreaOfShape(double radius){
        return Math.PI*radius*radius;
    }
    public static double AreaOfShape(double width, double height){
        return width*height;
    }
    public static double AreaOfShape(double height, double base, boolean isTriangle){
        if(isTriangle){
            return 0.5*base*height;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println("Area of Circle:" + AreaOfShape(6.2));
        System.out.println("Area of Rectangle:" + AreaOfShape(5,4.5));
        System.out.println("Area of Triangle:" + AreaOfShape(8,5.5,true));
    }
}