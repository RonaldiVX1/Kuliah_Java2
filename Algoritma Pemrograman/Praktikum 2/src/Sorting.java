public class Sorting {

    static String[] mobil_A = {"Lala", "Zahra", "Dede", "Bobo"};
    static String[] mobil_B = {"Jarvis", "Daniel", "Qibo", "Aldo"};
    static int length = mobil_A.length + mobil_B.length;
    static String[] allPerson = new String[length];


    public static void main(String[] args) {

        viewArray(mobil_A, "A");
        System.out.println("");
        viewArray(mobil_B, "B");
        System.out.println("\n");
        joinArray();
        System.out.println("\n");
        bubbleSort(allPerson);
        System.out.println();
        selectionSort(allPerson);

        // Kompleksitas waktu sama O(n^2) karena ada perulangan didalam perulangan
    }

    public static void viewArray(String array[], String n){
        System.out.print("Penumpang Mobil " + n + ": ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + ", ");
    }

    public static void joinArray(){

        int idx = 0;
        for (int i = 0; i < mobil_A.length; i++ ){
            allPerson[idx] = mobil_A[i];
            idx++;
        }

        for (int i = 0; i < mobil_B.length; i++ ){
            allPerson[idx] = mobil_B[i];
            idx++;
        }

        System.out.print("Sebelum Diurutkan : ");
        for (int i = 0; i < allPerson.length; i++)
            System.out.print(allPerson[i] + ", ");
    }

   public static void bubbleSort(String arr[]) {
        String temp;

        for (int j = 0; j < arr.length - 1; j++)
        {
            for (int i = j + 1; i < arr.length; i++)
            {
                if (arr[j].compareTo(arr[i]) > 0)
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
       System.out.print("Setelah Diurutkan : ");
       for (int i = 0; i < arr.length; i++)
           System.out.print(arr[i] + ", ");
    }


    public static void selectionSort( String[] array )
    {

        for ( int j=0; j < array.length-1; j++ ) {
            int min = j;
            for ( int k=j+1; k < array.length; k++ )
                if ( array[k].compareTo( array[min] ) < 0 ){
                    min = k;
                }

            //Swap
            String temp = array[j];
            array[j] = array[min];
            array[min] = temp;
        }

        System.out.print("Setelah Diurutkan : ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + ", ");
    }

}
