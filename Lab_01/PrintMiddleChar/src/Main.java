public class Main {
   public static void main(String[] args) {
      String[] words = {"pippo", "pluto", "alice", "bob"};

      for (String word : words) {

         int centro = word.length() / 2;
         char middle = word.charAt(centro);

         System.out.println(middle);
      }
   }
}