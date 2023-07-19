package com.coding.exercises;
import java.util.HashMap;

public class Occurrences {
    public static HashMap<Integer, Integer> occurrences (int[] numbs) {
        HashMap<Integer, Integer> frecuency = new HashMap<>();
        for (int i : numbs) {
            if (frecuency.containsKey(i)) {
                frecuency.replace(i, frecuency.get(i)+1);
            }else{
                frecuency.put(i, 1);
            }
        }
        return frecuency;
    }
}
