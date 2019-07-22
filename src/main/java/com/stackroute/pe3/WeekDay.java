package com.stackroute.pe3;

import java.util.Calendar;
import java.util.Date;

public class WeekDay {
  public Date firstDayOfWeek(Date date){
    Calendar calendar= Calendar.getInstance();
    calendar.setTime(date);
    calendar.setFirstDayOfWeek(Calendar.MONDAY);
    calendar.set(Calendar.DAY_OF_WEEK,calendar.getFirstDayOfWeek());
    return calendar.getTime();
  }

  public Date lastDayOfWeek( Date date){
    Calendar calendar=Calendar.getInstance();
    calendar.setTime(date);
    calendar.setFirstDayOfWeek(Calendar.MONDAY);
    calendar.set(Calendar.DAY_OF_WEEK,calendar.SUNDAY);
    return calendar.getTime();
  }
}


