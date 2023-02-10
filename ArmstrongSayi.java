public class ArmstrongSayi {
    public static void main(String[] args) {


        for (int a=1;a<=999;a++){

        int atemp=a;
        int basamak=0 , basValue=0;
        int result;
        int total=0;

        while(atemp!=0){
            atemp/=10;
            basamak++;
        }
        atemp=a;
        for(int k=1;k<=basamak;k++) {
            basValue = atemp % 10;
            result = 1;
            for (int i = 1; i <= basamak; i++) {
                result *= basValue;
            }
            total += result;
            atemp /= 10;
        }
        if (total==a){
            System.out.println( a + "  Armstrong sayıdır");
        }


        }

    }

}
