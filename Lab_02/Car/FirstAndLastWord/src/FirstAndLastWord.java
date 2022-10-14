import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FirstAndLastWord {

    List<String> stringList;

    public FirstAndLastWord(List<String> stringList) {
        this.stringList = stringList;
    }

    /*public void sort() {
        String prima, ultima;
        prima = stringList.get(0);
        ultima = stringList.get(1);
        for(String string : stringList) {
            if( (string.compareTo(prima)) < 0)
                prima = string;
            else if( (string.compareTo(ultima)) > 0)
                ultima = string;
        }

        System.out.println(prima);
        System.out.println(ultima);
    }*/

    public void sort() {
        boolean controllo = true;
        while (controllo){
            controllo = false;
            for (int i = 1; i < stringList.size(); i++) {
                if ((stringList.get(i - 1).compareTo(stringList.get(i))) > 0) {
                    String t = stringList.get(i);
                    stringList.set(i, stringList.get(i - 1));
                    stringList.set(i - 1, t);
                    controllo = true;
                }

            }
        }
    }

    public void sortIgnoreCase() {
        boolean controllo = true;
        while (controllo){
            controllo = false;
            for (int i = 1; i < stringList.size(); i++) {
                if ((stringList.get(i - 1).compareToIgnoreCase(stringList.get(i))) > 0) {
                    String t = stringList.get(i);
                    stringList.set(i, stringList.get(i - 1));
                    stringList.set(i - 1, t);
                    controllo = true;
                }

            }
        }
    }

    public String getFirst() {
        return stringList.get(0);
    }

    public String getLast() {
        return stringList.get(stringList.size() - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();

        System.out.println("Dammi il numero di parole da analizzare: ");
        int numberOfWords = in.nextInt();
        in.nextLine();

        System.out.println("Dimmi se vuoi ignorare la differenza tra maiuscole e minuscole: S/N");
        String ignoreCase = in.nextLine();

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println("Dammi una stringa: ");
            stringList.add(in.nextLine());
        }

        FirstAndLastWord firstAndLastWord = new FirstAndLastWord(stringList);

        switch (ignoreCase.toUpperCase()) {
            case "S" -> firstAndLastWord.sortIgnoreCase();
            case "N" -> firstAndLastWord.sort();
        }

        System.out.println("The first word is " + firstAndLastWord.getFirst());
        System.out.println("The last word is " + firstAndLastWord.getLast());
    }
}