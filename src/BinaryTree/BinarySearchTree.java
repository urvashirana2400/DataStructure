package BinaryTree;

public class BinarySearchTree {
    private Node root;
    private class Node{
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node inserData(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data< root.data){
            root.left=inserData(root.left,data);
        }
        if(data> root.data){
            root.right=inserData(root.right,data);
        }
        return root;
    }
    public void insert(int data){
        root=inserData(root,data);
    }


    public int sumOfLeftLeaves(Node root){
        if(root==null){
            return 0;
        }
        int sum=0;
        if(root.left!=null ){
            if(isLeaf(root.left)) {sum+=root.left.data;}
            else {
                sum+=sumOfLeftLeaves(root.left);
            }
        }
        sum+=sumOfLeftLeaves(root.right);
        return  sum;
    }
    public boolean isLeaf(Node node){
        return node.left==null || node.right==null;
    }
    public void printKDistance(Node node,int k){
        if(node==null || k<0){
            return;
        }
        else if(k==0){
            System.out.println("distance from k:"+root.data);
            return;
        }
        printKDistance(root.left,k-1);
        printKDistance(root.right,k-1);


    }


    public void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data );
        inOrder(root.right);
    }

    public Node search(Node root,int key){
        if(root==null || root.data==key){
            return root;
        }
        if(key<root.data){
            return search(root.left,key);
        }
        else {
            return search(root.right,key);
        }
    }

    public boolean isValid(Node root,int min,int max){
        if(root==null){
            return true;
        }
        if(root.data<=min || root.data>=max){
            return false;
        }
        boolean left =isValid(root.left,min,root.data);
        if(left){
            boolean right=isValid(root.right,root.data,max);
            return right;
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.insert(12);
        bst.insert(5);
        bst.insert(56);
        bst.insert(67);
        bst.insert(34);
        bst.insert(23);
        bst.insert(10);
        System.out.println("inorder:");
        bst.inOrder(bst.root);
        System.out.println("search key:");
        if(null != bst.search(bst.root,67)){
            System.out.println("key found");
        }
        System.out.println("Binasry tree valid?: "+bst.isValid( bst.root,Integer.MIN_VALUE,Integer.MAX_VALUE));
        System.out.println("sum of leaves:"+bst.sumOfLeftLeaves(bst.root));
        bst.printKDistance(bst.root, 4);
    }

}
