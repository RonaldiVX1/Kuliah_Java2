import java.util.Scanner;

public class Search {


    static void searchRow(String[][] a, int n, int m, String k)
    {
        int l = 0, r = n - 1, mid;
        while (l <= r) {
            mid = (l + r) / 2;

            if (k.equalsIgnoreCase(a[mid][0]))
            {// checking leftmost element
                System.out.println("Nama Ditemukan di : (" + mid + ","
                        + "0)");
                return;
            }

            if (k.equalsIgnoreCase(a[mid][m - 1])) //
            // checking rightmost element
            {
                int t = m - 1;
                System.out.println("Nama Ditemukan di : (" + mid + ","
                        + t + ")");
                return;
            }

            if (k.compareToIgnoreCase(a[mid][0]) > 0
                    && k.compareToIgnoreCase(a[mid][m - 1]) < 0 ) // this means the element
            // must be within this row
            {
                binarySearch(a, n, m, k, mid); // we'll apply binary
                // search on this row
                return;
            }

           else if (k.compareToIgnoreCase(a[mid][0]) < 0 )
                r = mid - 1;
            else
                l = mid + 1;
        }
    }

    static void binarySearch(String[][] a, int n, int m, String k,
                             int x) // x is the row number
    {

        int l = 0, r = m - 1, mid;
        while (l <= r) {
            mid = (l + r) / 2;

            if (a[x][mid].equalsIgnoreCase(k)) {
                System.out.println("Nama Ditemukan di : (" + x + ","
                        + mid + ")");
                return;
            }

            else if (a[x][mid].compareToIgnoreCase(k) > 0)
                r = mid - 1;
            else
                l = mid + 1;
        }
        System.out.println("Element not found");
    }

    // Driver Code
    public static void main(String[] args)
    {
        int n = 4;
        int m = 4;

        String[][] arr = {{ "Alex", "Aqin", "Aril", "Bella"},
                    { "Caca", "Dinda", "Dwi", "Egi"},
                    { "Farkhan", "Farli", "Gilly","Ichsan",},
                    {  "Lidya","Syafei", "Syifa", "Wahyu"}};

        System.out.print("Nama yang dicari: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print( arr[i][j] + "\t");
            }
            System.out.println();
    }

        searchRow(arr, n, m, input);
    }

}
