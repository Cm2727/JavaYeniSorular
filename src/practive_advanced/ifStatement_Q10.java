package practive_advanced;

import java.util.Objects;
import java.util.Scanner;

/*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            54 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */
public class ifStatement_Q10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ehliyet varsa E yoksa H yazin.");
        String ehliyetSecimi = scan.nextLine();
        System.out.println("Hizinizi girin.");
        int hiz = scan.nextInt();


        if (hiz < 55 && hiz > 0) {
            System.out.println("Hayirli yolculuklar");
        } else if (hiz > 54 && hiz < 75 && Objects.equals(ehliyetSecimi, "E")) {
            System.out.println("Cezaniz 100 $");
        } else if (hiz > 54 && hiz < 75 && Objects.equals(ehliyetSecimi, "H")) {
            System.out.println("Cezaniz 300 $");
        } else if (hiz > 74 && hiz < 85 && Objects.equals(ehliyetSecimi, "E")) {
            System.out.println("Cezaniz 150 $");
        } else if (hiz > 74 && hiz < 85 && Objects.equals(ehliyetSecimi, "H")) {
            System.out.println("Cezaniz 350 $");
        } else if (hiz > 94 && Objects.equals(ehliyetSecimi, "E")) {
            System.out.println("Cezaniz 500 $");
        } else if (hiz > 94 && Objects.equals(ehliyetSecimi, "H")) {
            System.out.println("Cezaniz 700 $");
        }else System.out.println("Hatali veri girdiniz");

    }

}
