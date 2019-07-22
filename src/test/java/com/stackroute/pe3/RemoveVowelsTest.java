package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    private RemoveVowels removeVowels;

    @Before
    public void setUp() throws Exception {
      removeVowels = new RemoveVowels();
    }

    @After
    public void tearDown() throws Exception {
      removeVowels = null;
    }
@Test

    public void GivenStringAsInputShouldReturnEquals(){
      String[] expected = {"nd", "ntd Stts", "Grmny", "gypt", "czchslvk"};
      String[] string = {"India", "United States", "Germany", "Egypt", "czechoslovakia"};
      String[] actual = removeVowels.remVow(string);

      assertArrayEquals(expected, actual);
    }
  @Test

  public void GivenStringAsInputShouldReturnNotEquals(){
    String[] expected = {"nda", "ntd Sttes", "Gremny", "gypt", "czchslvk"};
    String[] string = {"India", "United States", "Germany", "Egypt", "czechoslovakia"};
    String[] actual = removeVowels.remVow(string);

    assertNotEquals(expected, actual);
  }


}




