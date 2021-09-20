package pciu.cse011.helloworld.javasession;

import java.util.Random;
import java.util.Scanner;

public class Challenge_solution9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May i have your name ?");
        String name = scanner.next();
        System.out.println("Hello " + name + "Good Evening");
        System.out.println("Shall we begin?");
        String answer = scanner.next();
        while (!answer.equalsIgnoreCase("yes")){
            System.out.println("shall we begin?");
            answer = scanner.next();
        }
        Random random = new Random();
        int x = random.nextInt(20)+1;
        System.out.println("please Guess a number : ");
        int userInput = scanner.nextInt();

        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;
        while (!shouldFinish){
            if (timesTried>=4){
                shouldFinish = true;
                hasWon = false;
                continue;
            }
            if (x == userInput){
                hasWon = true;
                shouldFinish = true;
                timesTried++;
            }
            else if (userInput <x){
                System.out.println("Guess Higher");
                userInput = scanner.nextInt();
            }else {
                System.out.println("Guess Lower");
                userInput = scanner.nextInt();
                timesTried++;
            }
        }
        if (hasWon){ System.out.println("congratulation, you have guess the number" +
                " in "+ timesTried + "time");
        }else {
            System.out.println("Game over!");
            System.out.println("the number was " + x);
        }
    }
}
