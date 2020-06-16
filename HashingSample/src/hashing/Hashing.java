/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing;

import insertion.DoubleHashing;
import insertion.LinearProbing;
import insertion.Quadreticprobing;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author pratyush
 */
public class Hashing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array :-");
        int size=Integer.parseInt(br.readLine());
        int[] ar=new int[size];
        System.out.println("Your options are :-");
        System.out.println("1.Linear Probing 2. Quadretic Probing 3.Double Hashing");
        int option=Integer.parseInt(br.readLine());
        switch(option)
        {
            case 1:
                    LinearProbing.insertElement(ar,size,br);
                    break;
            case 2:
                    Quadreticprobing.insertElement(ar, size, br);
                    break;
            case 3:
                    DoubleHashing.insertElement(ar, size, br);
                break;
            default:
                System.out.println("You have entered wrong choice");
        }        
    }    
}
