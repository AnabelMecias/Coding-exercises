
import java.io.Console;
import java.util.Scanner;

import com.coding.ShoppingCart.Product;
import com.coding.ShoppingCart.ShoppingCart;
import com.coding.ShoppingCart.Store;
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

        Store store = new Store();

        Product product1 = new Product(1001, "Smartphone", 600.0f, 0.1f, "High-end smartphone with advanced features.",
                0, 5);
        Product product2 = new Product(2002, "Laptop", 900.0f, 0.15f, "Powerful laptop for work and gaming.", 0, 100);
        Product product3 = new Product(3003, "Headphones", 150.0f, 0.05f,
                "Wireless headphones with noise-cancellation.", 0, 200);
        Product product4 = new Product(4004, "Tablet", 250.0f, 0.2f, "Compact tablet with a high-resolution display.",
                0, 3);
        Product product5 = new Product(5005, "Smartwatch", 200.0f, 0.05f, "Fitness tracker with heart rate monitor.", 0,
                20);

        store.getProductsAvailables().add(product1);
        store.getProductsAvailables().add(product2);
        store.getProductsAvailables().add(product3);
        store.getProductsAvailables().add(product4);
        store.getProductsAvailables().add(product5);

        ShoppingCart cart = new ShoppingCart("Anabel", store);
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("==== Shopping Cart Menu ====");
            System.out.println("1. Show Subtotal Balance");
            System.out.println("2. Add Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    cart.showShoppingCartDetails();
                    break;
                case 2:
                    System.out.println("==== Products Availables ====");
                    store.showProductsInInventory();
                    String prdName = getValidProductName(scanner, "add");
                    int quantity = getValidQuantity(scanner, "add", prdName);
                    cart.addProduct(prdName, quantity);
                    cart.showProductsInCart();
                    break;
                case 3:
                    if (cart.getProductsInCart() > 0) {
                        cart.showProductsInCart();
                        String prdNameDelete = getValidProductName(scanner, "delete");
                        int quantityDelete = getValidQuantity(scanner, "delete", prdNameDelete);
                        cart.deleteProduct(prdNameDelete, quantityDelete);
                        cart.showProductsInCart();
                    } else {
                        System.out.println("There is nothing in your cart");
                    }
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
        scanner.close();

        // // Print the sentence along with the count of vowels in it.
        // String sentence = "Anabel";
        // System.out.println("The amount of vowels in "+sentence+" is:
        // "+Vowels.countVowels(sentence));

        // System.out.println("-----------------------------------------");

        // // Print whether the phrase is a palindrome or not.
        // String phrase = "anay";
        // System.out.println("Is the phrase "+phrase+" a palindrome?:
        // "+Palindrome.isPalindrome(phrase));

        // System.out.println("-----------------------------------------");

        // // Print the count of words in the given sentence.
        // String sentenceTwo = "Believe in yourself and all that you are capable of
        // achieving.";
        // System.out.println("The amount of Words in \""+sentenceTwo+"\" is:
        // "+Words.countWords(sentenceTwo));

        // System.out.println("-----------------------------------------");

        // String sentenceThree = "Keep going, even when it gets tough.";
        // // Print the count of consonants in the given sentence.
        // System.out.println("The amount of consonants in \""+sentenceThree+"\" is:
        // "+Consonants.countConsonants(sentenceThree));
        // // Print the new sentence with replaced consonants.
        // System.out.println("The new sentence is:
        // "+Consonants.replaceConsonants(sentenceThree));

        // System.out.println("-----------------------------------------");

        // String sentenceFour = "This is used for any tool and technology";
        // // Print the count of words that end with 's'
        // System.out.println("The amount of words that ends with 's' is: "+
        // LastLetterCount.countEndsWithS(sentenceFour));
        // // Print the count of words that end with 'y'
        // System.out.println("The amount of words that ends with 'y' is: "+
        // LastLetterCount.countEndsWithY(sentenceFour));
        // // Switch the first word that ends with 's' with the first word that ends
        // with 'y' and print the result
        // System.out.println("The switch is: "+
        // LastLetterCount.switchFirstWordSforY(sentenceFour));

        // System.out.println("-----------------------------------------");

        // String sentenceFive = "Apple";
        // // Rotate the string by a number of places characters to the right
        // System.out.println("The roteted string is: "+RotateString.rotateString(2,
        // sentenceFive));

        // System.out.println("-----------------------------------------");

        // int[] numbs = {1,1,1,1,2,3,4,6,6,7,4,9,7,6,5,4};
        // Occurrences.occurrences(numbs).forEach((key, value) -> {
        // System.out.print(key+":"+value);
        // System.out.print(",");
        // });

        // System.out.println("-----------------------------------------");

        // String sentenceSix = "racecar";
        // // Print the unique values of the sentence
        // System.out.println("The unique elements are:
        // "+TraverseString.traveString(sentenceSix));
    }

    private static int getValidQuantity(Scanner scanner, String action, String prdName) {
        int quantity = 0;
        while (quantity <= 0) {
            System.out.print("Enter the quantity of the product " + prdName + " you want to " + action + ": ");
            quantity = scanner.nextInt();
            scanner.nextLine();
            if (quantity <= 0) {
                System.out.println("Invalid input. Quantity must be greater than zero.");
            }
        }
        return quantity;
    }

    private static String getValidProductName(Scanner scanner, String action) {
        String prdName = "";
        while (prdName.isEmpty()) {
            System.out.print("Enter the name of the product you want to " + action + ": ");
            prdName = scanner.nextLine();
        }
        return prdName;
    }
}
