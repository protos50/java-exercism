package HexGame;

import java.util.*;

public class HexGame {
    private int[][] board;
    private int size;
    private int player1;
    private int player2;
    private boolean gameOver;

    public HexGame(String boardString) {
        String[] rows = boardString.trim().split("\n");
        size = rows.length;
        board = new int[size][size];
        player1 = 1;
        player2 = 2;
        gameOver = false;
        for (int i = 0; i < size; i++) {
            String[] cols = rows[i].trim().split(" ");
            for (int j = 0; j < size; j++) {
                board[i][j] = Integer.parseInt(cols[j]);
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public int getPlayer1() {
        return player1;
    }

    public int getPlayer2() {
        return player2;
    }

    public int getWinner() {
        boolean[][] visited = new boolean[size][size];
        for (int col = 0; col < size; col++) {
            if (board[0][col] == player1 && hasPathToOppositeSide(0, col, visited, player1)) {
                return player1;
            }
        }
        visited = new boolean[size][size];
        for (int row = 0; row < size; row++) {
            if (board[row][0] == player2 && hasPathToOppositeSide(row, 0, visited, player2)) {
                return player2;
            }
        }
        return 0;
    }

    public void makeMove(int player, int row, int col) {
        if (!isValidMove(row, col)) {
            return;
        }
        board[row][col] = player;
        if (hasPlayerWon(player)) {
            gameOver = true;
        }
    }

    private boolean isValidMove(int row, int col) {
        if (row < 0 || col < 0 || row >= size || col >= size) {
            return false;
        }
        if (board[row][col] != 0) {
            return false;
        }
        return true;
    }

    private boolean hasPlayerWon(int player) {
        boolean[][] visited = new boolean[size][size];
        List<Integer> startCells = (player == player1) ? getStartCellsForPlayer1() : getStartCellsForPlayer2();
        for (int i : startCells) {
            int row = (player == player1) ? i : 0;
            int col = (player == player1) ? 0 : i;
            if (hasPathToOppositeSide(row, col, visited, player)) {
                return true;
            }
        }
        return false;
    }

    private List<Integer> getStartCellsForPlayer1() {
        List<Integer> startCells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            startCells.add(i);
        }
        return startCells;
    }

    private List<Integer> getStartCellsForPlayer2() {
        List<Integer> startCells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            startCells.add(i);
        }
        return startCells;
    }

    private boolean hasPathToOppositeSide(int row, int col, boolean[][] visited, int player) {
        if (row < 0 || col < 0 || row >= size || col >= size) {
            return false;
        }
        if (visited[row][col] || board[row][col] != player) {
            return false;
        }
        if ((player == player1 && col == size - 1) || (player == player2 && row == size - 1)) {
            return true;
        }
        visited[row][col] = true;
        if (hasPathToOppositeSide(row - 1, col, visited, player)) {
            return true;
        }
        if (hasPathToOppositeSide(row + 1, col, visited, player)) {
            return true;
        }
        if (hasPathToOppositeSide(row, col - 1, visited, player)) {
            return true;
        }
        if (hasPathToOppositeSide(row, col + 1, visited, player)) {
            return true;
        }
        if (hasPathToOppositeSide(row - 1, col + 1, visited, player)) {
            return true;
        }
        if (hasPathToOppositeSide(row + 1, col - 1, visited, player)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String boardString = "1 0 0 0\n2 1 0 0\n2 1 0 0\n2 1 0 0\n";
        HexGame game = new HexGame(boardString);
        game.printBoard();
        System.out.println("Winner: " + game.getWinner());
    }
}
