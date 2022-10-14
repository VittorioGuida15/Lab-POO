public class Main {
   public static void main(String[] args) {
      if(args.length == 3){

         String totale = "";

         for(String word : args){
            char prima = word.charAt(0);

            totale = totale + prima;

         }

         System.out.println(totale);

      }
      else
         System.out.println("Errore, inserisci 3 stringhe!");
   }
}