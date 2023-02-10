import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int a=input.nextInt();
        int total=0;
        for (int i=1;i<a;i++){
            if (a%i==0){
                total +=i;
            }

            }

        if (a==total){
            System.out.println("girdiğiniz sayı mükemmel sayıdır..");
        }else {
            System.out.println("girdiğiniz sayı mükemmel sayı değildir.");
        }

        }





    }

