package practive_advanced;

public class s1 {
    public static void main(String[] args) {

        // verilen 12345 sayısının rakamlarını yukarıdan aşağıya doğru yazdırınız
        // ex: input:
//		    output: 1
//		            2
//		            3
//		            4
//		            5

        //System.out.println("1\n2\n3\n4\n5");


		/*
	    System.out.println(binler);
		System.out.println(yuzler);
		System.out.println(onlar);
		System.out.println(birler);
		 */

        // consolda alt satira yazdırmak için "\n"  komutu kullanılır.

        int sayi=12345;
        int birler=sayi%10;
        int onlar=(sayi/10)%10;
        int yüzler=(sayi/100)%10;
        int binler=(sayi/1000)%10;
        int onbinler=(sayi/10000)%10;


        System.out.println("Birler: " +birler);
        System.out.println(" ");
        System.out.println("Onlar : " +onlar);
        System.out.println(" ");
        System.out.println("Yüzler :" + yüzler);
        System.out.println(" ");
        System.out.println("binler = " + binler);
        System.out.println(" ");
        System.out.println("onbinler = " + onbinler);

        System.out.println("Birler: " +birler +"\n" +"Onlar : " +onlar+ "\n"+"Yüzler :" + yüzler+"\n"+"binler = " + binler );


    }
}
