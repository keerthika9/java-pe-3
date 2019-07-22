package com.stackroute.pe3;

public class ExceptionsTypes {
  public static void main(String[] args) {
    try{
      int arr[]=new int[-3];
    }catch(NegativeArraySizeException e){
      System.out.println(e);
    }

    try{
      int arr[]=new int[3];
      arr[3]=30;
    }catch(IndexOutOfBoundsException e){
      System.out.println(e);
    }

    try{
      int arr[]=null;
      int length=arr.length;
    }catch(NullPointerException e){
      System.out.println(e);
    }
  }

}
