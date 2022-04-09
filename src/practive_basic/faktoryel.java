package practive_basic;

public class faktoryel {
    public static void main(String[] args) {
        int sayi = 7;
        int faktoryel = 1;


        String faktoryelAcikYazim = ""; // string yyapmak icin basina bir hiclik
        for (int i = sayi; i >= 1; i--) {
            faktoryel *= i;
            if (i == sayi) {
                faktoryelAcikYazim = faktoryelAcikYazim + i;
            } else {
                faktoryelAcikYazim += " * " + i;
            }
        }

        System.out.println(sayi + "! = " + faktoryelAcikYazim + " = " + faktoryel); // 7! = 77 * 6 * 5 * 4 * 3 * 2 * 1 = 5040
        System.out.println(sayi + "! = " + faktoryel); // 7! = 5040
    }
}
