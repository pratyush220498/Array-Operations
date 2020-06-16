package binarySearch;

public class searchBinary {

    public static void search(int[] arr,int item)
    {
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            temp=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<temp)
                {
                    int flag=arr[j];
                    arr[j]=temp;
                    temp=flag;
                }
            }
            arr[i]=temp;
        }
        for(int i : arr)
            System.out.print(i+" ");
        System.out.println();
        int pos=bs(arr,item,0,arr.length-1);
        if(pos==-1)
            System.out.println("item not found");
        else
            System.out.println("item found at pos "+(pos));
    }

    public static int bs(int[] arr,int item,int f,int l)
    {
        if(f<=l)
        {
            int mid=(f+l)/2;
            if(arr[mid]==item)
                return mid;
            else if(arr[mid]>item)
                return bs(arr,item,f,mid-1);
            else
                return bs(arr,item,mid+1,l);
        }
        else
            return -1;
    }
}
