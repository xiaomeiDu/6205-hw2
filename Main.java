public class Main {
  public static void main(String[] args) {
    // Example usage of countOccurrences method
    int[] array = { 2, 2, 3, 3, 4, 4, 4, 8, 8, 8, 8, 8, 9, 9, 10, 12, 15 };
    int target = 2;

    int occurrences = BinarySearchTasks.countOccurrences(array, target);
    System.out.println("Target " + target + " = " + occurrences + " Occurrences");
  }
}
