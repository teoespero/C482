/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Teo Espero
//  BS Cloud and Systems Administration
//  BS Software Development
//  Western Governors University
//  Compute Area -  this Java program was created to demonstrate the use of variables and
//                  primitive data types and expressions.
//  Date written: 08 30 2022
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

//  declare the objects and methods we need
//  for this apps functionality

//  for inputs
import java.util.Scanner;

//  character functions
import java.lang.Character;

//  declare our class
public class ComputeArea {

    //  main starting point
    public static void main(String[] args){

        // declare the vars we need
        double  area,
                PI = 3.14159;

        boolean again = true;
        boolean validYN = false;
        char anotherRun = 'y';

        // greet the user
        System.out.println("Compute the area of a circle using its radius");
        System.out.println("=========================================================");

        // main loop
        while (again){
            //  create a Scanner object to accept input
            Scanner radiusInput = new Scanner(System.in);
            Scanner userInput = new Scanner(System.in);

            //  prompt for input
            System.out.print("Enter a value for the radius: ");

            //  get user input
            double radius = radiusInput.nextDouble();

            //  only do the math if radius > 0
            if (radius > 0 ){

                // find the area of the circle
                area = radius * radius * PI;

                // show the resulting area
                System.out.println("The area of the circle of radius " + radius + " is " + area +".");
            }
            //  radius is < 0, spit out an error message
            else {
                System.out.println("This program requires a value > 0 for radius.");
            }

            //  ask if the user wants to run the app again
            while (!validYN) {
                //  check for a valid y/n response
                System.out.print("Run again (y/n)? ");

                //  get user's answer
                anotherRun = userInput.next().charAt(0);

                //  response is not y/n, spit out an error message
                if ("yn".indexOf(anotherRun) == -1) {
                    System.out.println("Invalid response!");
                }
                //  response is valid, exit the loop
                else {
                    validYN = true;
                }
            }

            //  exit if n
            if (Character.toLowerCase(anotherRun) != 'y') {
                again = false;
            }
            //  run it again if y
            else {
                validYN = false;
            }
        }

        //  exit gracefully
        System.out.println("Goodbye!");
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////