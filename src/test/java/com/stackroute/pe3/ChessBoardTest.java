package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
  ChessBoard chessBoard;

  @Before
  public void setUp() throws Exception {
    this.chessBoard=new ChessBoard();
  }

  @After
  public void tearDown() throws Exception {
    chessBoard=null;
  }
  @Test
  public void givenIntegerAsInputShouldReturnChessBoard(){
    String[][] expected={{"WW","BB","WW","BB","WW","BB","WW","BB"},
      {"BB","WW","BB","WW","BB","WW","BB","WW"},
      {"WW","BB","WW","BB","WW","BB","WW","BB"},
      {"BB","WW","BB","WW","BB","WW","BB","WW"},
      {"WW","BB","WW","BB","WW","BB","WW","BB"},
      {"BB","WW","BB","WW","BB","WW","BB","WW"},
      {"WW","BB","WW","BB","WW","BB","WW","BB"},
      {"BB","WW","BB","WW","BB","WW","BB","WW"},};
    String[][] actual=chessBoard.patternChess(8,8);
    assertArrayEquals(actual,expected);
  }

  @Test
  public void ShouldReturnNotAsAChessBoard(){
    String[][] expected={{"WW","BB","WW","BB","WW","BB","WW","BB"},
      {"BB","WW","BB","WW","BB","WW","BB","WW"},
      {"WW","BB","WW","BB","WW","BB","WW","BB"},
      {"BB","WW","BB","WW","BB","WW","BB","WW"},
      {"WW","BB","WW","BB","WW","BB","WW","BB"},
      {"BB","WW","BB","WW","BB","WW","BB","WW"},{
      "WW","BB","WW","BB","WW","BB","WW","BB"}};
    String[][] actual=chessBoard.patternChess(7,8);
    assertArrayEquals(actual,expected);
  }

}


