import java.util.Arrays;
import java.util.Scanner;

public class MagicSquare {
    private final int[][] square;
    private final int n;

    public MagicSquare(int n) {
        this.n = n;
        square = new int[n][n];
    }

    private boolean find(int x) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (square[i][j] == x) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isFull() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (square[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void add(int x) {

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(square[i][j] == 0) {
                    square[i][j] = x;
                    return;
                }
            }
        }
    }

    public boolean isMagic() {
        int magicNumber = 0;
        boolean isMagic = true;

        for(int i = 0; i < n; i++)
           magicNumber += square[i][0];

        int diagonal1 = 0;
        for(int i = 0, j = 0 ; i < n && j < n; i++, j++)
            diagonal1 += square[i][j];
        //System.out.println("Diagonale 1:" + diagonal1);

        if(magicNumber != diagonal1)
            return !isMagic;

        int diagonal2 = 0;
        for(int i = n-1, j = 0 ; i >= 0 && j < n; i--, j++)
            diagonal2 += square[i][j];
        //System.out.println("Diagonale 2:" + diagonal2);

        if(magicNumber != diagonal2)
            return !isMagic;


        for(int i = 0; i < n; i++){
            int row = 0;
            for(int j = 0; j < n; j++){
                row += square[i][j];
                //System.out.println("riga" + j + ":" + row);
            }
            if(row != magicNumber)
                return !isMagic;
        }

        for(int j = 0; j < n; j++){
            int column = 0;
            for(int i = 0; i < n; i++) {
                column += square[i][j];
                //System.out.println("colonna" + i + ":" + column);
            }
            if (column != magicNumber)
                return !isMagic;
        }

        return isMagic;
    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                toString.append(square[i][j]).append(" ");
            }
            toString.append("\n");
        }
        return toString.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci n --> ");
        int n = input.nextInt();
        MagicSquare square = new MagicSquare(n);

        while (!square.isFull()) {
            int x;
            do {
                System.out.print("Inserisci un numero --> ");
                x = input.nextInt();

                if (x < 1 || x > n * n) {
                    System.out.println("Devi inserire numeri compresi tra 1 e n^2!");
                } else {
                    if (square.find(x)) {
                        System.out.println("Questo numero lo avevi già inserito!");
                    }
                }
            } while (square.find(x) || x < 1 || x > n * n);
            square.add(x);
            System.out.println(square);
        }

        boolean magic = square.isMagic();

        if (magic)
            System.out.println("È un quadrato magico!");
        else
            System.out.println("Non è un quadrato magico!");
    }
}