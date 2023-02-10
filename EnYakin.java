package Ilkpaket;
import java.util.Arrays;
import java.util.Scanner;

public class EnYakin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int x=input.nextInt();

        int[] list={12,15,65,89,14,36,500,987};


        int min=list[0];
        int max=list[0];

        for (int i:list){
            if (i<x){
                if (x-i<Math.abs(x-min)){
                    min=i;
                }
                }
            if (i>x){

                if (i-x<Math.abs(x-max)){
                    max=i;
                }

            }


        }
        System.out.println(min);
        System.out.println(max);

        }



    }

