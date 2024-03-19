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
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (nums[mid] == target) {
        return mid;
      }

      // Check if the left half is sorted
      if (nums[left] <= nums[mid]) {
        // Check if the target is within the left half
        if (nums[left] <= target && target < nums[mid]) {
          right = mid - 1; // Search in the left half
        } else {
          left = mid + 1; // Search in the right half
        }
      } else { // Right half is sorted
        // Check if the target is within the right half
        if (nums[mid] < target && target <= nums[right]) {
          left = mid + 1; // Search in the right half
        } else {
          right = mid - 1; // Search in the left half
        }
      }
    }

    return -1; // Target not found
  }
}
