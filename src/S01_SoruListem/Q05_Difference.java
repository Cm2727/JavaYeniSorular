package S01_SoruListem;

import java.util.Scanner;

public class Q05_Difference {

     /*
 Create a function that takes an array and the difference between the largest
 and the smallest numbers.
 Ask user to enter array elements.
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */

    public static void main(String[] args) {
        arrolustur();

    }

    private static void arrolustur() {
        Scanner scan =new Scanner(System.in);
        System.out.println("array uzunlugunu giriniz :");
        int uzunluk =scan.nextInt();
        int arr[]=new int[uzunluk];
    }

}
