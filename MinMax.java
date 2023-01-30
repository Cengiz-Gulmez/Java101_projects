import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz");
        int n=input.nextInt();
        int a=0,b=0,k=0;
        System.out.println("ilk sayıyı giriniz");
        a=input.nextInt();
        b=a;
        k=a;
        for (int i=1; i<n;i++){
            System.out.println("sayılarınızı giriniz...");
            a=input.nextInt();
            System.out.println(a);
            if(a>b){

                b=a;
            }
            if (a<k){
                k=a;
            }


        }
        System.out.println( "en küçük sayı "+ k);
        System.out.println("en büyük sayı "+ b);
    }

}
