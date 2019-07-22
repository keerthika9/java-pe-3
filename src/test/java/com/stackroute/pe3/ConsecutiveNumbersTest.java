package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
   private ConsecutiveNumbers consecutiveNumbers;
  @Before
  public void setUp() throws Exception {
    consecutiveNumbers=new ConsecutiveNumbers();
  }

  @After
  public void tearDown() throws Exception {
    consecutiveNumbers=null;
  }

  @Test
  public void GivenNumbersAsInputShouldReturnConsecutiveFailure() {
    boolean expected=false;
    boolean actual=consecutiveNumbers.checkConsecutiveNumbers(98,96,95);
    assertEquals(expected,actual);

  }

  @Test
  public void GivenNumbersAsInputShouldReturnConsecutive() {
    boolean expected=true;
    boolean actual=consecutiveNumbers.checkConsecutiveNumbers(9,8,7);
    assertEquals(expected,actual);
  }
  @Test
  public void GivenNullAsInputShouldReturnFalse() {
    boolean expected=false;
    boolean actual=consecutiveNumbers.checkConsecutiveNumbers(0,0,0);
    assertEquals(expected,actual);
  }

}
