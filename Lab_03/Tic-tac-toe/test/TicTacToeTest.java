import org.junit.Assert;
import org.junit.Test;

public class TicTacToeTest {

    @Test
    public void horizontalWinTest() {
        TicTacToe tris = new TicTacToe();
        tris.set(0, 0, TicTacToe.player1);
        tris.set(0, 1, TicTacToe.player1);
        tris.set(0, 2, TicTacToe.player1);
        Assert.assertEquals(TicTacToe.player1, tris.getWinner());
    }

    @Test
    public void verticalWinTest() {
        TicTacToe tris = new TicTacToe();
        tris.set(0, 0, TicTacToe.player2);
        tris.set(1, 0, TicTacToe.player2);
        tris.set(2, 0, TicTacToe.player2);
        Assert.assertEquals(TicTacToe.player2, tris.getWinner());
    }

    @Test
    public void firstDiagonalWinTest() {
        TicTacToe tris = new TicTacToe();
        tris.set(0, 0, TicTacToe.player1);
        tris.set(1, 1, TicTacToe.player1);
        tris.set(2, 2, TicTacToe.player1);
        Assert.assertEquals(TicTacToe.player1, tris.getWinner());
    }

    @Test
    public void secondDiagonalWinTest() {
        TicTacToe tris = new TicTacToe();
        tris.set(0, 2, TicTacToe.player2);
        tris.set(1, 1, TicTacToe.player2);
        tris.set(2, 0, TicTacToe.player2);
        Assert.assertEquals(TicTacToe.player2, tris.getWinner());
    }
}