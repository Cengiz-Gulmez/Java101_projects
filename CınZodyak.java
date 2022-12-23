package Ilkpaket;
import java.util.Scanner;

public class CınZodyak {

    public static void main(String[] args) {
        int yıl=0,mod;
        Scanner input=new Scanner(System.in);
        System.out.println("doğum yılınızı giriniz:");
        yıl=input.nextInt();
        mod=yıl%12;
        System.out.println(mod);

        switch (mod){
            case 0:
                System.out.println("Maymun");
                break;
            case 1:
                System.out.println("Horoz");
                break;
            case 2:
                System.out.println("Köpek");
                break;
            case 3:
                System.out.println("Domuz");
                break;
            case 4:
                System.out.println("Fare");
                break;
            case 5:
                System.out.println("Öküz");
                break;
            case 6:
                System.out.println("Kaplan");
                break;
            case 7:
                System.out.println("Tavşan");
                break;
            case 8:
                System.out.println("Ejderha");
                break;
            case 9:
                System.out.println("Yılan");
                break;
            case 10:
                System.out.println("At");
                break;
            case 11:
                System.out.println("Koyun");
                break;
        }


    }



}
