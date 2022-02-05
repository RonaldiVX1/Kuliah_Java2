import java.util.Scanner;

public class Main {
   static int ordo, i, j;
   static Scanner in = new Scanner(System.in);

    public static void matrix(){

            System.out.println("Masukan jumlah ordo matriks");
            ordo = in.nextInt();

            // Deklarasi matrix
            int[][] array = new int[ordo][ordo];

            // Membaca inputan elemen matrix dari user
            System.out.println("masukan elemen matriks");
            for (i = 0; i < ordo; i++){
                for (j = 0; j < ordo; j++){
                    array[i][j] = in.nextInt();
                }
            }

            // Menampilkan hasil dari matrix
            System.out.println("Hasil : ");
            for (int i = ordo - 1; i >= 0; i--) {
                System.out.print("[");
                for (int j = ordo - 1; j >= 0; j--){
                    System.out.print(array[i][j]);
                    if(j%5 != 0){
                        System.out.print(", ");
                    }
                }
                System.out.print("]\n");
            }
    }

    public static void main(String[] args)
    {
        matrix();
    }
}

/*



 */


