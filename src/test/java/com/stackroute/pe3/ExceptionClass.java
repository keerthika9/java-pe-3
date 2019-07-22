package com.stackroute.pe3;

public class ExceptionClass {
  public class Main extends Exception {
    public Main(String message) {
      super(message);
    }

    public void main(String[] args) {
      try {
        throw new Main("exception occured in main method.");
      } catch (Exception e) {
        System.out.println(e);
      } finally {
        System.out.println("this is a finally block.");
      }
      System.out.println("this is after try-catch-finally block.");
    }
  }
}
