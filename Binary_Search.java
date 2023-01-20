import java.util.ArrayList;

public class Binary_Search {

    // Set variable for Binary Search Logic
    int array[];
    int target;
    ArrayList value_Searching_History = new ArrayList<>();

    public void setTarget(int target) {
        this.target = target;
    }


    public void setArray(int[] array) {
        this.array = array;
    }

    public int compute_Binary_Search() {
        int low = 0;
        int high = array.length - 1;

        // Loop through operation as long as base condition is met
        while (low <= high) {
            int middle = low + (high - low) / 2;
            int value = array[middle];
            value_Searching_History.add(value);

            if (value < target) low = middle + 1;
            else if (value > target) high = middle - 1;
            else return middle; // Target found
        }
        return -1; // Target not found
    }

    public void getArray() {
        for (int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    // Interpolation Search is improvement over binary search, best used for "uniformly" distributed data
    public int compute_Interpolation_Search() {
        int low = 0;
        int high = array.length - 1;

        // Loop through operation as long as base condition is met and target value is inside range specified
        while (target >= array[low] && target <= array[high] && low <= high) {
            // Specific logic to calculate "probe" value which works as like mid-index of binary search but closer value to target value with high probability)
            int probe = low + (high - low) * (target - array[low]) / (array[high] - array[low]);
            System.out.println("probe: " + probe);

            if (array[probe] == target) return probe;
            else if (array[probe] < target) low = probe + 1;
            else high = probe - 1;
        }
        return -1;
    }


    public void getValue_Searching_History() {
        for (int i = 0; i < value_Searching_History.size(); i++) {
            System.out.print(value_Searching_History.get(i) + " → ");
        }
        System.out.print("Finally Target value is found!");
    }
}
