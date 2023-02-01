
import java.util.Scanner;
public class UsHesabiRC {


    static int  usbul(int a, int b) {

        if (b==0)
            return 1;
        else if (a==1)
                return 1;
        else
            return a*usbul(a,b-1);


        }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Tabanı giriniz  :");
        int j=input.nextInt();
        System.out.print("üssü giriniz  :");
        int k=input.nextInt();



     int a=usbul(j,k);
        System.out.println(a);


    }//main end
}
