/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Teo Espero
//  BS Cloud and Systems Administration
//  BS Software Development
//  Western Governors University
//  TestCircle - This program in Java demonstrates the use of an object and methods
//  Date written: 08 30 2022
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  TestCircle class declaration

public class TestCircle {

    //  main class
    public static void main(String[] args){

        //  define Circle classes
        Circle myCircle01 = new Circle();
        Circle myCircle02 = new Circle(25);

        myCircle01.setRadius(15);

        System.out.println("myCircle01");
        showRadius(myCircle01);
        showArea(myCircle01);
        showPerimeter(myCircle01);

        System.out.println("myCircle02");
        showRadius(myCircle02);
        showArea(myCircle02);
        showPerimeter(myCircle02);

    }

    private static void showRadius(Circle myCircle) {
        System.out.println(myCircle.getRadius());
    }

    private static void showPerimeter(Circle myCircle) {
        System.out.println(myCircle.getPerimeter());
    }

    private static void showArea(Circle myCircle) {
        System.out.println(myCircle.getArea());
    }
}

class Circle{
    double radius;


    Circle(){
        radius = 1;
    }

    Circle(double newRadius){
        radius = newRadius;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }

    double getPerimeter(){
        return  2 * radius * Math.PI;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }

    double getRadius(){
        return radius;
    }
}

