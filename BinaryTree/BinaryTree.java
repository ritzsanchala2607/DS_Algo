package BinaryTree;
class Node{
    int data;
    Node left;
    Node right;

    public Node(int root){
        data=root;
    }

    public static void display(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+ "->");
        if(root.left!= null){System.out.print(root.left.data+ " ");}
        if(root.right!= null){System.out.print(root.right.data+ " ");}
        System.out.println();
        display(root.left);
        display(root.right);
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static int size(Node root){
        if(root == null) return 0;
        return size(root.left) + size(root.right) +1;
    }

    public static int sumOfNode(Node root){
        if(root == null) return 0;
        return root.data+ sumOfNode(root.left)+sumOfNode(root.right);
    }
//    public static int max=0;
//    public static int maxValue(Node root){
//        if(root== null) return 0;
//
//        if(root.data >max){
//            max=root.data;
//        }
//        maxValue(root.left);
//        maxValue(root.right);
//
//        return max;
//    }

     public static int maxValue(Node root){
        if(root == null) return 0;
        int rootValue= root.data;
        int leftMax= maxValue(root.left);
        int rightMax= maxValue(root.right);

        return Math.max(rootValue,Math.max(leftMax,rightMax));
     }

    public static int minValue(Node root){
        if(root == null) return 0;
        int rootValue= root.data;
        int leftMax= maxValue(root.left);
        int rightMax= maxValue(root.right);

        return Math.min(rootValue,Math.min(leftMax,rightMax));
    }

     public static int heightOfTree(Node root){
        if(root == null ) return 0;
        return 1+Math.max(heightOfTree(root.left), heightOfTree(root.right));
     }

     public static int product(Node root){
        if(root == null ) return 1;

        return root.data*(product(root.left))*(product(root.right));
     }
}

public class BinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b= new Node(3);
        root.left=a;
        root.right=b;

        Node c= new Node(4);
        Node d= new Node(5);
        a.left=c;
        a.right=d;

        Node e= new Node(6);
        b.right=e;
//        Node.display(root);

        System.out.println("PreOrder travelsar");
        Node.preOrder(root);

        System.out.println();
        System.out.println("Size of tree is "+ Node.size(root));

        System.out.println();
        System.out.println("Sum of all tree nodes is "+ Node.sumOfNode(root));

        System.out.println();
        System.out.println("Max value of all tree nodes is "+ Node.maxValue(root));

        System.out.println();
        System.out.println("Min value of all tree nodes is "+ Node.minValue(root));

        System.out.println();
        System.out.println("Height of tree is "+ Node.heightOfTree(root));

        System.out.println();
        System.out.println("Product of tree is "+ Node.product(root));
    }
}
