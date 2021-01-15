public class StudentDriver {
  public static void main(String[] args) {
    Student student1 = new Student("Hans", "123456789");
    Student student2 = new Student("Sophia", "234345646");
    System.out.println(student1);
    System.out.println(student2);

    student1.setName("Joshua"); //setter method (mutator)
    System.out.println(student1);

    System.out.println(student1.getName()); //Joshua

    student1.addGrade(100);
    student1.displayGrades();
    student1.addGrade(90);
    student1.displayGrades();

    student2.addGrade(95);
    student2.displayGrades();

    Student student3 = new Student("Elias", "987654321");
    student3.fillArray();
    student3.displayGrades();

    System.out.println(student1.calculateAverage());
    System.out.println(student2.calculateAverage());
    System.out.println(student3.calculateAverage());

    student1.addGrade(99);
    student3.addGrade(99);

    student1.displayGrades();
    student3.displayGrades();
    System.out.println(student3.calculateAverage());

    Student student4 = new Student("Mo", "345672301");
  }//end main method

}//end class
