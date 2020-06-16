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
public class Quadreticprobing {

    public static void insertElement(int[] ar,int size,BufferedReader br)throws Exception
    {
        for(int i=0;i<size/2;i++)
        {
            int prob=0;
            System.out.println("Enter Elements");
            int item=Integer.parseInt(br.readLine());
            int pos=item%size;
            quadreticProbing(ar,item,pos,size,prob,i);
        }
    }
    public static void quadreticProbing(int[]ar,int item,int pos,int size,int prob,int i)
    {
            if(pos==0)
            {
                ar[pos]=item;
                System.out.println("Element inserted at position :- "+pos+" in probing :- "+prob);
            }
            else
            {
                pos=(item+(i*i))%size;
                prob++;
                quadreticProbing(ar,item,pos,size,prob,i++);
            }
    }
}
