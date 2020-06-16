/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import arrayDeletion.Deletion;
import arrayTraversal.Traversal;
import arrayinsertion.Insertion;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author pratyush
 */
public class ControllerClass {
    public static void main(String[] args) throws Exception{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the size of array :- ");
            int size=Integer.parseInt(br.readLine());
            int[] arr=new int[size];
            char choice;
            int count=0;
            int option;
            do
            {
                System.out.println("Your options are :-");
                System.out.println("1.Insertion 2.Deletion 3.Traversal");
                System.out.println("Please enter your option :-");
                option=Integer.parseInt(br.readLine());
                switch(option)
                {
                    case 1:
                        count=Insertion.insertElement(arr, br, count);
                        Traversal.traverse(arr,count);
                        break;
                    case 2:
                        count=Deletion.deleteElement(arr, br, count);
                        Traversal.traverse(arr,count);
                        break;
                    case 3:
                        Traversal.traverse(arr,count);
                        break;
                    default:
                        System.out.println("you have enetered wrong choice.");
                                
                }
                System.out.println("Do you want to continue :-");
                choice=br.readLine().charAt(0);
            }
            while(choice=='y'||choice=='Y');
    }
}
