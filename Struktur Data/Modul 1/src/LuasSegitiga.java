import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int alas, tinggi;
        int tipeData;

        System.out.println("===== HITUNG LUAS SEGITITGA ======");

        System.out.println("Mau menampilkan hasil luas dalam bentuk? :");
        System.out.println("1. Hasil to Integer \n2. Hasil to Double ");
        System.out.println("Masukan Pilihan 1 / 2");

        tipeData = input.nextInt();
        System.out.println("Masukan Nilai Alas dan Tinggi Secara Berurutan");
        alas = input.nextInt();
        tinggi = input.nextInt();
        if (tipeData == 1){

            Segitiga<Integer> luasTipeInt = new Segitiga<>(alas,tinggi);
            System.out.println("Luas Segitiga dalam bentuk Integer");
            System.out.println(luasTipeInt.getResultAsInt());

        } else {
            Segitiga<Double> luasTipeDouble = new Segitiga<>((double) alas, (double) tinggi);
            System.out.println("Luas Segitiga dalam bentuk Double");
            System.out.println(luasTipeDouble.getResultAsDouble());
        }
    }
}

class Segitiga<T> {

    final private T alas;
    final private T tinggi;


    public Segitiga(T alas, T tinggi){
        this.alas   = alas;
        this.tinggi = tinggi;
    }

   public int getResultAsInt(){
       return (int) alas * (int) tinggi / 2;
    }

    public double getResultAsDouble(){
        return (double) alas * (double) tinggi / 2;
    }
}

