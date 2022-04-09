package practive_basic;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayLıst {

    public static void main(String[] args) {
        ArrayList<Integer> dizi=new ArrayList<>(Arrays.asList(3,45,6,23));

        System.out.println("Dizi = " + dizi.size());
        dizi.add(45);
        dizi.add(2,102);
        System.out.println(dizi);
        dizi.set(3,222);
        System.out.println(dizi);


        System.out.println("Dizi = " + dizi.size());
        System.out.println("Dizi boyutu= " +dizi.size());
    }

}
