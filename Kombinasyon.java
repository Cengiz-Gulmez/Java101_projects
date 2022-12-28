package Ilkpaket;
import java.util.Scanner;


public class Kombinasyon {
    public static void main(String[] args) {
        int N,r;

        Scanner input=new Scanner(System.in);
        System.out.print("Kümenin eleman sayısını giriniz:");
        N=input.nextInt();
        System.out.print("kaçarlı gruplar oluşturmak istiyorsunuz:");
        r=input.nextInt();
        if (N==r){
            System.out.println("Cebap  1 ");
        } else if (r>N) {
            System.out.println("Hatalı giriş yaptınız");
        }else {
            int C;
            C=fakt(N)/(fakt(r)*fakt(N-r));
            System.out.println(C);

        }

        }

    static int fakt(int A) {
        int total = 1;
        for (int i = 1; i <= A; i++) {
            total = total * i;

        }
        return total;
    }
}

