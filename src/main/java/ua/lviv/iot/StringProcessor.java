package ua.lviv.iot;

import java.util.Scanner;
import java.util.regex.Pattern;

public final class StringProcessor {

    public String threeConsonantRepWord(String textWords) {
        String result = "";
        String inputText = readInputText();
        String[] words = textWords.split(" ");
        for (String word : words) {
            int lenght = word.length();
                if (Pattern.matches("[^auoie]", word.substring(0, 1))&&
                        Pattern.matches("[^auoie]", word.substring(1, 2))&&
                        Pattern.matches("[^auoie]", word.substring(2, 3))) {
                    result += inputText +word.substring(3, lenght);
                } else {
                    result += word.substring(0, lenght);
                }
            
            result += " ";
        }
        return result;
    }

    public static String readInputText() {
        System.out.println("Enter text:");
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public  void showResults(String textResult) {
        System.out.print(textResult);
    }
}
