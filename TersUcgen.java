import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz...");
        int a=input.nextInt();
        for (int i=0;i<=a;i++){
            for (int k=0;k<i;k++){
                System.out.print(" ");
            }
            for (int j=0;j<(2*a)-(2*i+1);j++){
                System.out.print("*");
            }

            System.out.println();

        }


    }

}
