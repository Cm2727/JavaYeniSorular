package interviewQuestions6;


import java.util.Scanner;

public class Q03_OddIndexNumber {
    // indexi tek sayi olan karakterleri yazdiran bir code create ediniz

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String str = scanner.nextLine();

        int index = 0;

        do {
            if (index % 2 == 1) { //indexi tek sayi olan
                System.out.print(str.charAt(index) + " ");
            }
            index++;
        } while (index < str.length());

    }

}
