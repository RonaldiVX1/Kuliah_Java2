import java.util.ArrayList;

public class Main<E> extends ArrayList<E>{
    public static void main(String[] args) {
        int elemen = 0;

        Main<String> namaHewan = new Main<>();

        // Nomor 1 dan 2
        namaHewan.add("Angsa");
        namaHewan.add("Bebek");
        namaHewan.add("Cicak");
        namaHewan.add("Domba");
        namaHewan.add("Elang");
        namaHewan.add("Gajah");

        System.out.println(namaHewan);

        namaHewan.add("Badak");
        namaHewan.add("Bebek");
        System.out.println(namaHewan);


        for (int i = 0; i < namaHewan.size(); i++){
            if (namaHewan.get(i).equals("Bebek")){
                elemen++;
            }
        }
        System.out.println("Bebek = " + elemen);

        System.out.print("Posisi Index = " );
        for (int i = 0; i < namaHewan.size(); i++){
            if (namaHewan.get(i).equals("Bebek")){
                System.out.print(i);
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("==========================================");

        // Nomor 3
        namaHewan.remove(1);
        System.out.println(namaHewan);
        System.out.println("==========================================");

        // Nomor 4
        System.out.println("Index ke-0 = " + namaHewan.get(0));
        System.out.println("Index ke-2 = " +namaHewan.get(2));

        namaHewan.remove(0);
        System.out.println(namaHewan);
        System.out.println("==========================================");

        // Nomor 5
        namaHewan.set(0, "Ular");
        System.out.println(namaHewan);
        namaHewan.add(2, "Itik");
        System.out.println(namaHewan);
        System.out.println("==========================================");

        // Nomor 6
        namaHewan.removeRange(2,5);
        System.out.println(namaHewan);
        System.out.println("==========================================");

        // Nomor 7
        System.out.println("Elemen Pertama = " + namaHewan.get(0));
        System.out.println("Elemen Terakhir = " + namaHewan.get(namaHewan.size() - 1));
        System.out.println("==========================================");

        // Nomor 8, 9, 10
        System.out.println(namaHewan.size());
        System.out.print("Posisi Index = " );
        for (int i = 0; i < namaHewan.size(); i++){
            if (namaHewan.get(i).equals("Badak")){
                System.out.print(i);
                System.out.print(", ");
            }
        }

    }

}
    




