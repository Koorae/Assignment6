package assignment6;

public class Ass6Test {
public static void main(String[] args) {
  System.out.println(Assignment6.contains(new double[] {5.5, 2.5, 3, 6.1}, 2, 8));
  System.out.println(Assignment6.fastModExp(3, 7, 3));
  System.out.println(Assignment6.fastModExp(3, 6, 3));
  IntPair[] array = Assignment6.allPairs(new int[] {1, 2, 3});
  for (int i = 0; i < 9; i++) {
    System.out.println(array[i].getFst() + ", " + array[i].getSnd());
  }
  System.out.println(Assignment6.concatAndReplicateAll(new String[] {"hello", "world", "!"}, 3));
  int[] array2 = Assignment6.interleave(new int[] {0, 1, 2, 9, 2, 3}, new int[] {3, 4, 5});
  for (int i = 0; i < array2.length; i++) {
    System.out.print(array2[i]);
  }
}
}
