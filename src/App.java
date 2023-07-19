

import java.io.Console;
import java.util.Scanner;

import com.coding.ShoppingCart.ShoppingCart;
import com.coding.exercises.Consonants;
import com.coding.exercises.LastLetterCount;
import com.coding.exercises.Occurrences;
import com.coding.exercises.Palindrome;
import com.coding.exercises.RotateString;
import com.coding.exercises.TraverseString;
import com.coding.exercises.Vowels;
import com.coding.exercises.Words;

public class App {
    public static void main(String[] args) throws Exception {

        ShoppingCart cart = new ShoppingCart("Anabel");
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while(!exit){
            System.out.println("==== Shopping Cart Menu ====");
            System.out.println("1. Show Subtotal Balance");
            System.out.println("2. Add Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Subtotal: "+cart.getSubTotal());                    
                    break;
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
                    break;
            }
        }
        System.out.println("Thank you for using the shopping cart!");
        
        // // Print the sentence along with the count of vowels in it.
        // String sentence = "Anabel";
        // System.out.println("The amount of vowels in "+sentence+" is: "+Vowels.countVowels(sentence));

        // System.out.println("-----------------------------------------");

        // // Print whether the phrase is a palindrome or not.
        // String phrase = "anay";
        // System.out.println("Is the phrase "+phrase+" a palindrome?: "+Palindrome.isPalindrome(phrase));

        // System.out.println("-----------------------------------------");

        // // Print the count of words in the given sentence.
        // String sentenceTwo = "Believe in yourself and all that you are capable of achieving.";
        // System.out.println("The amount of Words in \""+sentenceTwo+"\" is: "+Words.countWords(sentenceTwo));

        // System.out.println("-----------------------------------------");

        // String sentenceThree = "Keep going, even when it gets tough.";
        // // Print the count of consonants in the given sentence.
        // System.out.println("The amount of consonants in \""+sentenceThree+"\" is: "+Consonants.countConsonants(sentenceThree));
        // // Print the new sentence with replaced consonants.
        // System.out.println("The new sentence is: "+Consonants.replaceConsonants(sentenceThree));

        // System.out.println("-----------------------------------------");

        // String sentenceFour = "This is used for any tool and technology";
        // // Print the count of words that end with 's'
        // System.out.println("The amount of words that ends with 's' is: "+ LastLetterCount.countEndsWithS(sentenceFour));
        // // Print the count of words that end with 'y'
        // System.out.println("The amount of words that ends with 'y' is: "+ LastLetterCount.countEndsWithY(sentenceFour));
        // // Switch the first word that ends with 's' with the first word that ends with 'y' and print the result
        // System.out.println("The switch is: "+ LastLetterCount.switchFirstWordSforY(sentenceFour));

        // System.out.println("-----------------------------------------");

        // String sentenceFive = "Apple";
        // // Rotate the string by a number of places characters to the right
        // System.out.println("The roteted string is: "+RotateString.rotateString(2, sentenceFive));

        // System.out.println("-----------------------------------------");

        // int[] numbs = {1,1,1,1,2,3,4,6,6,7,4,9,7,6,5,4};
        // Occurrences.occurrences(numbs).forEach((key, value) -> {
        //     System.out.print(key+":"+value);
        //     System.out.print(",");
        // });

        // System.out.println("-----------------------------------------");

        // String sentenceSix = "racecar";
        // // Print the unique values of the sentence
        // System.out.println("The unique elements are: "+TraverseString.traveString(sentenceSix));
    }
}
