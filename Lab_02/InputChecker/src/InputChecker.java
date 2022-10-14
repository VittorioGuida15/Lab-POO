import java.util.Scanner;

public class InputChecker {

    public String checkInput(String input) {
        String  risultato;
        if(input.equals("S") || input.equals("SI") || input.equals("OK") || input.equals("certo") || input.equals("perchè no") )
            risultato = "OK";

        else if(input.equals("N") || input.equals("NO") )
            risultato = "Fine";

        else
            risultato = "Dato non corretto";

        return risultato;


    }

    /*public String checkInput(String input) {
        return switch (input) {
            case "S", "SI", "OK", "certo", "perche no" -> "OK";
            case "N", "NO" -> "Fine";
            default -> "Dato non corretto";
        };
    }*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Dammi l'input di verifica: ");
        String input = in.nextLine();

        InputChecker inputChecker = new InputChecker();
        System.out.println(inputChecker.checkInput(input));
    }
}