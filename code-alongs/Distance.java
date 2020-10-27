import java.util.Scanner;

public class Distance{
  public static void main(String[] args) {
    //get two points from the user (x, y)
    //ex: (3, 5)...stored as a String
    Scanner s = new Scanner(System.in);

    System.out.print("Enter point 1: ");
    String point1 = s.nextLine();

    System.out.print("Enter point 2: ");
    String point2 = s.nextLine();

    //parse, meaning, get ints from String, the information from the inputs
    //(3, 4) --> x1 = 3, y1 = 4



    //send data to methods to calculate distance





    /*
    TEST CASES:
    (0, 0) & (3, 4) --> euclideanDistance = 5, taxicabDistance = 7
    (0, 0) & (5, 12) --> euclideanDistance = 13, taxicabDistance = 17
    Do negative coordinates work? If not, how would you go about fixing that?
    */

  }//end main


  /*
   * N: euclideanDistance
   * P: determine the distance between any two points on x/y axis (diagonal)
   * I: pass in x1, y1, x2, y2
   * R: the result of the distance formula: sqrt((x2 - x1)^2 + (y2 - y1)^2)
   */
  public static double euclideanDistance(){
    return 0.0;
  }//end cartesianDistance


  /*
   * N: taxicabDistance
   * P:
   * I:
   * R:
   */
  public static double taxicabDistance(){
    return 0.0;
  }//end cartesianDistance

}//end class
