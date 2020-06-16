package array.sorting;

public class QuickSort {

    public static void quickSort(int[] ar,int f,int l)
    {
        if(f<l)
        {
            int pos=partition(ar,f,l);
            quickSort(ar,f,pos-1);
            quickSort(ar,pos+1,l);
        }
    }
    public static int partition(int[] ar,int f,int l)
    {
        int pivot=ar[l];
        int i=f;
        int j=i-1;
        while(i<l)
        {
            if(ar[i]<pivot)
            {
                swap(ar,++j,i);
            }
            i++;
        }
        swap(ar,++j,l);
        return j;
    }
    public static void swap(int[] ar,int i,int j)
    {
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
}
