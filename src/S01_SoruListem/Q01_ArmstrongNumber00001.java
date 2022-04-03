package S01_SoruListem;

import java.util.Scanner;

public class Q01_ArmstrongNumber00001 {
        /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        armstrongg(sayi);
        girilenSayiyaKadarOlanArmstrongg(sayi);


    }

    private static void armstrongg(int n) {

        int sayininKupleriToplami = 0;
        int basmaktakiSayi = 0;
        int girilenSayi = n;

        while (n > 0) {
            basmaktakiSayi = n % 10;
            sayininKupleriToplami += (basmaktakiSayi * basmaktakiSayi * basmaktakiSayi);
            n = n / 10;

        }
        if (girilenSayi == sayininKupleriToplami)
            System.out.println(girilenSayi + "sayisi armstrong sayidir.");
        else System.out.println(girilenSayi + "sayisi armstrong sayisi degildir.");

    }

    //soru 2 icin

    private static void girilenSayiyaKadarOlanArmstrongg(int sayi) {
        for (int i = 1; i <=sayi; i++) {
            armstrongg(i);//recursive method uygladik.

        }


    }

}


