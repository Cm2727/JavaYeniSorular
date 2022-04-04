package S01_SoruListem;

import java.util.Scanner;

public class dd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz = ");
        String isim = scan.nextLine();

        if (isim.equalsIgnoreCase("ALI")) {
            System.out.println("Can");
        } else if (isim.equalsIgnoreCase("veli")) {
            System.out.println("Canan");
        } else {
            System.out.println("yanlis isim girdiniz");
        }

    }
}

