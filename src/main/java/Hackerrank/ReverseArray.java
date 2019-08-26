package Hackerrank;

public class ReverseArray {
    static int[] reverseArray(int[] a) {
        int[] newArr = new int[a.length];
        for (int i = 0; i < a.length; i++){
            newArr[i] = a[a.length - i - 1];
        }
        return newArr;
    }


}
