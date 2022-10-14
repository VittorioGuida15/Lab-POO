public class Main {
    public static void main(String[] args) {
        String[] words = {"c","ac","pippo"};

        for (String word : words) {
            String result;

            if(word.length() == 1){
                System.out.println("Stringa corta");
                continue;
            }

            String prima = word.substring(0,1);
            int ultimaPosizione = word.length() - 1;
            String ultima = word.substring(ultimaPosizione);

           String base = word.substring(1,ultimaPosizione);


            String tmp = ultima.concat(base);
            result = tmp.concat(prima);

            System.out.println(result);
        }
    }
}