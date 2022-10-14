public class Main {
   public static void main(String[] args) {
      String[] words = {"c","ac","ciao","pippo"};

      for (String word : words) {
         String result;

         int lunghezza = word.length();
         int divisione = lunghezza / 2;

         if(lunghezza <= 1){
            System.out.println("Stringa corta");
            continue;
         }

         String primaParte = word.substring(0, divisione);
         String secondaParte = word.substring(divisione, lunghezza);

         result = secondaParte + primaParte;


         System.out.println(result);
      }
   }
}