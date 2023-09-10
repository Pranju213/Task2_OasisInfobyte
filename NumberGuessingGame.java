import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
Random random = new Random();
int lowerBound = 1;    
int upperBound=100;
int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
int attempts = 0;
System.out.println("Welcome to the Number Guessing Game!");
System.out.println("I've selected a random number between " + lowerBound + " and " + upperBound + ". Try to guess it!");
while (true) 
{
System.out.print("Enter your guess: ");
int guess = scanner.nextInt();
attempts++;
if (guess < lowerBound || guess > upperBound) 
{
System.out.println("Please enter a number between " + lowerBound + " and " + upperBound + ".");
} 
else if (guess < numberToGuess) 
{
System.out.println("Number is Higher! Try again.");
} 
else if (guess > numberToGuess) 
{
System.out.println("Number is Lower! Try again.");
}
else 
{
System.out.println("Congratulations! You guessed the number " + numberToGuess + " in " + attempts + " attempts.");
break;
}
}
scanner.close();
}
}