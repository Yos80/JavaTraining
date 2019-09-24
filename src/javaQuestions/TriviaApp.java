package javaQuestions;


import java.util.Arrays;

public class TriviaApp extends gameMethods {

    public static void main(String[] args) {
        questionBuilder("which isn't an American name?");
        String[] answers = new String[]{1 + " bob", 2 + " kevin", 3 + " mitch", 4 + " adolf"};
        answersStringArray(answers);
        switchCase();


    }
}


