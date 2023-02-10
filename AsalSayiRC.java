import java.util.Scanner;
public class AsalSayiRC {

    static boolean isPrime(int x, int y){
        if (x <= 2) {
            return (x == 2) ? true : false;
        }
        if (x == y) {
            System.out.println("It is a prime number");
            return true;

        }
        if (x % y == 0) {
            System.out.println("It is not a prime number");
            return false;
        }
        return isPrime(x, y + 1);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();
        System.out.println(isPrime(a,2));

    }
}
