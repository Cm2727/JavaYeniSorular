package proje2;

import java.util.Arrays;

public class soru3 {

    public static void main(String[] args) {
        int[] arr = {1, 6, 12, 15, 22, 18, 30, 16};
        int sayi1 = 10, sayi2 = 20;

        URange(arr, sayi1, sayi2);

    }

    private static int[] URange(int[] arr, int sayi1, int sayi2) {

        for (int i = arr.length; i >= 0; i--) {
            if (arr[i] > 10 && arr[i] < 20)
                arr[i] = -1;


        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }


}
