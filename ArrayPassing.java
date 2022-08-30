/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Teo Espero
//  BS Cloud and Systems Administration
//  BS Software Development
//  Western Governors University
//  ArrayPassing -  this Java program was created to demonstrate passing arrays to methods
//  Date written: 08 30 2022
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

//  for input functions
import java.util.Scanner;

//  array function
import java.util.Arrays;

//  data mismatch
import java.util.InputMismatchException;

public class ArrayPassing {

    //////////////////////////////////////////////////////////////////////////////
    //  main class
    public static void main(String[] args){

        //  declare our vars
        int[] licensePlates = new int[10];

        //  get inputs from the user
        getPlates(licensePlates);

        //  show the license plates received as input
        System.out.println("Licenses entered (unsorted): ");
        showPlates(licensePlates);

        //  sort the license plates then show them
        licensePlates = sortTheArrays(licensePlates);
        System.out.println("Licenses entered (sorted): ");
        showPlates(licensePlates);
    }
    //////////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////////////
    //  method for getting license plates
    public static void getPlates(int[] licensePlateHolder){
        Scanner userInput = new Scanner(System.in);

        //  greet the user
        System.out.println("Acme License plates ");
        System.out.println("----------------------------");
        System.out.println("Enter the licenses below: ");

        //  loop and ask for license plates
        for (int ptr = 0; ptr < licensePlateHolder.length; ptr++){

            //  check for bad input data
            try{
                System.out.print(ptr + 1 + " -> ");
                licensePlateHolder[ptr] =  userInput.nextInt();
            }
            //  if it fails, throw out an exception error
            catch (InputMismatchException ex){
                System.out.println("Invalid license plate!");
                userInput.next();
                ptr--;
            }
        }
    }

    //  methods for showing the plates gathered (unsorted)
    public static void showPlates(int[] licensePlateHolder){
        for (int thePlates: licensePlateHolder) {
            System.out.println(thePlates);
        }
    }

    //  methods for showing the plates gathered (sorted)
    public static int[] sortTheArrays(int[] licensePlateHolder){
        Arrays.sort(licensePlateHolder);
        return  licensePlateHolder;
    }
    //////////////////////////////////////////////////////////////////////////////

}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////