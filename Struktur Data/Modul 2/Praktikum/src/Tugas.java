
class Tugas{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        // Adds data to the list
        list.add(8);
        list.add(7);
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(3);
        list.add(0);


        // Displaying original list
        System.out.print("Before : ");
        list.display();

        // Sorting list
        list.sortList();

        // Displaying sorted list
        System.out.print("After : ");
        list.display();


    }

}


 class LinkedList {
     Node head ;
     Node tail ;

    class Node {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
        }
    }


    public void add(int data)
    {
        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;
            tail = newNode;
        }
        else {

            tail.next = newNode;
            tail = newNode;
        }
    }

    public void sortList()
    {

        Node current = head, index = null;

        int temp;

        if (head == null) {
            return;
        }

        else {
            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }

                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public boolean isEmpty(){
        return head==null;
    }


}

/*  Namun secara spesifik fungsi keduanya berbeda, di mana ArrayList sebaiknya digunakan ketika
    Anda membutuhkan operasi pencarian yang lebih, sementara LinkedList digunakan ketika Anda
    membutihkan lebih banyak operasi insert dan delete (@appkey.id)
*/