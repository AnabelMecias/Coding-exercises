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

        System.out.println("-----------------------------------------");

        String sentenceFour = "This is used for any tool and technology";
        // Print the count of words that end with 's'
        System.out.println("The amount of words that ends with 's' is: "+ LastLetterCount.countEndsWithS(sentenceFour));
        // Print the count of words that end with 'y'
        System.out.println("The amount of words that ends with 'y' is: "+ LastLetterCount.countEndsWithY(sentenceFour));
        // Switch the first word that ends with 's' with the first word that ends with 'y' and print the result
        System.out.println("The switch is: "+ LastLetterCount.switchFirstWordSforY(sentenceFour));

        System.out.println("-----------------------------------------");

        String sentenceFive = "Apple";
        // Rotate the string by a number of places characters to the right
        System.out.println("The roteted string is: "+RotateString.rotateString(2, sentenceFive));

        System.out.println("-----------------------------------------");

        
    }
}
