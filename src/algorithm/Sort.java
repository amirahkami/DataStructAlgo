package algorithm;

public class Sort
{
    /**
     * This method sort the given array based on bubble sort algorithm
     * Time Complexity: [BestCase: ,Average: ,WorstCase: ]
     * Space Complexity:
     *
     * @param arr The array to sort.
     * @return arr The sorted array.
     */
    public static int[] bubble(int[] arr)
    {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    /**
     * This method sort the given array based on selection sort algorithm
     * Time Complexity: [BestCase: ,Average: ,WorstCase: ]
     * Space Complexity:
     *
     * @param arr The array to sort.
     * @return arr The sorted array.
     */
    public static int[] selection(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++) {
            int idx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }

            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    /**
     * This method sort the given array based on insertion sort algorithm
     * Time Complexity: [BestCase: ,Average: ,WorstCase: ]
     * Space Complexity:
     *
     * @param arr The array to sort.
     * @return arr The sorted array.
     */
    public static int[] insertion(int[] arr)
    {
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;

            while ((i >= 0) && (arr[key] > key)) {
                arr[i + 1] = arr[i];
                i--;
            }

            arr[i + 1] = key;
        }

        return arr;
    }
}
