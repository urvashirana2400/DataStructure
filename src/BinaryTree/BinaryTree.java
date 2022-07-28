package BinaryTree;

import Queue.QueueImplementation;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private Node root;
    private class Node{
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree(){
        Node first=new Node(12);
        Node second=new Node(3);
        Node third=new Node(23);
        Node fourth=new Node(1);
        Node fifth=new Node(5);

        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;
    }
    public void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data );
        inOrder(root.right);
    }
    public void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    public void leverOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Node temp=queue.poll();
            System.out.println(temp.data);
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
        }
    }
    public int findMaxvalue(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int result=root.data;
        int left=findMaxvalue(root.left);
        int right=findMaxvalue(root.right);
        if(left>result){
            result=left;
        }
        if(right>result){
            result=right;
        }
        return result;
    }
    public int findMinvalue(Node root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int result=root.data;
        int left=findMinvalue(root.left);
        int right=findMinvalue(root.right);
        if(left<result){
            result=left;
        }
        if(right<result){
            result=right;
        }
        return result;
    }
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.createBinaryTree();
        System.out.println("preOrder:");
        bt.preOrder(bt.root);
        System.out.println("InOrder:");
        bt.inOrder(bt.root);
        System.out.println("postOrder:");
        bt.postOrder(bt.root);
        System.out.println("LevelOrder:");
        bt.leverOrder(bt.root);
        System.out.println("Max Value:"+bt.findMaxvalue(bt.root));
        System.out.println("Min Value:"+bt.findMinvalue(bt.root));
    }
}
