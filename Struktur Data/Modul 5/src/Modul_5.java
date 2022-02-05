
//---------------------------------------------------------------------------------------------------
import java.util.Scanner;
public class Modul_5 {

    public static void main(String[] args) {
        int n = 6;
        String input;
        BinaryTree bt = new BinaryTree();

        Scanner scan = new Scanner( System.in );

        for (int i = 1; i <= n; i++) {
            System.out.print("input tree " + i + " : ");
            input = scan.nextLine();
            bt.add(input);
        }

//        bt.add("6");
//        bt.add("4");
//        bt.add("8");
//        bt.add("3");
//        bt.add("5");
//        bt.add("7");
        System.out.print("Pre order : ");
        bt.traversePreOrder(bt.root);
        System.out.println();
        System.out.print("In order : ");
        bt.traverseInOrder(bt.root);
        System.out.println();
        System.out.print("Post order : ");
        bt.traversePostOrder(bt.root);
        System.out.println();
    }
}



class BinaryTree {
    Node root;

    public BinaryTree(){
        root = null;
    }

    boolean isEmpty(){
        return root == null;
    }

    void add(String data){
        if(isEmpty()){
            root = new Node(data);
        }else{
            Node current = root;
            while(true){
                if(data.compareToIgnoreCase(current.data) < 0 ){
                    if(current.left != null){
                        current = current.left;
                    }else{
                        current.left = new Node(data);
                        break;
                    }
                }else if(data.compareToIgnoreCase(current.data) > 0){
                    if(current.right != null){
                        current = current.right;
                    }else{
                        current.right = new Node(data);
                        break;
                    }
                }else{
                    break;
                }
            }
        }
    }


    void traversePreOrder(Node node){
        if(node != null){
            System.out.print(" "+node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" "+node.data);
        }
    }

    void traverseInOrder(Node node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.print(" "+node.data);
            traverseInOrder(node.right);
        }
    }

}

class Node {
    String data;
    Node left, right;


    public Node(String data){
        this.left = null;
        this.data = data;
        this.right = null;
    }

}
