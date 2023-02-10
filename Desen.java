import java.util.Scanner;
public class Desen {

    static void dS(int number, int count,boolean isContinue) {
        if(number <= 0)
            isContinue = false;
        if(number > 0 && isContinue == true){
            System.out.print(number + " ");
            dS(number - 5, ++count , isContinue);
        }else{
            System.out.print(number + " ");
            if (count == 0)
                return;
            dS(number + 5, --count, isContinue);
        }
    }
    static void dS ( int number){
        dS(number, 0,true);

    }

    public static void main(String[] args) {
        int a;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        a = input.nextInt();

        dS(a);
    }


}
