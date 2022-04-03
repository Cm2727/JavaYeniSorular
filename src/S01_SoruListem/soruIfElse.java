package S01_SoruListem;

import java.util.Scanner;

public class soruIfElse {

    /*soru: Kullanicin girmis oldugu bir sayinin pozutif mi
     negatif mi yoksa nötr mi oldugunu dogrulayan
     bir program yaziniz.

    * */

    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi:");
        int sayi = scan.nextInt();


        if (sayi > 0) {
            System.out.println("Bu bir pozitif sayidir.");

        } else if (sayi < 0) {
            System.out.println("Bu bir negatif sayidir.");
        } else  {
            System.out.println("bu sayi nötrdir");
        }

    }
}
