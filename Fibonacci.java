import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz... ");
        int n=input.nextInt();
        int a,b=1 , result=0;
        System.out.println(result);

        for (int i=0; i<n;i++){
            a=b;
            b=result;

            result=a+b;
            System.out.println(result);




        }
    }
}
