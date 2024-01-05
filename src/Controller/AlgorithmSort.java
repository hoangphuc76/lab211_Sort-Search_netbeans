/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Menu;

/**
 *
 * @author LENOVO
 */
public class AlgorithmSort extends Menu {

    public AlgorithmSort() {
        super("Select Sort", new String[] {
            "Bubble Sort", "Quick Sort"
        });
    }

    

   

    @Override
    public void execute(int choice) {
        switch(choice) {
            case 1:
                doBubbleSort();
                break;
            case 2:
                doQuickSort();
                break;
        }
    }
    
    public void doBubbleSort() {
        int[] unsortedArr = new Inputter().EnterArr();
        System.out.print("Unsorted Array: ");
        for (int i = 0; i < unsortedArr.length; i++) {
            System.out.print(unsortedArr[i] + " ");
        }
        System.out.println("");
        int[] sortedArr = bubbleSort(unsortedArr);       
        System.out.print("Sorted Array: ");
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println("");   
    }
    
    public int[] bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                }
        return arr;
    } 
    
    public void doQuickSort() {
        int[] unsortedArr = new Inputter().EnterArr();
        System.out.print("Unsorted Array: ");
        for (int i = 0; i < unsortedArr.length; i++) {
            System.out.print(unsortedArr[i] + " ");
        }
        System.out.println("");
        int[] sortedArr = quickSort(unsortedArr,0,unsortedArr.length -1);     
        System.out.print("Sorted Array: ");
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println("");   
    }
    
    public int[] quickSort(int arr[],int low,int high){
        if(low < high){
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
        return arr;
    }
    
    public int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];    
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}
