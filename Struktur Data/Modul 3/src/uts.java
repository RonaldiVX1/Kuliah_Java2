/**
 *
 * @author Wim Sonevel
 */
public class uts {

    String[] data;
    int head = 0;
    int tail = -1;

    public uts(int size) {
        data = new String[size];
    }

    public boolean isEmpty(){
        if(tail==-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if(tail==data.length-1){
            return true;
        }else{
            return false;
        }
    }

    public void Enqueue(String dataBaru){
        if(isEmpty()){
            tail = head;
            data[tail] = dataBaru;
        }else if(!isFull()){
            tail++;
            data[tail] = dataBaru;
        }else if(isFull()){
            System.out.println("antrian sudah penuh");
        }
    }

    public String Dequeue(){
        String temp = data[head];
        for(int i=head;i<=tail-1;i++){
            data[i] = data[i+1];
        }
        tail--;
        return temp;
    }

    public void tampilkan(){
        if(!isEmpty()){
            int index = head;
            while(index <= tail){
                System.out.print("|"+data[index]+"| ");
                index++;
            }
            System.out.println();
        }else{
            System.out.println("Kosong");
        }
    }



}


/**
 *
 * @author Wim Sonevel
 */
 class QueueApp {
    public static void main(String[] args) {
        uts queue = new uts(5);
        queue.Enqueue("K");
        queue.Enqueue("E");
        queue.Enqueue("E");
        queue.Enqueue("P");
        queue.Dequeue();
        queue.Dequeue();
        queue.Enqueue("C");
        queue.Enqueue("A");
        queue.Enqueue("L");
        queue.Enqueue("M");
        queue.Dequeue();
        queue.Dequeue();
        queue.Dequeue();


    }
}