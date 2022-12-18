package Ilkpaket;
import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int mouth,day;

        Scanner input=new Scanner(System.in);

        System.out.println("doğduğunuz ayı giriniz:");
        mouth=input.nextInt();
        System.out.println("doğduğunuz günü giriniz:");
        day=input.nextInt();

        if (mouth==1){
            if (day<=21) {
                System.out.println("oğlak burcu");
            }
                else{
                    System.out.println("kova burcu");
                }
            }
        if (mouth==2){
            if (day<=19) {
                System.out.println("kova burcu");
            }
            else{
                System.out.println("balık burcu");
            }
        }
        if (mouth==3){
            if (day<=20) {
                System.out.println("balık burcu");
            }
            else{
                System.out.println("koç burcu");
            }
        }
        if (mouth==4){
            if (day<=20) {
                System.out.println("koç burcu");
            }
            else{
                System.out.println("boğa burcu");
            }
        }
        if (mouth==5){
            if (day<=21) {
                System.out.println("boğa burcu");
            }
            else{
                System.out.println("ikizler burcu");
            }
        }
        if (mouth==6){
            if (day<=22) {
                System.out.println("ikizler burcu");
            }
            else{
                System.out.println("yengeç burcu");
            }
        }
        if (mouth==7){
            if (day<=22) {
                System.out.println("yengeç burcu");
            }
            else{
                System.out.println("aslan burcu");
            }
        }if (mouth==8){
            if (day<=22) {
                System.out.println("aslan burcu");
            }
            else{
                System.out.println("başak burcu");
            }
        }if (mouth==9){
            if (day<=22) {
                System.out.println("başak burcu");
            }
            else{
                System.out.println("terazi burcu");
            }
        }if (mouth==10){
            if (day<=22) {
                System.out.println("terazi burcu");
            }
            else{
                System.out.println("akrep burcu");
            }
        }if (mouth==11){
            if (day<=21) {
                System.out.println("akrep burcu");
            }
            else{
                System.out.println("yay burcu");
            }
        }if (mouth==12){
            if (day<=21) {
                System.out.println("yay burcu");
            }
            else{
                System.out.println("oğlak burcu");
            }
        }
        }

    }



