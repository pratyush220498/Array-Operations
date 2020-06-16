/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import array.sorting.BubbleSort;
import array.sorting.CountSort;
import array.sorting.HeapSort;
import array.sorting.InsertionSort;
import array.sorting.MergeSort;
import array.sorting.QuickSort;
import array.sorting.SelectionSort;
import array.sorting.ShellSort;
import array.sorting.Traverse;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author pratyush
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char ch;
        do
        {
            System.out.println("Enter size of array :- ");
            int size=Integer.parseInt(br.readLine());
            int[] ar=new int[size];
            System.out.println("Enter elements of array :- ");
            for(int i=0;i<size;i++)
            {
                ar[i]=Integer.parseInt(br.readLine());
            }
            System.out.println("Your options are :- ");
            System.out.println("1.Bubble sort 2.Selection sort 3.Insertion sort :- ");
            System.out.println("4.Quick sort 5.Merge sort 6.Heap sort :-");
            System.out.println("7.Count sort 8.Shell sort :-");
            System.out.println("Please enter your choice :- ");
            int choice=Integer.parseInt(br.readLine());
            switch(choice)
            {
                case 1:
                    BubbleSort.bubbleSort(ar);
                    Traverse.display(ar);
                    break;
                case 2:
                    SelectionSort.selectionSort(ar);
                    Traverse.display(ar);
                    break;
                case 3:
                    InsertionSort.insertionSort(ar);
                    Traverse.display(ar);
                    break;
                case 4:
                    QuickSort.quickSort(ar,0,size-1);
                    Traverse.display(ar);
                    break;
                case 5:
                    MergeSort.mergeSort(ar,0,size-1);
                    Traverse.display(ar);
                    break;
                case 6:
                    HeapSort.heapSort(ar,size);
                    Traverse.display(ar);
                    break;
                case 7:
                    CountSort.sort(ar);
                    Traverse.display(ar);
                    break;
                case 8:
                    ShellSort.shellSort(ar);
                    Traverse.display(ar);
                    break;
                default:
                    System.out.println("You have entered wrong choice");
            }
            System.out.println("Do you want to continue");
            ch=br.readLine().charAt(0);
        }
        while(ch=='y'||ch=='Y');
    }
    
}
