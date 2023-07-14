public class Vowels {
    public static int countVowels(String sentence)
    {
        int countVowels = 0;
        if (sentence.length() == 0) {
            return countVowels;
        }
        String vowels = "aeiou";
        sentence = sentence.toLowerCase();
        for (Character character : sentence.toCharArray()) {
            if(vowels.indexOf(character) != -1){
                countVowels++;
            }
        }
        return countVowels;
    }

}
