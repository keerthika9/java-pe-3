package com.stackroute.pe3;

public class ConsecutiveNumbers {
  public static boolean checkConsecutiveNumbers(int numberOne,int numberTwo,int numberThree) {
    if (((numberTwo == numberOne - 1) && (numberThree == numberTwo - 1)) || ((numberTwo == numberOne + 1) && (numberThree == numberTwo + 1)) || ((numberTwo == numberOne + 2) && (numberThree == numberOne + 1)) || ((numberTwo == numberOne - 1) && (numberThree == numberOne + 1)) || ((numberTwo == numberOne - 2) && (numberThree == numberOne - 1)) || ((numberTwo == numberOne + 1) && (numberThree == numberOne - 1))) {
      return true;
    } else {
      return false;
    }
  }

}

