public class App {
    public static void main(String[] args) throws Exception {
        // Print the sentence along with the count of vowels in it.
        String sentence = "Anabel";
        System.out.println("The amount of vowels in "+sentence+" is: "+Vowels.countVowels(sentence));

        System.out.println("-----------------------------------------");

        // Print whether the phrase is a palindrome or not.
        String phrase = "anay";
        System.out.println("Is the phrase "+phrase+" a palindrome?: "+Palindrome.isPalindrome(phrase));

        System.out.println("-----------------------------------------");

        // Print the count of words in the given sentence.
        String sentenceTwo = "Believe in yourself and all that you are capable of achieving.";
        System.out.println("The amount of Words in \""+sentenceTwo+"\" is: "+Words.countWords(sentenceTwo));

        System.out.println("-----------------------------------------");

        String sentenceThree = "Keep going, even when it gets tough.";
        // Print the count of consonants in the given sentence.
        System.out.println("The amount of consonants in \""+sentenceThree+"\" is: "+Consonants.countConsonants(sentenceThree));
        // Print the new sentence with replaced consonants.
        System.out.println("The new sentence is: "+Consonants.replaceConsonants(sentenceThree));
    }
}
