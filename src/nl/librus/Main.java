package nl.librus;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner myObj = new Scanner(System.in);

        int min = 0;
        int max = 10;
        int tryAmount;
        int userAnswer = 0;
        int computerNumber = random.nextInt(max - min + 1) + min;

        tryAmount = 1;
        while (userAnswer != computerNumber) {
            System.out.println("Kun jij het getal raden? voer het in: ");
            userAnswer = myObj.nextInt();

            System.out.println(determineGuess(userAnswer, computerNumber, tryAmount, min, max));
            tryAmount++;
        }
    }

    public static Object determineGuess(int userAnswer, int computerNumber, int tryAmount, int min, int max) {
        if (userAnswer < 0 || userAnswer > 100) {
            return "Vul een antwoord in vanaf " + min + " tot en met " + max;
        } else if (userAnswer == computerNumber) {
            return "TADA! Je hebt het nummer geraden in " + tryAmount + " keer!";
        } else if (userAnswer > computerNumber) {
            return "TE HOOG! je moet lager gokken dan " + userAnswer + " je hebt het nu " + tryAmount + " keer geprobeerd.";
        } else {
            return "TE LAAG! je moet hoger gokken dan " + userAnswer + " je hebt het nu " + tryAmount + " keer geprobeerd.";
        }
    }
}