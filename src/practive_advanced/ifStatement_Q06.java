package practive_advanced;

import java.util.Scanner;

public class ifStatement_Q06 {
    //TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen X ve Y degerini giriniz");
        int x = scan.nextInt();
        int y = scan.nextInt();


        if (x > 0 && y > 0) {
            System.out.println("Suandan 1. Bolgedesiniz");
        } else if (x < 0 && y > 0) {
            System.out.println("suanda 2. böledesiniz");

        } else if (x < 0 && y < 0) {
            System.out.println("suanda 3. bolgedesiniz");
        } else if (x > 0 && y < 0) {
            System.out.println("suanda 4. bolgedesiniz");

        } else if (x != 0 && y == 0) {
            System.out.println("suanda x eksenindesin.");

        } else if (x == 0 && y != 0) {
            System.out.println("suanda y eksenindesin.");

        } else System.out.println("orjindesin.");
    }
}