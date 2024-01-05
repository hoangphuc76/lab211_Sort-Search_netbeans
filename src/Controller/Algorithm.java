/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Menu;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Algorithm extends Menu {

    public Algorithm() {
        super("Select Algorithm", new String[]{
            "Sort", "Search", "Both", "Exit"
        });
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                new AlgorithmSort().run();
                break;
            case 2:
                new AlgorithmSearch().run();
                break;
            case 3:
                doBoth();
                break;
            default:
                System.out.println("Thank you!");
        }
    }

    public void doBoth() {
        Scanner sc = new Scanner(System.in);
        int[] unsortedArr = new Inputter().EnterArr();
        System.out.print("Enter value: ");
        int value = sc.nextInt();
        System.out.print("Unsorted Array: ");
        for (int i = 0; i < unsortedArr.length; i++) {
            System.out.print(unsortedArr[i] + " ");
        }
        System.out.println("");
        int[] sortedArr = new AlgorithmSort().bubbleSort(unsortedArr);
        System.out.print("Sorted Array: ");
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println("");
        int index = new AlgorithmSearch().binarySearch(sortedArr, 0, sortedArr.length, value);
        if (index == -1) {
            System.out.println(
                    "Element is not present in array");
        } else {
            System.out.println("Found " + value + " at index: " + index);
        }
    }
}
