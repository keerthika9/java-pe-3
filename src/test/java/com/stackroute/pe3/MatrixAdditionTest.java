package com.stackroute.pe3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {

   private MatrixAddition matrixAddition;
  @Before
  public void setUp() throws Exception {
    matrixAddition=new MatrixAddition();
  }

  @After
  public void tearDown() throws Exception {
    matrixAddition=null;
  }

  @Test
  public void GivenIntegersAsInputShouldReturnAdditionOfMatrices() {
    matrixAddition.Matrix1(new int[][]{{1,2},{3,4},{5,6}});
    matrixAddition.Matrix2(new int[][]{{9,8},{7,6},{5,4}});
    int[][] actual=matrixAddition.additionOfMatrices();
     int[][]  expected={{10,10},{10,10},{10,10}};
    assertArrayEquals(expected,actual);

  }
  @Test
  public void GivenIntegersAsInputShouldReturnadditionOfMatricesNotNull() {
    matrixAddition.Matrix1(new int[][]{{1,2},{3,4},{5,6}});
    matrixAddition.Matrix2(new int[][]{{9,8},{7,6},{5,4}});
    int[][] actual=matrixAddition.additionOfMatrices();
    assertNotNull(actual);

  }
  @Test
  public void GivenNothingAsInputShouldReturnadditionOfMatricesNull() {
    int[][] actual=matrixAddition.additionOfMatrices();
    assertNull(actual);

  }
}
