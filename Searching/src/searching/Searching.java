package searching;

import binarySearch.searchBinary;
import interpolationsearch.SearchInterpolation;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import linearSearch.searchLinearly;

public class Searching {

    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array :- ");
        int size=Integer.parseInt(br.readLine());
        System.out.println("Enter elements in array :- ");
        
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter element to search :- ");
        int item=Integer.parseInt(br.readLine());
        System.out.println("enter your choice.");
        System.out.println("1.linear search 2.binary search 3.interpolation search");
        int option=Integer.parseInt(br.readLine());
        switch(option)
        {
            case 1:
                searchLinearly.search(arr, item);
                break;
            case 2:
                searchBinary.search(arr, item);
                break;
            case 3:
                SearchInterpolation.search(arr, item);
                break;
            default:
                System.out.println("you have entered wrong choice");
        }
            
    }
   
}
