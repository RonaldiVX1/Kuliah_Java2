import java.util.Scanner;

public class Queue {

    public Node front, rear;
    public int cSize;
    public int count = 0;

    public Queue(){
        front = null;
        rear = null;
        cSize = 0;
    }

    public void enqueue(imigrasi input){
        Node tmp = new Node(input, null);
        if(this.rear == null){
            this.front = this.rear = tmp;
            System.out.println("Data berhasil ditambahkan, dengan nama "+rear.data.nama);
            cSize++;
            return;
        }
        this.rear.next = tmp;
        this.rear = tmp;
        System.out.println("Data berhasil ditambahkan, dengan nama "+rear.data.nama);
        cSize++;
    }

    public void dequeue(){
        if(this.front == null){
            System.out.println("Antrian kosong");
            return;
        }

        Node tmp = this.front;

        if(count > 2){
            if(tmp.data.usia > 5 && tmp.data.usia < 60){
                tmp = tmp.next;
                System.out.println(this.front.data.nama);
                this.front.next = null;
                this.rear = this.front;
                //this.rear = this.front.next;
                System.out.println("Data berhasil dikeluarkan, dengan nama "+tmp.data.nama);
                return;
            }
        }

        this.front = this.front.next;

        if(this.front == null){
            this.rear = null;
        }
        System.out.println("Data berhasil dikeluarkan, dengan nama "+tmp.data.nama);
        cSize--;
        count++;
    }


    public void printList(){
        if (this.front != null) {
            Node tmp = front;
            System.out.println("Isi Antrian: ");
            int i = 0;
            while (tmp != null) {
                System.out.println((i+1)+". "+tmp.data.nama+" | "+tmp.data.usia+" | "+tmp.data.asal+
                        " | "+tmp.data.tujuan);
                tmp = tmp.next;
                i++;
            }
        }else{
            System.out.println("Antrian kosong");
        }
    }


    public void peek()
    {

        if (!isEmpty()) {
            System.out.println("antrian pertama adalah " + this.front.data.nama + " usia : " + this.front.data.usia +
                    " Asal : " + this.front.data.asal + " Tujuan : " + this.front.data.tujuan  );;
        }
        else {
            System.out.println("Antrian kosong");
        }

    }

    public boolean isEmpty() {
        return rear == null && front == null;
    }

    public int size()
    {
        Node temp = front;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }


}

class Node {

    imigrasi data;
    Node next;

    public Node(imigrasi data, Node next){
        this.data = data;
        this.next = next;
    }
}

class imigrasi {

    String nama;
    int usia;
    String asal;
    String tujuan;

    public imigrasi(String nama, int usia, String asal, String tujuan){
        this.nama = nama;
        this.usia = usia;
        this.asal = asal;
        this.tujuan= tujuan;
    }
}

 class Main {
    public static void menu(){
        System.out.println("Pilih menu: ");
        System.out.println("1. Tambah Antrian (enqueue-addLast)");
        System.out.println("2. Pemanggilan Antrian (dequeue)");
        System.out.println("3. Cetak Antrian (PrintList)" );
        System.out.println("4. Melihat antrian pertama (peek)");
        System.out.println("5. Total Antrian (size)");
        System.out.println("6. Exit");
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        Queue antrian = new Queue();

//        data awal
//        imigrasi a1 = new imigrasi("Alif", 20, "Indonesia", "Jepang");
//        imigrasi a2 = new imigrasi("Riski", 17, "Indonesia", "Amerika");
//        imigrasi a3 = new imigrasi("Alia", 4, "Indonesia", "Korea");
//        imigrasi a4 = new imigrasi("Darmawan", 17, "Indonesia", "China");
//        imigrasi a5 = new imigrasi("Tio", 58, "Indonesia", "Singapura");
//
//        antrian.enqueue(a1);
//        antrian.enqueue(a2);
//        antrian.enqueue(a3);
//        antrian.enqueue(a4);
//        antrian.enqueue(a5);

        do{
            menu();
            System.out.print("Pilih menu :");
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih){
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Asal: ");
                    String asal = sc.nextLine();
                    System.out.print("Tujuan: ");
                    String tujuan = sc.nextLine();

                    imigrasi im = new imigrasi(nama, usia, asal,tujuan);

                    antrian.enqueue(im);
                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.printList();
                    break;

                case 4:
                    antrian.peek();
                    break;
                case 5 :
                    System.out.println("Jumlah antrian : " + antrian.size());
                    break;
                case  6:
                    exit = true;
            }

        }while(!exit);
        sc.close();
    }
}