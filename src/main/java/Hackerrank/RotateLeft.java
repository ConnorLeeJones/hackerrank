//package Hackerrank;
//
//import java.util.Scanner;
//
//public class RotateLeft {
//
//    static int[] rotLeft(int[] a, int d) {
//        int[] arr = new int[a.length];
//
//        for (int i = 0; i < a.length; i++) {
//            arr[i] = a[(i + (d % a.length)) % a.length];
//        }
//        return arr;
//    }
//
//
//    public class Solution {
//        private static final Scanner scanner = new Scanner(System.in);
//
//        public static void main(String[] args) {
//            String[] nd = scanner.nextLine().split(" ");
//
//            int n = Integer.parseInt(nd[0]);
//
//            int d = Integer.parseInt(nd[1]);
//
//            int[] a = new int[n];
//
//            String[] aItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int i = 0; i < n; i++) {
//                int aItem = Integer.parseInt(aItems[i]);
//                a[i] = aItem;
//            }
//
//            scanner.close();
//
//            int[] arr = new int[a.length];
//            for (int i = 0; i < a.length; i++) {
//                arr[i] = a[(i + (d % a.length)) % a.length];
//            }
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[j] + " ");
//            }
//        }
//    }
//}
//
