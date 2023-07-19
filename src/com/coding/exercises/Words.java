package com.coding.exercises;
public class Words {
    public static int countWords(String sentence){
        int amountWords = sentence.split(" ").length;
        return amountWords;
    }
}
