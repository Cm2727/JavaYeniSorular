package team_10_grub_calismasi.Projects_1;

import java.util.Scanner;

public class checkNumberEven {
    /*
        Given an int check the number is even or not
        if the number is even print true
        if the number is odd print false
        result should be true or false.
     */


     /*
        Veri tipi int olan number verildiğinde, number  çift mi tek mi kontrol et
        Eğer number çift ise  print true
        Eğer number tek ise  print false
        result true ya da false olmalı.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int sayi = scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println(true);
        } else System.out.println(false);


    }


}

