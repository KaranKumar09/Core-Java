import java.util.Scanner;
import java.util.Random;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] words = {"write", "that", "java", "programming", "hangman", "computer", "science"};
        
        boolean playAgain = true;
        
        while (playAgain) {
            String wordToGuess = words[random.nextInt(words.length)];
            char[] guessedWord = new char[wordToGuess.length()];
            for (int i = 0; i < guessedWord.length; i++) {
                guessedWord[i] = '*';
            }
            
            int misses = 0;
            boolean wordGuessed = false;
            while (!wordGuessed) {
                System.out.println("Word to guess: " + String.valueOf(guessedWord));
                System.out.print("Guess a letter: ");
                char guess = scanner.next().charAt(0);
                boolean correctGuess = false;
                
                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (wordToGuess.charAt(i) == guess) {
                        guessedWord[i] = guess;
                        correctGuess = true;
                    }
                }
                
                if (!correctGuess) {
                    misses++;
                    System.out.println("Misses: " + misses);
                }
                
                if (String.valueOf(guessedWord).equals(wordToGuess)) {
                    wordGuessed = true;
                    System.out.println("Congratulations! You guessed the word: " + wordToGuess);
                    System.out.println("Misses: " + misses);
                }
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next();
            playAgain = playAgainResponse.equalsIgnoreCase("yes");
        }
        
        System.out.println("Thank you for playing!");
        scanner.close();
    }
}

