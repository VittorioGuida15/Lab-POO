public class Main {
    public static void main(String[] args) {
        String[] words = {"", "a", "alice", "bob", "pippo", "pluto"};

        for (String word : words) {
            int lunghezza = word.length();
            if(lunghezza == 0) {
                System.out.println("");
                continue;
            }
            String primo = word.substring(0, 1);
            String maiuscolo = primo.toUpperCase();
            String secondaParte = word.substring(1, lunghezza);

            String totale = maiuscolo + secondaParte;

            System.out.println(totale);
        }
    }
}