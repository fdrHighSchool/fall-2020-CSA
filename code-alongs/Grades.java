import java.util.*;

public class Grades{
  public static void main(String[] args) {
  // create Scanner object
  Scanner scanner = new Scanner(System.in);

  // ask the user for how many grades they want to enter
  System.out.print("How many grades do you want to enter? ");
  int numGrades = scanner.nextInt();

  // setup an Array to be used and filled with the user's input
  int arr[] = new int[numGrades];

  /*
  --------------------
  |    |    |    |    |
  ---------------------
  */
  // looping structure to get multiple values from the user
  for (int i = 0; i < numGrades; i++){
    // get next int and store to a variable
    // insert into the next slot in the Array
    System.out.print("Enter in the grade: ");
    arr[i] = scanner.nextInt();

  }
  // display the contents of the Array, to check that everything worked
  System.out.println(Arrays.toString(arr));

  // get the average of the grades
  System.out.println(getAverage(arr));
  System.out.println(getAverageV2(arr));
  System.out.println(Arrays.toString(curveScores(arr)));
  System.out.println(getAverageV2(arr));

  scanner.close();
  }//end main method

  public static double getAverage(int[] arr){
    double sum = 0;
    for(int i = 0; i < arr.length; i++){
      sum += arr[i];
    }
    return sum / arr.length;
  }//end getAverage method

  public static double getAverageV2(int[] arr){
    double sum = 0;
    for(int grade : arr){
      sum += grade;
    }//end for-each loop
    return sum / arr.length;
  }//end getAverageV2

  public static int[] curveScores(int[] arr){
    for(int i = 0; i < arr.length; i++){
      if(arr[i] > 90 && arr[i] < 95){
        arr[i] = 95;
      } else if(arr[i] > 95 && arr[i] < 100){
        arr[i] = 100;
      }
      if (arr[i] < 45){
        arr[i] = 45;
      }
    }//end for loop

    return arr;
  }//end curveScores

}//end class
