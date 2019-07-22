package com.stackroute.pe3;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentGradesTest {
  private StudentGrades studentGrades;

  @Before
  // This methods runs, before running any one of the test case
  // This method is used to initialize the required variables
  public void setUp() throws Exception {

  }

  @After
  // This method runs, after running all the test cases
  // This method is used to clear the initialized variables
  public void tearDown() throws Exception {
    studentGrades = null;
  }

  @Test
  public void givenMarksAsInputShouldReturnTrue() {
    studentGrades = new StudentGrades(2, new int[]{50, 90});
    boolean expected = true;
    boolean actual = studentGrades.checkGrades();
    assertEquals(expected, actual);
  }

  @Test
  public void givenMarksAsInputShouldReturnFalse() {
    studentGrades = new StudentGrades(2, new int[]{50, 150});
    boolean expected = false;
    boolean actual = studentGrades.checkGrades();
    assertEquals(expected, actual);

  }
}
