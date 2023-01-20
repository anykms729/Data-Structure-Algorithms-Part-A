public class Sorting_Algorithms {

    int array[];

    public Sorting_Algorithms() {
    }

    // Constructor
    public Sorting_Algorithms(int[] array) {
        this.array = array;
    }

    public void compute_Bubble_Sort() {
        System.out.print("Array before sorted by Bubble Sort: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // Bubble sort Logic
        for (int i = 0; i < array.length - 1; i++) {
            // As fist element of the array is selected as "Temp" value, it can be compared rest of elements following
            for (int j = 0; j < array.length - i - 1; j++) {
                // Compare two adjacent values
                if (array[j] > array[j + 1]) {
                    // Process to swap adjacent value if value of preceded index is greater than following value
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Array sorted using Bubble sort algorithm
        System.out.print("Array after sorted by Bubble Sort: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public void compute_Selection_Sort() {
        System.out.print("Array before sorted by Selection Sort: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // Selection sort Logic
        for (int i = 0; i < array.length - 1; i++) {
            // At the beginning, first element of the array is set as temporal minimum value before loop through each element
            int min = i;
            // Loop through each element of the array to find element which is smaller than minimum value
            for (int j = i + 1; j < array.length; j++) {
                // If element is found which is smaller than minimum value, it's set as new minimum value
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            // Store value to temporal place because it has bigger value than minimum value but located prior to the index which has minimum value
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        // Array sorted using Selection sort algorithm
        System.out.print("Array after sorted by Selection Sort: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println("");
    }

    public void compute_Insertion_Sort() {
        System.out.print("Array before sorted by Insertion Sort: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // Insertion sort Logic
        for (int i = 1; i < array.length; i++) {
            // Element at index 1 is selected at the beginning
            int temp = array[i];
            // Declare variable j to compare it as left value (if it's larger than selected value, it will be moved on the right side)
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                // If index value on the left side is bigger than value of its following index, it's moved to right side
                array[j + 1] = array[j];
                // Decrease value "j" to check if any precedent index has value bigger than value which is stored in temporal place to be inserted in the array in an order
                j--;
            }
            array[j + 1] = temp;
        }

        // Array sorted using Insertion sort algorithm
        System.out.print("Array after sorted by Insertion Sort: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println("");
    }

    public void compute_Merge_Sort(int[] array) {

        // Merge sort Logic
        int length = array.length;
        // Base case: as merge sort basically divides array into 2 parts
        if (length <= 1) return;

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        // Declare variables which are used both for right & left side arrays
        int leftIndex = 0;
        int rightIndex = 0;

        // Divide array into left(side) Array & right(side) Array to sort values
        // Half of Array elements are inserted into left array and rest of Array elements are inserted into right Array
        for (; leftIndex < length; leftIndex++) {
            if (leftIndex < middle) {
                leftArray[leftIndex] = array[leftIndex];
            } else {
                rightArray[rightIndex] = array[leftIndex];
                rightIndex++;
            }
        }

        // Use recursion to sort array elements by dividing into Left Array & Right Array
        compute_Merge_Sort(leftArray);
        compute_Merge_Sort(rightArray);
        and_Then_Merge(leftArray, rightArray, array);
    }

    private void and_Then_Merge(int[] leftArray, int[] rightArray, int[] array) {
        // The function is to merge sorted arrays in a separate way using Merge sort method()
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        // Declare Indices
        int i = 0, leftIndex = 0, rightIndex = 0;

        // Check the condition for merging
        // Check if the value of left(side) Array index is bigger than value of right(side) Array
        // Value of left side array should always smaller than right side array
        while (leftIndex < leftSize && rightIndex < rightSize) {
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                array[i] = leftArray[leftIndex];
                i++;
                leftIndex++;
            } else {
                array[i] = rightArray[rightIndex];
                i++;
                rightIndex++;
            }
        }

        while (leftIndex < leftSize) {
            array[i] = leftArray[leftIndex];
            i++;
            leftIndex++;
        }

        while (rightIndex < rightSize) {
            array[i] = rightArray[rightIndex];
            i++;
            rightIndex++;
        }
    }

    public void compute_Quick_Sort(int[] array, int start, int end) {
        // Base case
        if (end <= start) return;

        // Partition method will pick the pivot value in the array passed
        int pivot = partition_for_QuickSort(array, start, end);
        // Recursion used for all values which are placed on the left side of the pivot (pivot is excluded)
        compute_Quick_Sort(array, start, pivot - 1);
        // Recursion used for all values which are placed on the right side of the pivot (pivot is excluded)
        compute_Quick_Sort(array, pivot + 1, end);
    }

    private int partition_for_QuickSort(int[] array, int start, int end) {
        int pivot = array[end];
        int i= start-1;

        // Process for all elements that are less than the pivot on the left side
        // Process for all elements that are larger than the pivot on the right side
        for (int j=start;j<end-1;j++){
            if (array[j]<pivot){
                i++;
                int temp = array[j];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Once variable "j" which starts from the first index of the array reaches pivot value, Insert the pivot into its final resting place with another basic variable swap
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}



