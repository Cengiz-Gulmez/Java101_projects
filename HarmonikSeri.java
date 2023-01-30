
import java.util.Scanner;
public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int a=input.nextInt();
        double total=0;
        for (int i=1;i<=a;i++){
            total+=(1.0/i);

        }
        System.out.println(total);
    }
}
