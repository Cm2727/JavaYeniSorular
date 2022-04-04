package S01_SoruListem;

import java.util.Scanner;

public class C003 {

    /*soru: Kullanicin girmis oldugu bir sayinin pozutif mi
     negatif mi yoksa nötr mi oldugunu dogrulayan
     bir program yaziniz.*/
    public static void main(String[] args) {




        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int input= scan.nextInt();


        if (0<input){
            System.out.println("Bu sayi poyitiftir.");

        }else if (0>input){
            System.out.println("Bu negatif bir sayidir");

        }else {
            System.out.println("Bu sayi nötrdür");

        }


    }
}
