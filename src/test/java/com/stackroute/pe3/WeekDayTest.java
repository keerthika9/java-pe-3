package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class WeekDayTest {
  WeekDay weekDay;
  @Before
  public void setUp() throws Exception {
    weekDay=new WeekDay();
  }

  @After
  public void tearDown() throws Exception {
    weekDay=null;
  }

  @Test
  public void firstDayOfWeek()throws ParseException {
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("E dd/MM/yyyy");
    SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("dd/MM/yyyy");
    String expected= "Mon 22/07/2019";
    Date actual=weekDay.firstDayOfWeek(simpleDateFormat1.parse("22/07/2019"));
    assertEquals(expected,simpleDateFormat.format(actual));
  }

  @Test
  public void firstDayOfWeekNotNull() throws ParseException {
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("E dd/MM/yyyy");
    SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("dd/MM/yyyy");
    Date actual=weekDay.firstDayOfWeek(simpleDateFormat1.parse("22/07/2019"));
    assertNotNull(simpleDateFormat.format(actual));
  }



  @Test
  public void lastDayOfWeek()throws ParseException  {
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("E dd/MM/yyyy");
    SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("dd/MM/yyyy");
    String expected= "Sun 04/08/2019";
    Date actual=weekDay.lastDayOfWeek(simpleDateFormat1.parse("30/07/2019"));
    assertEquals(expected,simpleDateFormat.format(actual));
  }

}
