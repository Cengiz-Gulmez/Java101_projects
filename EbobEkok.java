import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        int n1,n2;
        Scanner input=new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz");
        n1=input.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        n2=input.nextInt();
        int i=1;
        int ebob=0;

        while(i<n1){
            if (n1%i==0 && n2%i==0){
                System.out.println(i);
                 ebob=i;
            }
            i++;
        }
        int ekok=(n1*n2)/ebob;

        System.out.println("ebob = " + ebob + "   ekok =" +ekok);

    }
}
