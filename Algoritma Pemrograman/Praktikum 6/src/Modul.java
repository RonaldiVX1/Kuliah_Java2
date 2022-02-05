import java.util.*;

public class Modul {

    static int[] arr = {2, 12, 48, 39, 5, 8 , 17, 23, 88, 57, 3};

    public static void main(String[] args) {

        printArray();
        findLarge();

    }

    public static void printArray(){

        System.out.print("Elemen Array : " + Arrays.toString(arr));

    }

    public static void findLarge(){

       int max = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("\nBilangan yang terbesar adalah : " + max);
    }
}
