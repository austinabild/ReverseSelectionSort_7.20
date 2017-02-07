/*
 * Name: 
 * Name:            Austin Abild
 * Project:         Reverse Array (ch. 7.20)
 * 
 * Date Started: 
 * Date Modified:
 * 
 */
package reverseselectionsort;

import java.util.Scanner;

public class ReverseSelectionSort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter ten numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("The sorted numbers are:");

        selectionSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void selectionSort(int[] list) {
        for (int i = list.length - 1; i > 0; i--) {
            // Find the max in the list[list.length...1]
            int currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = 0; j < i; j++) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            // Swap list[i] with list[currentMaxIndex] if necessary
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }

}
