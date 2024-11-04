package LLD.LLDQuestions.TicTacToe;

public class GameBoard {
    int size;
    Piece[][] board;

    public GameBoard(int size) {
        this.size = size;
        this.board = new Piece[size][size];
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            System.out.print("|");
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].pieceType.name() + " ");
                } else {
                    System.out.print(" ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public boolean isGameBoardFull() {
        for (int i = 0, j = 0; i < size; i++, j++) {
            if (board[i][j] == null) {
                return false;
            }
        }
        return true;
    }

    public boolean addPiece(int x, int y, Piece piece) {
        
        if (x < 0 || x >= size || y < 0 || y >= size || board[x][y] != null) {
            return false;
        }
        board[x][y] = piece;
        return true;
    }

}
