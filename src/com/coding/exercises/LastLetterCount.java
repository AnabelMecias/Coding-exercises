package com.coding.exercises;
public class LastLetterCount {
    public static int countEndsWithS(String sentence) {
        int countEndsWithS = 0;
        for (String word : sentence.split(" ")) {
            if (word.endsWith("s")) {
                countEndsWithS++;
            }
        }
        return countEndsWithS;
    }

    public static int countEndsWithY(String sentence) {
        int countEndsWithY = 0;
        for (String word : sentence.split(" ")) {
            if (word.endsWith("y")) {
                countEndsWithY++;
            }
        }
        return countEndsWithY;
    }

    public static String switchFirstWordSforY(String sentence) {
        String[] words = sentence.split(" ");
        int posFirstWithS = -1;
        int posFirstWithY = -1;
        for (int i = 0; i < words.length && posFirstWithS == -1 || posFirstWithY == -1; i++) {
            if (posFirstWithS == -1 && words[i].endsWith("s")) {
                    posFirstWithS = i;
            }
            if (posFirstWithY == -1 && words[i].endsWith("y")) {
                    posFirstWithY = i;
            }
        }
        if (posFirstWithS != -1 && posFirstWithY != -1) {
            String temp = words[posFirstWithS];
            words[posFirstWithS] = words[posFirstWithY];
            words[posFirstWithY] = temp;
        }
        return String.join(" ", words);
    }
}
