public class QuickSort {
    String[] names;
    int length;

    public static void main(String[] args) {
        QuickSort sorter = new QuickSort();
        String[] hewan = {"Gajah", "Kuda", "Ikan", "Ayam", "Bebek"};

        System.out.print("Before : ");
        for (String a : hewan){
            System.out.print(a+" ");
        }

        sorter.sort(hewan);
        System.out.print("\nSorted : ");
        for (String b : hewan) {
            System.out.print(b+" ");
        }
    }

    void sort(String[] hewan) {
        if (hewan == null || hewan.length == 0) {
            return;
        }
        names = hewan;
        length = hewan.length;
        quickSort(0, length - 1);
    }

    void quickSort(int first, int last) {

        int i = first;
        int j = last;
        String pivot = names[first + (last - first) / 2];
//        System.out.println(pivot);
        while (i <= j) {
            while (names[i].compareTo(pivot) < 0) {
                i++;
            }

            while (names[j].compareTo(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                exchangeNames(i, j);
                i++;
                j--;
            }
        }

        if (first < j) {
            quickSort(first, j);
        }
        if (i < last) {
            quickSort(i, last);
        }
    }

    void exchangeNames(int i, int j) {

        String temp = names[i];
//        System.out.println(temp);
        names[i] = names[j];
//        System.out.println( names[i]);
        names[j] = temp;
//        System.out.println( names[j]);


    }

}
//gajah kuda ikan ayam bebek
//
//gajah bebek ikan ayam kuda
//
//gajah bebek ayam ikan kuda
//
//ayam bebek gajah ikan kuda