import java.util.Scanner;

public class TicTacToe {

    private final String[][] board;
    static int ROWS = 3;
    static int COLUMNS = 3;
    static String player1 = "x";
    static String player2 = "o";

    public TicTacToe() {
        board = new String[ROWS][COLUMNS];
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLUMNS; j++)
                board[i][j] = " ";
    }

    public String toString() {
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < ROWS; i++) {
            r.append("|");
            for (int j = 0; j < COLUMNS; j++)
                r.append(board[i][j]);
            r.append("|\n");
        }
        return r.toString();
    }

    public void set(int i, int j, String player) {
        if (board[i][j].equals(" "))
            board[i][j] = player;
    }

    public String getWinner() {
        // Player1
        for(int j = 0; j < COLUMNS; j++){ //verticale
            if(board[0][j].equals(player1))
                if(board[1][j].equals(player1))
                    if(board[2][j].equals(player1))
                        return "x";
        }
        for(int i = 0; i < ROWS; i++){ //orizzontale
            if(board[i][0].equals(player1))
                if(board[i][1].equals(player1))
                    if(board[i][2].equals(player1))
                        return "x";
        }
        if(board[0][0].equals(player1) && board[1][1].equals(player1) && board[2][2].equals(player1))
            return "x"; //obbliguo1
        if(board[0][2].equals(player1) && board[1][1].equals(player1) && board[2][0].equals(player1))
            return "x"; //obbliguo2


        //Player2
        for(int j = 0; j < COLUMNS; j++){ //verticale
            if(board[0][j].equals(player2))
                if(board[1][j].equals(player2))
                    if(board[2][j].equals(player2))
                        return "o";
        }
        for(int i = 0; i < ROWS; i++){ //orizzontale
            if(board[i][0].equals(player2))
                if(board[i][1].equals(player2))
                    if(board[i][2].equals(player2))
                        return "o";
        }
        if(board[0][0].equals(player2) && board[1][1].equals(player2) && board[2][2].equals(player2))
            return "o"; //obbliguo1
        if(board[0][2].equals(player2) && board[1][1].equals(player2) && board[2][0].equals(player2))
            return "o"; //obbliguo2


        //Nessun vincitore;
        return "Nessun vincitore";

    }

    public static void main(String[] args) {
        String player = player1;
        TicTacToe game = new TicTacToe();
        Scanner in = new Scanner(System.in);
        int row, column;
        int cont = 2;
        System.out.println(game);

        do {

            if (game.getWinner().equals(player1) || game.getWinner().equals(player2)) {
                System.out.println("Partita finita");
                System.exit(0);
            }

            System.out.println("Inserisci riga per " + player + " (-1 per uscire):");
            row = in.nextInt();

            if (row == -1) {
                System.out.println("Partita finita");
                System.exit(0);
            }

            System.out.println("Inserisci colonna per " + player + ":");
            column = in.nextInt();

            if (row >= ROWS || column >= COLUMNS) {
                System.out.println("Combinazione non valida");
            } else {
                game.set(row, column, player);
                System.out.println(game.toString());

                if(cont % 2 == 0)
                    player = player2;
                else
                    player = player1;
                cont++;

            }

        } while (row < ROWS && column < COLUMNS);
    }
}