public class Main {
    public static void main(String[] args) {
        String[] words = {"", "a", "sasso", "pippo", "test"};

        for (String word : words) {
            int position = -1;

            if(word.length() != 0) {
                char primo = word.charAt(0);
                position = word.indexOf(primo, 1);

            }
            System.out.println(position);
        }
    }
}