package S01_SoruListem;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=scan.nextInt();

        mukemmelSayi(sayi);

    }

    private static void mukemmelSayi(int sayi) {

        int toplam=0;
        for (int i = 0; i <sayi ; i++) {

            if(sayi%i==0){
                toplam +=i;
                System.out.println(i+" ");//bolenleri yazdir


            }

        }




    }


}
