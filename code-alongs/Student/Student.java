import java.util.Arrays;

public class Student {
  // instance variables
  private String name;
  private String osis;
  private int[] grades;
  private int numGrades; //tracks the number of valid score in the array

  //------------------------------------------------//

  // constructor
  public Student(String n, String o) {
    this.name = n;
    this.osis = o;
    this.grades = new int[10];
    this.numGrades = 0;
  }//end constructor method

  // overloaded constructor
  public Student(String n) {
    this.name = n;
    this.osis = "999999999";
    this.grades = new int[10];
    this.numGrades = 0;
  }//end constructor method
  //------------------------------------------------//

  // other methods
  public String getName() {
    return this.name;
  }//end getName method


  public String getOSIS() {
    return this.osis;
  }//end getOSIS method


  public void displayGrades() {
    System.out.println(Arrays.toString(this.grades));
  }//end getGrades method


  public void setName(String name) {
    this.name = name;
  }//end setName method


  public void fillArray() {
    for (int i = 0; i < this.grades.length; i++) {
       this.grades[i] = (int)(Math.random() * 46 + 55);
    }//end for loop

    this.numGrades = 10;
  }//end fillArray method


  /*
   * N: addGrade
   * P: take-in a single grade and add it to the student's gradebook.
        should find the first non-zero index in the array and insert the grade
        there. if there is no room for that value, replace the lowest grade in
        array with it.
   * I: grade (int)
   * R: n/a
   */

   /*
   +-----------------------+
   |     |  90  |     |  0  |
   |  80  |     |  0  |     |
   +-----------------------+
   */
  public void addGrade(int grade) {
    //if there's no room, then replace the lowest score
    if (this.numGrades == 10) {
      //search for lowest value
      int lowestIndex = 0;
      int lowestGrade = this.grades[0];

      for (int i = 1; i < this.grades.length; i++) {
        if (this.grades[i] < lowestGrade) {
          lowestIndex = i;
          lowestGrade = this.grades[i];
        }//end if statement
      }//end for loop

      //replace (if grade is greater than the lowest)
      this.grades[lowestIndex] = grade;
    }//end if statement

    else {
      this.grades[this.numGrades] = grade;
      this.numGrades++;
    }//end else

  }//end addGrade method


  public double calculateAverage() {
    double sum = 0;
    //int count = 0;

    //VERSION 1 - loop through entire array always
    /*
    //go through array
    for (int i = 0; i < this.grades.length; i++){
      //determine if value is not 0
      if (this.grades[i] != 0) {
        sum += this.grades[i];
        count++;
      }//end if statement
    }//end for loop
    */

    //VERSION 2 - use numGrades to determine how many many iterations through the array
    for (int i = 0; i < this.numGrades; i++){
      sum += this.grades[i];
    }

    return sum / this.numGrades;
  }//end calculateAverage() method


  /*
   * Returns the String representation of a Student.
   * Right now, we are choosing to display the student's name and OSIS.
   * NOTE: This method overrides the default toString method that
   *       displays the memory address.
   */
  public String toString() {
    return "Student: " + this.name + " OSIS: " + this.osis;

  }//end toString method

}//end class
