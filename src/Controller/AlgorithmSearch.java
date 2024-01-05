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
public class AlgorithmSearch extends Menu {

    public AlgorithmSearch() {
        super("Select Search", new String[] {
            "Linear Search", "Binary Search", "Exit"
        });
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                doLinearSearch();
                break;
            case 2:
                doBinarySearch();
                break;
        }
    }
    public void doBinarySearch() {
        Scanner sc = new Scanner(System.in);
        int[] searchArray = new Inputter().EnterArr();
        System.out.print("Enter search value: ");
        int value = sc.nextInt();
        int index = binarySearch(searchArray, 0, searchArray.length, value);
        if (index == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println("Found " + value + " at index: " + index);
        
    }
    
    public int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
           
            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }
 
        return -1;
    }
    
    public void doLinearSearch() {
        Scanner sc = new Scanner(System.in);
        int[] searchArray = new Inputter().EnterArr();
        System.out.print("Enter search value: ");
        int value = sc.nextInt();
        int index = linearSearch(searchArray, searchArray.length, value);
        if (index == -1)
            System.out.println(
                "Element is not present in array");
        else
           System.out.println("Found " + value + " at index: " + index);
    }
    
    public int linearSearch (int arr[], int n, int x)
    {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    
}
