package chapter3.exercises;
/*
ex. 3.11
 */

public class GradeBook {
  private String courseName;
  private String intsructorName;

  public GradeBook(String courseName, String instructorName) {
    this.courseName = courseName;
    this.intsructorName = instructorName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public String getCourseName() {
    return courseName;
  }

  public String getIntsructorName() {
    return intsructorName;
  }

  public void setIntsructorName(String intsructorName) {
    this.intsructorName = intsructorName;
  }

  public void displayMessage() {
    System.out.printf("Welcome to the grade book for\n%s!\n", getCourseName());
    System.out.printf("This course is presented by\n%s!\n", getIntsructorName());
  }

}
