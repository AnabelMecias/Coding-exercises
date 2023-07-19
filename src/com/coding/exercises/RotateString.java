package com.coding.exercises;
public class RotateString {
    public static String rotateString (int numberOfPlaces, String sentence) {
        String finalPart = sentence.substring(0, numberOfPlaces);
        String firstPart = sentence.substring(numberOfPlaces, sentence.length());
        return firstPart+finalPart;
    }
}
