package array_programing_questions;

import java.util.Scanner;

public class find_average_at_even_position_in_array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int arr[] = new int[size];

        // Get the elements for the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Calculate the sum of elements at even positions
        int sum = 0;
        int count = 0;
        for (int i = 0; i < size; i += 2) {
            sum += arr[i];
            count++;
        }

        // Calculate the average
        double average = (double) sum / count;

        // Display the average
        System.out.println("Average of elements at even positions: " + average);

        scanner.close();
    }
}

