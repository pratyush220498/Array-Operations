/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.sorting;

/**
 *
 * @author pratyush
 */
public class HeapSort {

public static void heapSort(int[] ar,int size)
{
    int heapSize=size-1;
    buildHeap(ar,heapSize);
    while(heapSize>=1)
    {
        swap(ar,0,heapSize);
        heapSize--;
        heapify(ar,0,heapSize);
    }
}
public static void buildHeap(int[] ar,int heapSize)
{
    for(int i=ar.length/2-1;i>=0;i--)
    {
        heapify(ar,i,heapSize);
    }
}
public static void heapify(int[] ar,int i,int heapSize)
{
    int l=2*i+1;
    int r=2*i+2;
    int max=i;
    if(ar[max]<ar[l]&&l<=heapSize)
        max=l;
    if(ar[max]<ar[r]&&r<=heapSize)
        max=r;
    if(max!=i)
    {
        swap(ar,max,i);
        heapify(ar,max,heapSize);
    }
}
    public static void swap(int[] ar,int i,int j)
    {
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
}
