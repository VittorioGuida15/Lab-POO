public class Main {
   public static void main(String[] args) {
      String sentence = "Hello, World!";
      StringBuilder newSentence = new StringBuilder(sentence);
      for(int i = 0; i < sentence.length(); i++){
         char c = sentence.charAt(i);
         if(c == 'e') {
            newSentence.replace(i,i+1,"o");
         }
         else if( c == 'o'){
            newSentence.replace(i, i+1, "e");
         }

      }

      System.out.println(newSentence);
   }
}