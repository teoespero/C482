/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Teo Espero
//  BS Cloud and Systems Administration
//  BS Software Development
//  Western Governors University
//  ArrayPassing -  this Java program was created to demonstrate passing multidimensional arrays to methods
//  Date written: 08 30 2022
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

//  for input functions
import java.util.Scanner;

//  array function
import java.util.Arrays;

//  data mismatch
import java.util.InputMismatchException;
public class DistanceTables {

    //////////////////////////////////////////////////////////////////////////////
    //  main class
    public static void main(String[] args) {

        //  declare the limit of our arrays
        final int MAX_ARR_SIZE = 7;

        //  declare the arrays that we need
        int[][] distances = new int[MAX_ARR_SIZE][MAX_ARR_SIZE];
        String[] city = new String[MAX_ARR_SIZE];

        //  populate the arrays
        getData(city, distances);

        //  present the data in tabular form
        showDistanceTable(city, distances);
    }
    //////////////////////////////////////////////////////////////////////////////
    // method definitions

    //////////////////////////////////////////////////////////////////////////////
    //  getData(String[] cities, int[][] distances)
    //  -   populates the arrays we need for both the city name
    //      and the distances
    public static void getData(String[] cities, int[][] distances){

        //  create our Scanner objects for input

        // the city name
        Scanner cityResponse = new Scanner(System.in);

        // the distance
        Scanner distanceResponse = new Scanner(System.in);

        //  get users response
        for (int row = 0; row < cities.length; row++){

            //  for the city name
            System.out.print("City: ");
            cities[row] = cityResponse.nextLine();

            //  and the distance
            for (int col = 0; col < distances.length; col++){
                System.out.print("Distance: " + col + "-> ");
                distances[row][col] = distanceResponse.nextInt();
            }
        }
    }

    //////////////////////////////////////////////////////////////////////////////
    //  showDistanceTable(String[] cities, int[][] distances)
    //  -   shows the data in tabular form
    public static void showDistanceTable(String[] cities, int[][] distances){
        for (int ctr = 0; ctr < cities.length; ctr++)

            //  show the name of the city as headers
            System.out.print("\t" + cities[ctr]);
        System.out.println();
        System.out.println("--------------------------------------------------");
        for (int x = 0; x < cities.length; x++) {

            //  show the name of the city as row names
            System.out.print(cities[x]);

            //  show the distances between the cities
            for (int y = 0; y < distances.length; y++){
                System.out.print("\t" + distances[x][y]);
            }

            //  create a new line for the new city
            System.out.println();
        }
    }
    //////////////////////////////////////////////////////////////////////////////
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////