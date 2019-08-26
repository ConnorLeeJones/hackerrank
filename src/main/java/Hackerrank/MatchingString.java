package Hackerrank;

import javafx.util.Pair;

public class MatchingString {
    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] results = new int[queries.length];
        for (int i = 0; i < queries.length; i++){
            int count = 0;
            for (String str : strings){
                if (str.equals(queries[i])){
                    count++;
                }
            }
            results[i] = count;
        }
        return results;
    }
}
