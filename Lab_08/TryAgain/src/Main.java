import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        int prove = 0;
        do{
            System.out.println("Dammi un double: ");
            try{
                sum += in.nextDouble();
                prove = 0;
            }
            catch (InputMismatchException ime){
                prove++;
                if(prove == 2)
                    break;
            }
            finally {
                in.nextLine();
            }
        }while (true);

        System.out.println("Il totale dei valori inseriti è " + sum);
    }
}