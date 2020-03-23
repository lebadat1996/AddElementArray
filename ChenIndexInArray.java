package ChenPhanTuVaoArray;

import java.util.Scanner;

public class ChenIndexInArray {
    public static int[] inputArray(int n, Scanner scanner) {
        int[] arr = new int[n];
        if (n < 1) {
            System.out.print("enter lai !!");
        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("arr[" + i + "] ");
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        return arr;
    }

    public static void addElementByIndex(int[] arrNumbers, int index, int value) {
        if (index >= 0 && index < arrNumbers.length) {
            int step = arrNumbers[index];
            arrNumbers[index] = value;
            for (int i = index; i < arrNumbers.length - 1; i++) {
                int step1 = arrNumbers[i + 1];
                arrNumbers[i + 1] = step;
                step = step1;
            }
        } else {
            System.out.println("invalid input !!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        arr = inputArray(n, scanner);
        System.out.print("\nEnter number can add: ");
        int number = scanner.nextInt();
        System.out.print("Enter index can add: ");
        int k = scanner.nextInt();
        addElementByIndex(arr, k, number);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
