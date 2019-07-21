package javaQuestions;


import java.util.Scanner;

public class gameMethods {


    public static void questionBuilder(String question) {

        System.out.println(question);

    }

    public static void answersStringArray(String[] answers) {

        for (int i = 0; i < 4; i++) {
            System.out.println(answers[i]);

        }
        System.out.println("Select to correct answer(1-4)");
    }

    public static void switchCase() {
        Scanner scan = new Scanner(System.in);
        int rightCounter = 0;
        int wrongCounter = 0;
        Boolean quit = false;
        while (!quit) {
            int userInput = scan.nextInt();
            switch (userInput) {
                case 1:
                case 2:
                case 3:
                    System.out.println("Incorrect:(");
                    wrongCounter++;
                    quit = true;
                    break;
                case 4:
                    System.out.println("Correct!!!");
                    rightCounter++;
                    quit = true;
                    break;
                default:
                    System.out.println("Select 1-4 only");


            }
        }
    }
}


