import java.util.Arrays;

public class Grades2D {
  public static void main(String[] args) {
    // instantiate 2D array (for example, 30 students with 10 grades each)
    int[][] classGrades = new int[30][10];

    classGrades = fillArray(classGrades);

    // use the deepToString() method to display the contents of a 2D-Array
    System.out.println(Arrays.deepToString(classGrades));
    System.out.println(find24s(classGrades));

  }//end main method

  /*
   * N: fillArray
   * P: assign random scores to each cell of the 2D-Array
   * I: the 2D-Array of scores
   * R: the filled-up 2D-Array
   * NOTE: edit the code to have a random value from 55 - 100 in each cell
   */
  public static int[][] fillArray(int[][] arr) {
    // fill each cell with row + col
    // what you will do is fill each row with a random int from 55 - 100
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        arr[row][col] = row + col;
      }// end col for loop
    }// end row for loop

    return arr;
  }// end fillArray method

  /*
   * N: displayArray
   * P: create a visual representation of the grades for each student in the class
   * I: the 2D-Array of scores
   * R: n/a
   */
  public static void displayArray(int[][] arr) {


  }// end displayArray method

  /*
   * N: getValedictorian
   * P: determine the 1st rank student in the class
   * I: the 2D-Array of scores
   * R: the student with the highest average
   */
  public static int getValedictorian(int[][] arr) {

    return 0;
  }// end getValedictorian method

  /*
   * N: getSalutatorian
   * P: determine the 2nd rank student in the class
   * I: the 2D-Array of scores
   * R: the student with the second highest average
   */
  public static int getSalutatorian(int[][] arr) {

    return 0;
  }// end getSalutatorian method

  /*
   * N: getAverage
   * P: determine the average of an array of ints
   * I: the array of student test scores
   * R: the average
   */
  public static double getAverage(int[] arr) {

    return 0.0;
  }// end getAverage method


  /*
   * N: find24s
   * P: iterate through each cell of the 2D Array an determine how many 24s exist
   * I: the 2D Array to inspect
   * R: the count of how many 24s exist
   * NOTE: 24 is just an arbitrary value, used as an example because it's Alfredo's favorite
   */
  public static int find24s(int[][] arr) {
    int count = 0;

    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (arr[row][col] == 24) {
          System.out.println(row + " " + col);
          count++;
        }// end if statement
      }// end col for loop
    }// end row for loop

    return count;
  }// end find24s

}// end class
