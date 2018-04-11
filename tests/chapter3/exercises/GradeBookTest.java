package chapter3.exercises;

import org.testng.Assert;
import org.testng.annotations.Test;


public class GradeBookTest {

  @Test
  public void testSetCourseName() throws Exception {
    GradeBook gradeBook = new GradeBook("python", "John");
    gradeBook.setCourseName("java");
    Assert.assertEquals(gradeBook.getCourseName(), "java");
  }

  @Test
  public void testGetCourseName() throws Exception {
    GradeBook gradeBook = new GradeBook("python", "Jane");
    Assert.assertEquals(gradeBook.getCourseName(), "python");
  }

  @Test
  public void testGetIntsructorName() throws Exception {
    GradeBook gradeBook = new GradeBook("python", "Jane");
    Assert.assertEquals(gradeBook.getIntsructorName(), "Jane");
  }

  @Test
  public void testSetIntsructorName() throws Exception {
    GradeBook gradeBook = new GradeBook("python", "Jane");
    gradeBook.setIntsructorName("David");
    Assert.assertEquals(gradeBook.getIntsructorName(), "David");
  }
}