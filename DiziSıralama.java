package Ilkpaket;

import java.util.Scanner;
import java.util.Arrays;

public class DiziSıralama {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını giriniz : ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.println("Dizinin elemanlarını giriniz.");

        for (int i=0; i<n;i++){
            System.out.print((i+1) + ". Eleman : ");
            int x=input.nextInt();
            arr[i]=x;

        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
