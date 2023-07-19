package com.coding.exercises;
public class Palindrome {
    public static boolean isPalindrome(String phrase){
        StringBuilder sBuilder = new StringBuilder(phrase.toLowerCase());
        return (sBuilder.reverse().toString().equals(phrase.toLowerCase()));
    }
}
