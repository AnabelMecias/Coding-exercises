public class App {
    public static void main(String[] args) throws Exception {
        // Print the sentence along with the count of vowels in it.
        String sentence = "Anabel";
        System.out.println("The amount of vowels in "+sentence+" is: "+Vowels.countVowels(sentence));

        String phrase = "anay";
        System.out.println("Is the phrase "+phrase+" a palindrome?: "+Palindrome.isPalindrome(phrase));

    }
}
