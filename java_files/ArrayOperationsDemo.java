
import java.util.Scanner;

public class ArrayOperationsDemo {

    // Method to print array elements

    static void printArray(int[] arr) {
        System.out.println("Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }

    // Linear search method

    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // return index if found
            }
        }
        return -1; // return -1 if not found
    }

    // Bubble Sort implementation

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer array input from user
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        printArray(numbers);

        // Searching in array
        System.out.print("Enter a number to search: ");
        int key = sc.nextInt();
        int result = linearSearch(numbers, key);
        if (result != -1) {
            System.out.println(key + " found at index " + result);
        } else {
            System.out.println(key + " not found in the array");
        }
        sc.close();
    }
}