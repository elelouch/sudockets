package game.ui.sudoku.game;

public interface SudokuGame {
    void setCell(int i, int j, int num);
    void undoCell(int i, int j);
    void setAllCells(int[][] board);
    void setSolution(int[][] solution);
}