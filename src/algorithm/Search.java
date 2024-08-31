package algorithm;

public class Search
{
    /**
     * This method performs a linear search on given array.
     *
     * @param arr    The array in which to search for the target element.
     * @param target The element to search for.
     * @return The index of the target element if found, otherwise -1.
     */
    public static int linear(int[] arr, int target)
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    /**
     * This method performs a binary search on given array.
     *
     * @param arr    The array in which to search for the target element.
     * @param target The element to search for.
     * @return The index of the target element if found, otherwise -1.
     */
    public static int binary(int[] arr, int target)
    {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
