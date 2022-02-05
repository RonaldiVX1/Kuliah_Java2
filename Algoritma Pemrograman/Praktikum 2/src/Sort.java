import java.util.*;

public class Sort {
    static ArrayList<String> penumpang_A = new ArrayList<>();
    static ArrayList<String> penumpang_B = new ArrayList<>();
    static String temp;

    public static void main(String[] args) {

        //First Output ArrayList
        setPenumpangA();
        System.out.println();
        setPenumpangB();


        System.out.println("\n");
        // Combine arrayList
        penumpang_A.addAll(penumpang_B);
        //Sorting
        beforeSort();
        bubbleSort();
        System.out.println();
        selectionSort();

        // Kompleksitas waktu sama O(n^2) karena ada perulangan didalam perulangan
    }


    public static void setPenumpangA() {

        penumpang_A.add("Lala");
        penumpang_A.add("Zahra");
        penumpang_A.add("Dede");
        penumpang_A.add("Bobo");
        System.out.print("Penumpang A : ");
        for (int i = 0; i < penumpang_A.size(); i++) {
            System.out.print(penumpang_A.get(i) + ", ");
        }

    }

    public static void setPenumpangB() {

        penumpang_B.add("Jarvis");
        penumpang_B.add("Daniel");
        penumpang_B.add("Qibo");
        penumpang_B.add("Aldo");

        System.out.print("Penumpang B : ");
        for (int i = 0; i < penumpang_B.size(); i++) {
            System.out.print(penumpang_B.get(i) + ", ");
        }
    }

    public static void beforeSort() {
        System.out.print("Sebelum Diurutkan : ");
        for (int i = 0; i < penumpang_A.size(); i++) {
            System.out.print(penumpang_A.get(i) + ", ");
        }
        System.out.println("\n");

    }


    public static void bubbleSort() {

        for (int i = 0; i < penumpang_A.size(); i++) {
            for (int j = i + 1; j < penumpang_A.size(); j++) {

                if (penumpang_A.get(i).compareTo(penumpang_A.get(j)) > 0) {

                    temp = penumpang_A.get(i);
                    penumpang_A.set(i, penumpang_A.get(j));
                    penumpang_A.set(j, temp);
                }
            }
        }

        System.out.print("Setelah Diurutkan : ");
        for (int i = 0; i < penumpang_A.size(); i++) {
            System.out.print(penumpang_A.get(i) + ", ");
        }
    }


    public static void selectionSort() {
        for (int i = 0; i < penumpang_A.size(); i++) {
            String Terkecil = penumpang_A.get(i);

            int indexTerkecil = i;

            for (int j = i; j < penumpang_A.size(); j++) {
                String value = penumpang_A.get(j);
                if (value.compareTo(Terkecil) < 0) {
                    Terkecil = value;
                    indexTerkecil = j;
                }
            }

            if (indexTerkecil != i) {
                String head = penumpang_A.get(i);
                penumpang_A.set(i, Terkecil);
                penumpang_A.set(indexTerkecil, head);
            }
        }

        System.out.print("Setelah Diurutkan : ");
        for (int i = 0; i < penumpang_A.size(); i++) {
            System.out.print(penumpang_A.get(i) + ", ");
        }
    }
}

