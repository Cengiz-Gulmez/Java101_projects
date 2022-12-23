package Ilkpaket;
import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int km,age,ytip;
        double tutar;
        Scanner input=new Scanner(System.in);
        System.out.println("yaşınızı giriniz:");
        age=input.nextInt();
        System.out.println("kaç km gideceğinizi giriniz:");
        km=input.nextInt();
        System.out.println("yolculuk tipiniz tek yön ise 1 e değilse 2 ye basınız.");
        ytip=input.nextInt();
        tutar=km*0.1;

        if (age<0 || km<0 ){
            System.out.println("hatalı giriş yaptınız!");
        }else {

            if (age<=12){
                tutar=tutar*0.5;
            } else if (age<=24 && age>12) {
                tutar=tutar*0.9;
                
            } else if (age>65) {
                tutar=tutar*0.7;

            }


        }
        switch (ytip){
            case 1:
                System.out.println("yolculuk tutarınız"+ tutar + "TL dir");
                break;
            case 2:
                tutar=tutar*0.8*2;
                System.out.println("yolculuk tutarınız"+ tutar + "TL dir");
                break;
            default:
                System.out.println("hatalı giriş yaptınız:");
                break;



        }


        }


    }

