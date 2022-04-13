package interviewQuestions3;

public class Q01_ReverseString {
     /*
		// Stringi ters cevirmek icin bir Java Programi yazin
		//1.Yol: StringBuilder () kullanarak
		//2.Yol: String Classini kullanarak
		//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */

    public static void main(String[] args) {

        System.out.println("1. yol: ");

        String input = "Bugün hava cok güzel";

        StringBuilder str = new StringBuilder();
        str.append(input);

        String reverseInput = str.reverse().toString();
        System.out.println(reverseInput);

        System.out.println(" ");

        //2.Yol: String Classini kullanarak
        System.out.println("2. yol: ");

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));

        }
        System.out.println(" ");

        System.out.println("3. yol: ");

        inputuTerstenYazdir(input);


    }

    private static void inputuTerstenYazdir(String input) {

        char[] arr = input.toCharArray();

        for (int i = input.length() - 1; i >= 0; i--) {

            System.out.print(arr[i]);


        }


    }

}
