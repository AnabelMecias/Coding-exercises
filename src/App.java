import com.coding.ShoppingCart.Product;
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
        ShoppingCart cart = new ShoppingCart("Anabel Shopping Cart");

        Product product1 = new Product(1, "T-Shirt", 19.99f, 0.0f, "A basic cotton t-shirt", 0);
        Product product2 = new Product(2, "Jeans", 59.99f, 0.2f, "Slim-fit denim jeans",0);
        Product product3 = new Product(3, "Sneakers", 79.99f, 0.1f, "Running shoes with cushioned soles",0);
        Product product4 = new Product(4, "Backpack", 39.99f, 0.15f, "Spacious backpack with multiple compartments",0);
        Product product5 = new Product(5, "Watch", 99.99f, 0.05f, "Water-resistant wristwatch with leather strap",0);

        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.addProduct(product4);
        cart.addProduct(product5);

        System.out.println("\n-------------------------------------");
        
        cart.showProducts();
        System.out.println("The subtotal is "+cart.getSubTotal());
        System.out.println("The total of items is "+cart.getProductsQuantity());

        cart.deleteProduct(product5);
        cart.editProductQuantity(product3, 5);
        cart.showProductsAlphabetical();
        cart.showProducts();

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
