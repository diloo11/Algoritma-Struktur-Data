package Jobsheet7;

public class SortMain {
    public static void main(String[] args) {
        int[] data = {10, 40, 30, 50, 70, 20, 100, 90};
        MergeSort mergeSort = new MergeSort();

        System.out.println("Sorting with merge sort");
        System.out.println("Initial Data");
        mergeSort.printArray(data);

        mergeSort.mergeSort(data);
        System.out.println("Sorted Data");
        mergeSort.printArray(data);
    }
}
