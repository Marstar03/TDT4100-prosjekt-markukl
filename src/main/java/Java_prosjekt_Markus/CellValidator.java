package Java_prosjekt_Markus;
import java.util.*;

public class CellValidator {

    //Denne metoden returnerer en boolsk verdi som forteller hvorvidt en verdi vil være i en gyldig posisjon mht. sudoku-reglene.
    //Dette gjøres ved å sjekke om verdien er i en gyldig rad, kolonne og 3x3-grid. Dersom alle disse er true, vil metoden returnere true.
    public static Boolean isValidCell(int[][] grid, int value, int row, int column) {
        return isValidRow(grid, value, row, column) && isValidColumn(grid, value, row, column) && isValidSmallGrid(grid, value, row, column);
    }

    //Denne metoden sjekker om en verdi er i en gyldig rad i en 2D int-grid.
    //Dette gjør den ved å iterere gjennom elementene i den aktuelle raden, og sjekke at verdien er unik i raden.
    private static Boolean isValidRow(int[][] grid, int value, int row, int column) {
        for (int testColumn = 0; testColumn < 9; testColumn++) {
            if (grid[row][testColumn] == value && testColumn != column) {
                return false;
            }
        }
        return true;
    }

    //Denne metoden sjekker om en verdi er i en gyldig kolonne i en 2D int-grid.
    //Dette gjør den ved å iterere gjennom elementene i den aktuelle kolonnen, og sjekke at verdien er unik i kolonnen.
    private static Boolean isValidColumn(int[][] grid, int value, int row, int column) {
        for (int testRow = 0; testRow < 9; testRow++) {
            if (grid[testRow][column] == value && testRow != row) {
                return false;
            }
        }
        return true;
    }
    //Prøv å finne en mer kompakt måte å validere smallGrid på.
    private static Boolean isValidSmallGrid(int[][] grid, int value, int row, int column) {
        List<Integer> smallGrid = new ArrayList<>();
        if (row < 3) {
            if (column < 3) {
                for (int r = 0; r < 3; r++) {
                    for (int c = 0; c < 3; c++) {
                        if (r != row && c != column) {
                            smallGrid.add(grid[r][c]);
                        }
                    }
                }
            }
            else if (column < 6) {
                for (int r = 0; r < 3; r++) {
                    for (int c = 3; c < 6; c++) {
                        if (r != row && c != column) {
                            smallGrid.add(grid[r][c]);
                        }
                    }
                }
            }
            else {
                for (int r = 0; r < 3; r++) {
                    for (int c = 6; c < 9; c++) {
                        if (r != row && c != column) {
                            smallGrid.add(grid[r][c]);
                        }
                    }
                }
            }
        }
        else if (row < 6) {
            if (column < 3) {
                for (int r = 3; r < 6; r++) {
                    for (int c = 0; c < 3; c++) {
                        if (r != row && c != column) {
                            smallGrid.add(grid[r][c]);
                        }
                    }
                }
            }
            else if (column < 6) {
                for (int r = 3; r < 6; r++) {
                    for (int c = 3; c < 6; c++) {
                        if (r != row && c != column) {
                            smallGrid.add(grid[r][c]);
                        }
                    }
                }
            }
            else {
                for (int r = 3; r < 6; r++) {
                    for (int c = 6; c < 9; c++) {
                        if (r != row && c != column) {
                            smallGrid.add(grid[r][c]);
                        }
                    }
                }
            }
        }
        else {
            if (column < 3) {
                for (int r = 6; r < 9; r++) {
                    for (int c = 0; c < 3; c++) {
                        if (r != row && c != column) {
                            smallGrid.add(grid[r][c]);
                        }
                    }
                }
            }
            else if (column < 6) {
                for (int r = 6; r < 9; r++) {
                    for (int c = 3; c < 6; c++) {
                        if (r != row && c != column) {
                            smallGrid.add(grid[r][c]);
                        }
                    }
                }
            }
            else {
                for (int r = 6; r < 9; r++) {
                    for (int c = 6; c < 9; c++) {
                        if (r != row && c != column) {
                            smallGrid.add(grid[r][c]);
                        }
                    }
                }
            }
        }

        if (smallGrid.contains(value)) {
            return false;
        }
        return true;
    }
}
