package Practice.Test7;

public class t4 {
    public static void main(String[] args) {
        String s = "geeks for geeks";
        printFirstLetter(s);
    }

    private static void printFirstLetter(String s) {
        String[] words = s.split(" ");
        for (String word : words) {
            System.out.print(word.charAt(0) + " ");
        }
//        for (int i = 0; i < words.length; i++) {
//            System.out.print(words[i] + " ");
//        }
    }

}
