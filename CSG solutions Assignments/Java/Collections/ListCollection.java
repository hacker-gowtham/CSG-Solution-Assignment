package Java.Collections;


import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListCollection {
    List<Integer> list = new ArrayList<Integer>();

    public void addElement(int n){
        for(int i=0;i<n;i++){
             Scanner sc = new Scanner(System.in) ;
                System.out.println("Enter the number to be added in the list: ");
                int num = sc.nextInt();
                list.add(num);
                if(i==n-1){
                    sc.close();
                }
                }
            
            System.out.println("The list is Before Sorting: "+ list);
             Collections.sort(list);
            System.out.println("The list is After Sorting: "+ list);

        
        }

    public static void main(String[] args) {
        ListCollection l = new ListCollection();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elemnts to be added in the list: ");
        int n = sc.nextInt();
        l.addElement(n);
        sc.close();
    }
}

//This program is for sorting the array using arraylist