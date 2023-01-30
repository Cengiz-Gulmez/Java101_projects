
import java.util.Scanner;
public class BasamakToplami {
    public static void main(String[] args) {
        Scanner input=new  Scanner(System.in);
        System.out.println("Bir Sayı giriniz.");
        int a=input.nextInt();
        int total=0;
        while (a!=0){
            total+=a%10;
            a /=10;

        }

        System.out.println(total);
    }



}
