public class Main {
   public static void main(String[] args) {
      String[] words = {"pippo", "pluto", "alice", "bob"};

      for (String word : words) {
         char middleChar;
         //Selezionare il carattere centrale usando CharAt
         int centro = word.length() / 2;
         middleChar = word.charAt(centro);
         System.out.println(middleChar);
      }

      String[] words2 = {"John", "Fitzgerald", "Kennedy"};
      String totale = "";
      //Selezionare le tre iniziali e concatenarle usando CharAt
      for(String word : words2){
         char prima = word.charAt(0);
         totale = totale + prima;
      }
      System.out.println(totale);
   }
}