public class BinarySearchTasks {
  public static int countOccurrences(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    int firstOccurrence = findFirstOccurrence(nums, target);

    if (firstOccurrence == -1) {
      return 0; // If target doesn't exist in nums
    }

    int lastOccurrence = findLastOccurrence(nums, target);

    return lastOccurrence - firstOccurrence + 1;
  }

  private static int findFirstOccurrence(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    int firstOccurrence = -1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (nums[mid] >= target) {
        right = mid - 1;
        if (nums[mid] == target) {
          firstOccurrence = mid;
        }
      } else {
        left = mid + 1;
      }
    }

    return firstOccurrence;
  }

  private static int findLastOccurrence(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    int lastOccurrence = -1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (nums[mid] <= target) {
        left = mid + 1;
        if (nums[mid] == target) {
          lastOccurrence = mid;
        }
      } else {
        right = mid - 1;
      }
    }

    return lastOccurrence;
  }

  public static int findIndex(int[] nums, int target) {
    // Implementation of findIndex method
    // ...
    return -1; // Placeholder
  }
}
