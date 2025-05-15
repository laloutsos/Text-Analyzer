
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nTest String Trie\n");

        StringTrie T = new StringTrie();

        try {
            File file = new File("DickensB.txt");
            Scanner scanner = new Scanner(file);

            long startTime = System.currentTimeMillis();
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase().replaceAll("[^a-z]", "");
                if (!word.isEmpty()) {
                    T.insert(word);
                }
            }
            scanner.close();

            System.out.println(T.size() + " words");
            long endTime = System.currentTimeMillis();
            System.out.println("construction time = " + (endTime - startTime));
            System.out.println("memory KB = " +
                    (double) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024 + "\n");

            String s = "astonished";
            System.out.println("\ncontains " + s + " = " + T.contains(s));

            s = "carol";
            System.out.println("contains " + s + " = " + T.contains(s));

            s = "pigeon";
            System.out.println("contains " + s + " = " + T.contains(s));

            s = "wondered";
            System.out.println("contains " + s + " = " + T.contains(s));

            s = "governmental";
            System.out.println("\nlongest prefix of " + s + " = " + T.longestPrefixOf(s));

            s = "caro";
            System.out.println("\nnumber of words with prefix " + s + " = " + T.countWordsWithPrefix(s));
            System.out.println("\nwords with prefix " + s + " : ");
            T.printWords(T.wordsWithPrefix(s));

            s = "sco";
            System.out.println("\nnumber of words with prefix " + s + " = " + T.countWordsWithPrefix(s));

            s = "sc????e";
            System.out.println("\nwords that match " + s + " : ");
            T.printWords(T.wordsThatMatch(s));

            Item I = T.mostFrequent();
            System.out.println("\nmost frequent word = " + I.getS() + " " + I.getCount());


            T.delete("carol");
            T.delete("carouse");
            s = "caro";
            System.out.println("\nnumber of words with prefix " + s + " = " + T.countWordsWithPrefix(s));
            System.out.println("\nwords with prefix " + s + " : ");
            T.printWords(T.wordsWithPrefix(s));

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
