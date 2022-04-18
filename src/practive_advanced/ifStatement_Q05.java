package practive_advanced;

import java.util.Scanner;

public class ifStatement_Q05 {

    /*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("yasnizi giriniz");
        int yas = scan.nextInt();

        System.out.println("Kilonozu giriniz");
        int kilo = scan.nextInt();

        if (yas > 0 && yas < 18) {
            System.out.println("Kan Bagisi yapamazsiniz");

        } else if (yas >= 18) {
            if (kilo > 0 && kilo < 50) {
                System.out.println("Kan bagisi yapamazsin");
            } else if (kilo >= 50) {
                System.out.println("Kan bagisi yapabilirsin.");

            } else System.out.println("Kilonuzu hatali girdiniz");

        } else System.out.println("Hatali veri girdiniz");


    }


}
