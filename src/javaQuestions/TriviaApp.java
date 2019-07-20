package javaQuestions;

import java.util.Scanner;

public class TriviaApp {

    public static void main(String[] args) {

        trivia();

    }


    public static void trivia() {
        Scanner scan = new Scanner(System.in);
        int rightCounter = 0;
        int wrongCounter = 0;
        Boolean quit = false;



        System.out.println("Question1: " + "Which ISN'T a Superwing? ");
        System.out.println("1." + " jet");
        System.out.println("2." + " mira");
        System.out.println("3." + " donnie");
        System.out.println("4." + " boris");

        System.out.println("Choose the correct answer");
        while (!quit) {
            int answer1 = scan.nextInt();
            switch (answer1) {
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


        System.out.println("Question2: " + "Which ISN'T an animal? ");
        System.out.println("1." + " mouse");
        System.out.println("2." + " chair");
        System.out.println("3." + " dog");
        System.out.println("4." + " bird");

        System.out.println("Choose the correct answer");
        while (quit) {
            int answer2 = scan.nextInt();
            switch (answer2) {
                case 1:
                case 3:
                case 4:
                    System.out.println("Incorrect:(");
                    wrongCounter++;
                    quit = false;
                    break;
                case 2:
                    System.out.println("Correct!!!");
                    quit = false;
                    rightCounter++;
                    break;
                default:
                    System.out.println("Select 1-4 only");

            }

        }

        System.out.println("Question3: " + "Best martial artists ever? ");
        System.out.println("1." + " van damme");
        System.out.println("2." + " kung fu panda");
        System.out.println("3." + " karate yaho");
        System.out.println("4." + " neo");

        System.out.println("Choose the correct answer");
        while (!quit) {
            int answer3 = scan.nextInt();
            switch (answer3) {
                case 2:
                case 3:
                case 4:
                    System.out.println("Incorrect:(");
                    wrongCounter++;
                    quit = true;
                    break;
                case 1:
                    System.out.println("Correct!!!");
                    quit = true;
                    rightCounter++;
                    break;
                default:
                    System.out.println("Select 1-4 only");
            }

        }

        System.out.println("Question4: " + "Which is a city in Spain? ");
        System.out.println("1." + " Berlin");
        System.out.println("2." + " Boston");
        System.out.println("3." + " Yavne");
        System.out.println("4." + " Madrid");

        System.out.println("Choose the correct answer");
        while (quit) {
            int answer4 = scan.nextInt();
            switch (answer4) {
                case 1:
                case 2:
                case 3:
                    System.out.println("Incorrect:(");
                    wrongCounter++;
                    quit = false;
                    break;
                case 4:
                    System.out.println("Correct!!!");
                    quit = false;
                    rightCounter++;
                    break;
                default:
                    System.out.println("Select 1-4 only");

            }
        }

        System.out.println("Question4: " + "How many Friends seasons are there? ");
        System.out.println("1." + "  1");
        System.out.println("2." + "  15");
        System.out.println("3." + "  7");
        System.out.println("4." + "  too many");

        System.out.println("Choose the correct answer");
        while (!quit) {
            int answer5 = scan.nextInt();
            switch (answer5) {
                case 1:
                case 2:
                case 3:
                    System.out.println("Incorrect");
                    wrongCounter++;
                    quit = true;
                    break;
                case 4:
                    System.out.println("Correct!!!");
                    quit = true;
                    rightCounter++;
                    break;
                default:
                    System.out.println("Select 1-4 only");
            }
        }

        System.out.println("You have " + rightCounter + " right answers");
        System.out.println("You have " + wrongCounter + " wrong answers");

    }
}