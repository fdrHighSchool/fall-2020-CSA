import java.util.Arrays;

public class Student {
  // instance variables
  private String name;
  private String osis;
  private int[] grades;

  //------------------------------------------------//

  // constructor
  public Student(String n, String o) {
    this.name = n;
    this.osis = o;
    grades = new int[10];
  }//end constructor method

  //------------------------------------------------//

  // other methods
  public String getName() {
    return this.name;
  }//end getName method


  public String getOSIS() {

    return "";
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
  public void addGrade(int grade) {
    int i = 0;

    while (this.grades[i] != 0) {
      i++;
    }//end while loop

    this.grades[i] = grade;
  }//end addGrade method


  public double calculateAverage() {
    double sum = 0;
    int count = 0;

    //go through array
    for (int i = 0; i < this.grades.length; i++){
      //determine if value is not 0
      if (this.grades[i] != 0) {
        sum += this.grades[i];
        count++;
      }//end if statement
    }//end for loop
    return sum / count;
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
