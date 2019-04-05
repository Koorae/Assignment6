package assignment6;

import java.lang.Math;

public class Assignment6 {

  public static boolean contains(double[] dubs, double eps, double d) {
    for (int i = 0; i < dubs.length; i++) {
      if (Math.abs(dubs[i] - d) < eps) {
        return true;
      }
    }
    return false;
  }

  public static int fastModExp(int x, int y, int m) {
    if (y == 0) {
      return 1;
    } else if (y % 2 == 0) {
      int temp = fastModExp(x, (y / 2), m);
      return (temp * temp) % m;
    } else {
      return ((x % m) * (fastModExp(x, y-1, m))) % m;
    }
  }


  public static IntPair[] allPairs(int[] arr) {
    if (arr == null) {
      throw new IllegalArgumentException ("Array is empty");
    }
    IntPair[] allP = new IntPair[(arr.length * arr.length)];
    int pos = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        allP[pos] = new IntPair(i, j);
        pos++;
      }
    }
    return allP;
  }

  public static String concatAndReplicateAll(String[] arr, int reps) {
    if (arr == null) {
      throw new IllegalArgumentException ("Array is empty");
    }
    String str = "";
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < reps; j++) {
        str = str + arr[i];
      }
    }
    return str;
  }

  public static int[] interleave(int[] arr1, int[] arr2) {
    int len1 = arr1.length;
    int len2 = arr2.length;
    int[] arr3 = new int[(len1 + len2)];
    int pos = 0;
    for (int i = 0; i < Math.min(len1, len2); i++) {
      arr3[pos] = arr1[i];
      pos++;
      arr3[pos] = arr2[i];
      pos++;
    }
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
