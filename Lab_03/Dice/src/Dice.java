import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {
        BankAccount playerAccount = new BankAccount(1000);
        BankAccount casinoAccount = new BankAccount(100000);
        int predictedValue, actualValue;
        double bet;
        String choice = "no";
        Scanner in = new Scanner(System.in);


        do {
            System.out.println("Previsione risultato del dato a 6 faccie: ");
            predictedValue = in.nextInt();

            System.out.println("Quanto vuoi scommettere: ");
            bet = in.nextDouble();
            if (bet < playerAccount.getBalance()) {

                playerAccount.withdraw(bet);
                casinoAccount.deposit(bet);

                Random dado = new Random();
                actualValue = dado.nextInt(1, 7);
                System.out.println("Il dado ha restituito " + actualValue + ".");

                if (actualValue == predictedValue) {
                    casinoAccount.withdraw(bet * 5.0);
                    playerAccount.deposit(bet * 5.0);
                    System.out.println("Hai vinto!!! - - - :-D - - -");
                } else {
                    System.out.println("Hai perso! - - - :-( - - -");
                }
            } else System.out.println("Non ha abbastanza soldi per giocare!");

            if(playerAccount.getBalance() != 0) {
                System.out.println("Digita si se vuoi continuare a scommettere: ");
                choice = in.next();
            }

        }while(choice.equalsIgnoreCase("si"));

        System.out.println("Il tuo saldo è " + playerAccount.getBalance());

    }

}
