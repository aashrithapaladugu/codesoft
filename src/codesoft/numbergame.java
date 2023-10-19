package codesoft;
import java.util.Random;
import java.util.*;
public class numbergame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int lowerBound=1;
        int upperBound=20;
        int numbertoguess;
        int maxattempts=10;
        int score=0;
        System.out.println("Welcome to number guessing game");
        while (true){
            numbertoguess= random.nextInt(upperBound-lowerBound+1)+lowerBound;
            int attempts=0;
            System.out.println("I've selected a number between "+lowerBound+"and"+upperBound+". Try to guess it!");
            while(attempts<maxattempts){
                System.out.println("Enter your guess:");
                int userguess=scanner.nextInt();
                attempts++;
                if(userguess== numbertoguess){
                    System.out.println("Congratulations You guessed the correct number in"+attempts+"attempts");
                    score++;
                    break;

                } else if (userguess<numbertoguess) {
                    System.out.println("Try a higher number.Attempts left :"+(maxattempts-attempts));

                }else{
                    System.out.println("Try a lower number.Attempts left:"+(maxattempts-attempts));
                }

            }
            if(attempts>=maxattempts){
                System.out.println("Sorry,you've reached maximum attempts.The correct number was"+numbertoguess);

            }
            System.out.println("Do you want to play another round?(y/n):");
            String playAgain= scanner.next().toLowerCase();
            if(!playAgain.equals("y")){
                System.out.println("Thanks for playing!Your final score:"+score);
                break;
            }
        }
        scanner.close();
    }
}
