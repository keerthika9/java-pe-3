package com.stackroute.pe3;

public class MatrixAddition {
  private int [][] matrix1;
  private int [][] matrix2;

  public void Matrix1(int[][] matrix1) {
    this.matrix1 = matrix1;
  }

  public void Matrix2(int[][] matrix2) {
    this.matrix2 = matrix2;
  }

  public int [][] additionOfMatrices(){
    if(matrix1==null ||matrix2==null)
      return  null;
    int row=matrix1.length;
    int column=matrix1[0].length;
    int [][] result=new int[matrix1.length][matrix1[0].length];
    for(int i=0;i<row;i++){
      for(int j=0;j<column;j++){
        result[i][j]=matrix1[i][j]+matrix2[i][j];
      }
    }
    return  result;
  }
}
