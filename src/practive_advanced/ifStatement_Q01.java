package practive_advanced;

import java.util.Scanner;

public class ifStatement_Q01 {
    /* TASK :
     * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
     *  dort islemden biri ile isleme koyup sonucun yazdiriniz
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Toplama icin 1\ncikarma icin 2\ncarpma icin 3\n bolme icin 4");
        int islem=scan.nextInt();
        System.out.println("Lütfen iki sayi giriniz.");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        if (islem==1){
            System.out.println("Sayi1 ve Sayi2 nin Toplami:"+(sayi1+sayi2));
        }else if (islem==2){
            System.out.println("Sayi1 ve Sayi2 nin cikramasi:"+(sayi1-sayi2));
        }else if (islem==3){
            System.out.println("Sayi1 ve Sayi2 nin carpimi:"+(sayi1*sayi2));
        }else if (islem==4){
            System.out.println("Sayi1 ve Sayi2 nin bolumu:"+(sayi1/sayi2));
        }else {
            System.out.println("Hatali bir islem girdiniz.");
        }





    }



}
