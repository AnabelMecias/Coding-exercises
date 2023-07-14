public class App {
    public static void main(String[] args) throws Exception {
        // Print the sentence along with the count of vowels in it.
        String sentence = "Anabel";
        System.out.println("The amount of vowels in "+sentence+" is: "+Vowels.countVowels(sentence));

        // Print whether the phrase is a palindrome or not.
        String phrase = "anay";
        System.out.println("Is the phrase "+phrase+" a palindrome?: "+Palindrome.isPalindrome(phrase));

        // Print the count of words in the given sentence.
        String sentenceTwo = "Believe in yourself and all that you are capable of achieving.";
        System.out.println("The amount of Words in \"Believe in yourself and all that you are capable of achieving.\" is: "+Words.countWords(sentenceTwo));
    }
}
