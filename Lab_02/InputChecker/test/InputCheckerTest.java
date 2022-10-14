import org.junit.Assert;
import org.junit.Test;

public class InputCheckerTest {
    @Test
    public void testCheckInput() {
        String test = "S";
        InputChecker inputChecker = new InputChecker();

        Assert.assertEquals("OK", inputChecker.checkInput(test));
        test = "SI";
        Assert.assertEquals("OK", inputChecker.checkInput(test));
        test = "OK";
        Assert.assertEquals("OK", inputChecker.checkInput(test));
        test = "certo";
        Assert.assertEquals("OK", inputChecker.checkInput(test));
        test = "perchè no";
        Assert.assertEquals("OK", inputChecker.checkInput(test));

        test = "N";
        Assert.assertEquals("Fine", inputChecker.checkInput(test));
        test = "NO";
        Assert.assertEquals("Fine", inputChecker.checkInput(test));

        test = "abcd";
        Assert.assertEquals("Dato non corretto", inputChecker.checkInput(test));


    }
}