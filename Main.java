public class Main {
  public static void main(String[] args) {
    // Example usage of countOccurrences method
    int[] array = { 2, 2, 3, 3, 4, 4, 4, 8, 8, 8, 8, 8, 9, 9, 10, 12, 15 };
    int target = 2;

    int occurrences = BinarySearchTasks.countOccurrences(array, target);
    System.out.println("Target " + target + " = " + occurrences + " Occurrences");

    // Example usage of findIndex method
    int[] rotatedArray = { 6, 7, 8, 2, 3, 4, 5 };
    int targetIndex = BinarySearchTasks.findIndex(rotatedArray, target);
    System.out.println("Target " + target + " = " + targetIndex);
  }
}
