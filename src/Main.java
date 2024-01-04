import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void printEvery3() {
        int i = 1;
        while (i <= 88) {
            System.out.println(i);
            i += 3;
        }
    }

    public static void ninetable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int m = i * j;
                System.out.println(i + " x " + j + " = " + m);
            }
        }
    }

    public static int findMax(int[] arr) {
        int i = 1;
        int max = arr[0];
        while (i < arr.length) {
            if (max < arr[i]) {
                max = arr[i];
            }
            i++;
        }
        return max;
    }

    public static int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            result[i] = arr[length - 1 - i];
        }
        return result;
    }

    public static int addUpTo(int n) {
        int count = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        return count;
    }

    public static void position(String string) {
        String re = "";
        String allUpperCase = string.toUpperCase();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == allUpperCase.charAt(i)) {
                re = string.charAt(i) + " " + i;
                break;
            } else {
                re = "-1";
            }
        }
        System.out.println(re);
    }

    public static boolean confirmEnding(String a, String b) {
        int length = b.length();
        int diff = a.length() - length;
        String ending = a.substring(diff);

        return ending.equals(b);
    }

    public static boolean findDuplicate(int[] array) {
        // Use a Set to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();

        // Iterate through the array
        for (int element : array) {
            // If the element is already in the set, it's a duplicate
            if (!uniqueElements.add(element)) {
                return true; // Duplicate found
            }
        }

        return false; // No duplicate found
    }
    public static void pyramid(int n) {
        String stars="";
        for (int i = 0; i < n; i++) {
            stars += "*";
        }
        for (int i = 0; i < stars.length(); i++) {
            System.out.println(stars.substring(0,i+1));
        }

    }

    public static void main(String[] args) {
        // printEvery3();
        // ninetable();
//        int[] array = {4, 3, 6, 7, 9, 10, 33, 0, -4, 12, 400, 133, 324, 1234231, 12334};
//        int[] reversedArray = reverseArray(array);
//        for (int i : reversedArray) {
//            System.out.println(i);
//        }
//        System.out.println(addUpTo(10));
//        System.out.println(addUpTo(100));
//        System.out.println(addUpTo(1000));
//        System.out.println(addUpTo(10000));
//        position("abcd"); // prints -1
//        position("AbcD"); // prints A 0
//        position("abCD"); // prints C 2
//        System.out.println(findMax(array));
//        System.out.println(confirmEnding("Bastian", "n"));
//        System.out.println(confirmEnding("Connor", "n"));
//        System.out.println(confirmEnding("Open sesame", "same"));
//        int[] array1 = {1, 3, 5, 7, 9, 3};
//        int[] array2 = {};
//        int[] array3 = {3, 4, 5, 6, 7, 10000, 0};
//
//        System.out.println("Array 1 has duplicate: " + findDuplicate(array1));
//        System.out.println("Array 2 has duplicate: " + findDuplicate(array2));
//        System.out.println("Array 3 has duplicate: " + findDuplicate(array3));
        pyramid(1);
        System.out.println("====================");
        pyramid(3);
        System.out.println("====================");
        pyramid(5);
    }
}