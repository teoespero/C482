/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Teo Espero
//  BS Cloud and Systems Administration
//  BS Software Development
//  Western Governors University
//  AnalyzeNumbers -    This Java program accepts a series of numbers, finds the average, and then finds
//                      numbers that are higher than the average
//  Date written: 08 30 2022
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

//  for input functions
import java.util.Scanner;

//  data mismatch
import java.util.InputMismatchException;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  AnalyzeNumbers class declaration
public class AnalyzeNumbers {

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    //  main class declaration
    public static void main(String[] args){

        //  define the limit of the array size
        final int MAX_ARR_SIZE = 10;

        //  declare the vars that we are going to use
        double[] numberSeries = new double[MAX_ARR_SIZE];

        //  get series values from the user
        fillArray(numberSeries);

        //  begin analysis
        analyzeTheSeries(numberSeries);

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    //  analyzeTheSeries method declaration
    //  -   runs the methods needed to process the series
    private static void analyzeTheSeries(double[] numberSeries) {

        //  prompt the current step
        System.out.println();
        System.out.println("Analyzing the numbers...");
        System.out.println();

        //  find the average value of the series
        double theAverage = getAverage(numberSeries);
        printAverage(theAverage);

        //  locate outliers, values higher than the average
        findOutliers(theAverage, numberSeries);

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    //  printAverage method declaration
    //  -   does nothing more than show the average to the user
    private static void printAverage(double theAverage) {
        System.out.println("The average from the series is " + theAverage);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    //  findOutliers method declaration
    //  -   receives both the series and the average
    //      prints out the outliers from the series passed based on the average
    private static void findOutliers(double theAverage, double[] numberSeries) {

        int outlierCtr = 0;

        System.out.println("The outliers from the series are:");
        for (double theNumber: numberSeries) {
            if (theNumber > theAverage){
                outlierCtr++;
                System.out.println(theNumber);
            }
        }

        //  count outliers
        System.out.println("There are " + outlierCtr + " outlier(s) in the series.");
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    //  getAverage method declaration
    //  -   computes for the average value of the series
    private static double getAverage(double[] numberSeries) {
        double average, sum = 0;

        //  accumulate the values of the series
        for (double arrValue : numberSeries) {
            sum = sum + arrValue;
        }

        //  get the average
        average = sum / numberSeries.length;

        return average;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    //  fillArray method declaration
    //  -   fills the array with values from the user
    public static void fillArray(double[] arrSeries){

        //  create the input object
        Scanner arrValue = new Scanner(System.in);

        //  prompt the user for input
        System.out.println("Enter the numbers below: ");
        for (int ptr = 0; ptr < arrSeries.length; ptr++){

            //  checks if the input is good
            try {
                System.out.print((ptr + 1) + " -> ");
                arrSeries[ptr] = arrValue.nextDouble();
            }
            //  if it fails, throw out an exception error
            catch (InputMismatchException ex) {
                    System.out.println("Data type mismatch error!");
                    System.out.println("A numeric value is required for processing!");

                    //  note that if the inout is bad, we should not advance the array
                    //  index, the same array index should be filled
                    ptr--;

                    //  this is to clear the buffer of the bad input
                    arrValue.next();
                }
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////