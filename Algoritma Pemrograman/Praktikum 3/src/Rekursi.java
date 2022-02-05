public class Rekursi {

    // Function to print all the permutations of str
    static void permutasiRekursi(String str, String ans)
    {
        // print
        if (str.length() == 0) {
            System.out.println(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            // karakter 1
            char ch = str.charAt(i);

            // karakter tersisa di permutasi
            String temp = str.substring(0, i) + str.substring(i + 1);

            // Recurvise
            permutasiRekursi(temp, ans + ch);
        }
    }

//xyz
//x
//yz
//y
//z
//null



    // Driver code
    public static void main(String[] args)
    {
        String s = "XYZ";
        permutasiRekursi(s, "");
    }

}

// Big (O) = n * n

// return


//perulangan
//perulangan