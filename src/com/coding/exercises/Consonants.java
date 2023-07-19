package com.coding.exercises;

public class Consonants {
    public static int countConsonants (String sentence){
        if(sentence.length() == 0) return 0;
        String vowels = "aeiou";
        int countConsonants = 0;
        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch) && vowels.indexOf(ch) == -1) {
                countConsonants++;
            }
        }
        return countConsonants;
    }

    public static String replaceConsonants (String sentence){
        String vowels = "aeiou";
        char[] chars = sentence.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i]) && vowels.indexOf(chars[i]) == -1) {
                chars[i] = '*';
            }
        }
        return new String(chars);
    }
}
