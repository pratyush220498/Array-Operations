/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertion;

import java.io.BufferedReader;

/**
 *
 * @author pratyush
 */
public class LinearProbing {

    public static void insertElement(int[] ar,int size,BufferedReader br)throws Exception
    {
        String ch;
        int count=0;
        do
        {
            if(count==size)
            {
                System.out.println("Hash table overflow");
                break;
            }
            else
            {
                int prob=0;
                System.out.println("Enter Elements");
                int item=Integer.parseInt(br.readLine());
                int pos=item%size;
                int i=linearProbing(ar,item,pos,size,prob);
                if(i==1)
                    count++;
            }
            System.out.println("Do you want to continue");
            ch=br.readLine();
        }
        while(ch.equalsIgnoreCase("y"));
    }
    public static int linearProbing(int[]ar,int item,int pos,int size,int prob)
    {
            if(pos==0)
            {
                ar[pos]=item;
                System.out.println("Element inserted at position :- "+pos+" in probing :- "+prob);
                return 1;
            }
            else
            {
                pos=(item+1)%size;
                prob++;
                linearProbing(ar,item,pos,size,prob);
            }
            return 0;
    }
}
