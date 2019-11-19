package ua.lviv.iot;

public class Main {

    public static void main(final String[] args) {
        StringProcessor text = new StringProcessor();
        String line = StringProcessor.readInputText();
        text.showResults(text.threeConsonantRepWord(line));
    }

  }