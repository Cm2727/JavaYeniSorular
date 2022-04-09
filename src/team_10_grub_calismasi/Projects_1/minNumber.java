package team_10_grub_calismasi.Projects_1;

public class minNumber {
     /*
        Create int 2D array
        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}
        print the min number from the 2d array
     */


     /*
         {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}
         int 2D arrayini  olustur
        2D arrayinden min number print et
     */


    public static void main(String[] args) {
          /*
        Bu satırdan önceki satırlarda hicbirşeyi silme ve degiştirme
        koda burdan basla
        array1 and array2  kullan
      */

        int[][] arr = {{1, 2, 3}, {2, -1, 1}, {5, 5, 5}, {2, 1, 3}};

        int min = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] < min) {
                    min = arr[i][j];
                }

            }
        }
        System.out.println(min);


    }

}
