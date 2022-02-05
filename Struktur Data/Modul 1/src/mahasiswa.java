


/**
 *
 * @author Aqilah
 */
import java.util.*;
import java.lang.*;

class StringKata{
    private String kata;

    StringKata(String kata){
        this.kata = kata;
    }

    public String getKata(){
        return kata;
    }

    public int jumHuruf(char cari){
        int count = 0;
        for (int i = 0; i < getKata().length(); i++) {
            if(getKata().charAt(i) == cari){
                count++;
            }
        }
        return count;
    }

    public void balikKata(){
        String reverse = "";
        for (int i = getKata().length() - 1; i >= 0; i--) {
            reverse += getKata().charAt(i);
        }
        System.out.println(reverse);
    }

    public void hurufKapital(String kalimat){
        for (int i = 0; i < getKata().length();i++){
            if (i%2 == 0){
                System.out.print(getKata().toUpperCase().charAt(i));
            }else {
                System.out.print(getKata().toLowerCase().charAt(i));
            }
        }
    }


}

class mahasiswa {
    public static void main(String[] args) {
        String word;
        char in;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata : ");
        word = input.next();

        StringKata word1 = new StringKata(word);
        System.out.print("Masukkan kata yang dicari : ");
        in = input.next().charAt(0);

        System.out.println("Jumlah kata "+word+" adalah "+word1.jumHuruf(in));
        word1.balikKata();

        word1.hurufKapital(word);
    }
}