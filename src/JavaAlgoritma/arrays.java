package JavaAlgoritma;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        String arr[] = {"Ali", "Veli", "Ayse"};
        System.out.println(arr[1]);
        arr[1] = "Cuma";
        System.out.println(arr[1]);
        System.out.println(Arrays.toString(arr));
        arr[2] = "Nazik";
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);

        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i]);

        }
        System.out.println("");

        System.out.println(Arrays.toString(arr));

        int arr2[]=new int[4];

        System.out.println(Arrays.toString(arr2));

        arr2[0]=05;
        arr2[2]=45;

        System.out.println(Arrays.toString(arr2));

        arr2[1]=65;

        System.out.println(Arrays.toString(arr2));
        arr2[2]=88;

        System.out.println(Arrays.toString(arr2));












    }
}
