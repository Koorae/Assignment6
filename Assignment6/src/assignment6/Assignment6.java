package assignment6;

import java.lang.Math;

public class Assignment6 {

  // contains checks whether a double in an array of doubles fulfills the condition of (dubs[i] - d)
  // < eps.
  // pre-condition:
  // The input dubs must be an non null array.
  // post-condition:
  // The output will be a boolean value. 
  public static boolean contains(double[] dubs, double eps, double d) {
    for (int i = 0; i < dubs.length; i++) {
      if (Math.abs(dubs[i] - d) < eps) {
        return true;
      }
    }
    return false;
  }

  // fastModExp finds the remainder of x to the power of y
  // pre-conditon:
  // The input y must be a non-negative integer.
  // post-condition:
  // The output must be an integer
  public static int fastModExp(int x, int y, int m) {
    if (y == 0) {
      return 1;
    } else if (y % 2 == 0) {
      int temp = fastModExp(x, (y / 2), m);
      return (temp * temp) % m;
    } else {
      return ((x % m) * (fastModExp(x, y - 1, m))) % m;
    }
  }

  // allPairs creates an array of pairs that has all of the pairs that can be created by the
  // integers in the array.
  public static IntPair[] allPairs(int[] arr) {

    // Throws exception if user enters a null as an array
    if (arr == null) {
      throw new IllegalArgumentException("Array is empty");
    }

    // Initialize an array with n^2 size
    IntPair[] allP = new IntPair[(arr.length * arr.length)];
    int pos = 0;

    // Loop that fills in the positions in the array with the correct pair.
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        allP[pos] = new IntPair(i, j);
        pos++;
      }
    }
    return allP;
  }

  // concatAndReplicateAll creates a single string that compiles all the strings in an string array by n times
  // according to the input, reps.
  public static String concatAndReplicateAll(String[] arr, int reps) {
    
    // If the user enters a null as the array, thrown an exception
    if (arr == null) {
      throw new IllegalArgumentException("Array is empty");
    }
    
    // Initialize an empty string to add the strings into it
    String str = "";
    
    // Loop that appends the strings together
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < reps; j++) {
        str = str + arr[i];
      }
    }
    return str;
  }

  // interleave creates an array with the size of length of arr1 + length of arr2 with the elements interleaving
  // the elements in array1 and array2
  // pre-condition: 
  // the arrays cannot be null
  // post-condition
  // returns an array with the size of size of arr1 + size of arr2
  public static int[] interleave(int[] arr1, int[] arr2) {
    int len1 = arr1.length;
    int len2 = arr2.length;
    
    // Initialize array
    int[] arr3 = new int[(len1 + len2)];
    int pos = 0;
    
    // Interleaves the elements with matching positions
    for (int i = 0; i < Math.min(len1, len2); i++) {
      arr3[pos] = arr1[i];
      pos++;
      arr3[pos] = arr2[i];
      pos++;
    }
    
    // Fills in the rest of the array with the elements in the longer array that are still not entered.
    if (len1 > len2) {
      for (int i = len2; i < len1; i++) {
        arr3[pos] = arr1[i];
        pos++;
      }
    } else {
      for (int i = len1; i < len2; i++) {
        arr3[pos] = arr2[i];
        pos++;
      }
    }
    return arr3;
  }
}
