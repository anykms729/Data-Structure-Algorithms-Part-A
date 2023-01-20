public class Code_Implementation {
    public static void main(String[] args) {
        Code_Implementation code_implementation = new Code_Implementation();

        code_implementation.linear_Search(200, 50);
        code_implementation.binary_Search();
        code_implementation.interpolation_Search();
        code_implementation.bubble_Sort();
        code_implementation.selection_Sort();
        code_implementation.insertion_Sort();
        code_implementation.merge_Sort();
        code_implementation.quick_Sort();
    }

    public void linear_Search(int array_Length, int target) {
        boolean is_found;
        int value = 0;
        int array_LinearSearch[] = new int[array_Length];

        // Set Array for Linear Search Algorithm
        for (int i = 0; i < array_Length; i++) {
            array_LinearSearch[i] = value;
            value = value + 2;
        }

        // Loop through the array to find target value
        for (int i = 0; i < array_Length; i++) {
            if (array_LinearSearch[i] == target) {
                System.out.println("Target value is found at index: " + i);
                System.exit(0);
            }
        }
        System.out.println("Target value is not found");
    }


    public void binary_Search() {
        Binary_Search binary_search = new Binary_Search();

        // Declare Array to be put as a parameter in setter method() of the class "Binary_Search"
        int[] array_BinarySearch = new int[10000];

        // Set array using object of the class "Binary_Search"
        binary_search.setArray(array_BinarySearch);

        // Set target which user is searching for using object of the class "Binary_Search"
        binary_search.setTarget(9999);

        // To calculate time taken to implement Binary Search operation
        long startTime = System.nanoTime();

        // It will return either -1(if target value is not found) or index at which target value is found
        int value = binary_search.compute_Binary_Search();

        if (value != -1) {
            System.out.println("Element found at index " + value);
            long endTime = System.nanoTime();
            long elapsedTime = endTime - startTime;
            System.out.println("Time taken to find element is " + elapsedTime + " nanosecond");
            System.out.print("Array objects are cut by half as following: ");
            binary_search.getValue_Searching_History();
        } else System.out.println("Element not found");
    }

    public void interpolation_Search() {
        // Declare Object to use fields & functions the class "Binary_Search"
        // Interpolation Search Algorithm is type of Binary Search with improved functionality so same class "Binary_Search" is used to use its methods
        int first_value = 1;
        Binary_Search binary_search = new Binary_Search();

        // Declare Array to be put as a parameter in setter method() of the class "Binary_Search"
        int[] array_interpolationSearch = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        // Set target which user is searching for using object of the class "Binary_Search"
        binary_search.setTarget(256);
        binary_search.setArray(array_interpolationSearch);

        // To calculate time taken to implement Binary Search operation
        long startTime = System.nanoTime();

        // It will return either -1(if target value is not found) or index at which target value is found
        int value = binary_search.compute_Interpolation_Search();

        if (value != -1) {
            System.out.println("Element found at index " + value);
            long endTime = System.nanoTime();
            long elapsedTime = endTime - startTime;
            System.out.println("Time taken to find element is " + elapsedTime + " nanosecond");
        } else System.out.println("Element not found");
    }

    public void bubble_Sort() {
        int[] array_bubbleSort = {7, 4, 2, 6, 1, 90, 456, 34, 53};
        Sorting_Algorithms sorting_algorithms = new Sorting_Algorithms(array_bubbleSort);

        // To calculate operation time for Bubble sort algorithm
        long startTime = System.nanoTime();
        sorting_algorithms.compute_Bubble_Sort();

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Time taken to find element is " + elapsedTime + " nanosecond");
    }

    public void selection_Sort() {
        int[] array_selectionSort = {125, 99, 3, 7, 10, 78, 24, 55};
        Sorting_Algorithms sorting_algorithms = new Sorting_Algorithms(array_selectionSort);

        // To calculate operation time for Selection sort algorithm
        long startTime = System.nanoTime();
        sorting_algorithms.compute_Selection_Sort();

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Time taken to find element is " + elapsedTime + " nanosecond");
    }

    public void insertion_Sort() {
        int[] array_insertionSort = {125, 99, 3, 7, 10, 78, 24, 55};
        Sorting_Algorithms sorting_algorithms = new Sorting_Algorithms(array_insertionSort);

        // To calculate operation time for Insertion sort algorithm
        long startTime = System.nanoTime();
        sorting_algorithms.compute_Insertion_Sort();

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Time taken to find element is " + elapsedTime + " nanosecond");
    }

    public void merge_Sort() {
        int[] array_mergeSort = {125, 99, 3, 7, 78, 10, 24, 55};
        Sorting_Algorithms sorting_algorithms = new Sorting_Algorithms();

        System.out.print("Array before sorted by Merge Sort: ");
        for (int element : array_mergeSort) {
            System.out.print(element + " ");
        }
        System.out.println("");

        // To calculate operation time for Merge sort algorithm
        long startTime = System.nanoTime();
        sorting_algorithms.compute_Merge_Sort(array_mergeSort);


        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        // Array sorted using Merge sort algorithm
        System.out.print("Array after sorted by Merge Sort: ");
        for (int element : array_mergeSort) {
            System.out.print(element + " ");
        }
        System.out.println("");

        System.out.println("Time taken to find element is " + elapsedTime + " nanosecond");
    }

    public void quick_Sort() {
        int[] array_quickSort = {125, 99, 3, 7, 78, 10, 24, 55};
        Sorting_Algorithms sorting_algorithms = new Sorting_Algorithms();

        System.out.print("Array before sorted by Quick Sort: ");
        for (int element : array_quickSort) {
            System.out.print(element + " ");
        }
        System.out.println("");

        // To calculate operation time for Quick sort algorithm
        long startTime = System.nanoTime();
        sorting_algorithms.compute_Merge_Sort(array_quickSort);


        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        // Array sorted using Merge sort algorithm
        System.out.print("Array after sorted by Quick Sort: ");
        for (int element : array_quickSort) {
            System.out.print(element + " ");
        }
        System.out.println("");
        System.out.println("Time taken to find element is " + elapsedTime + " nanosecond");
    }
}
