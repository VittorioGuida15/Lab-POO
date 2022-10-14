public class Main {
   public static void main(String[] args) {
      char middleChar;
      for(String word : args){
         int centro = word.length() / 2;

         middleChar = word.charAt(centro);

      System.out.println(middleChar);
      }
   }
}