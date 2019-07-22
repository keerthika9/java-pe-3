package com.stackroute.pe3;

public class StudentGrades {
    int numOfStudents;
    int  stuGrades[];

    public StudentGrades(int numOfStudents, int[] stuGrades) {
        this.numOfStudents = numOfStudents;
        this.stuGrades = stuGrades;
    }

    public boolean checkGrades(){
        for (int element: stuGrades) {
            if(element < 0 || element >100){
                return false;
            }
        }
        return true;
    }
}
