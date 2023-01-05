package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeOperations {
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree= new BinaryTree();

        //Creation of Binary Tree
        Node root = tree.buildTree(nodes);
        //System.out.println(root.data);

        //Preorder traversing of Binary tree
        preorder(root);
        System.out.println();
        //Inorder traversing of Binary tree
        inorder(root);
        System.out.println();

        //Postorder traversing of Binary tree
        postorder(root);
        System.out.println();


        //Level order traversing of Binary tree
        levelorder(root);
        System.out.println();


        //Count nodes
        System.out.println("Total nodes in tree are: "+countNodes(root));
        System.out.println();

        //Sum nodes
        System.out.println("Total sum of nodes : "+ sumNodes(root));
        System.out.println();

        //Hight of tree
        System.out.println("Height of tree : "+heightTree(root));
        System.out.println();

        //Diameter O(n^2)
        System.out.println("Diameter of Binary Tree is : "+diameter(root));

        //Diameter O(n)
        System.out.println("Diameter : "+diameter2(root).diameter);
    }

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{

        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx]== -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;

        }
    }
    public static void preorder(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data+" ");
        postorder(root.left);
        postorder(root.right);
    }

    public static void inorder(Node root){
        if (root == null){
            return;
        }
        preorder(root.left);
        System.out.print(root.data+" ");
        preorder(root.right);
    }

    public static void postorder(Node root){
        if (root == null){
            return;
        }
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data+" ");

    }

    public static void levelorder(Node root){
        //base case
        if (root == null){
            return;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){
            Node currntNode = queue.remove();
            if (currntNode == null){
                System.out.println();
                if (queue.isEmpty()){
                    break;
                } else {
                    queue.add(null);
                }
            } else {
                System.out.print(currntNode.data+" ");
                if (currntNode.left !=null){
                    queue.add(currntNode.left);
                }
                if (currntNode.right != null){
                    queue.add(currntNode.right);
                }
            }

        }
    }

    public static int countNodes(Node root){
        if (root==null){
            return 0;
        }
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);
        return leftNodes+rightNodes+1;

    }

    public static int sumNodes(Node root){
        if (root==null){
            return 0;
        }
        int leftNodes = sumNodes(root.left);
        int rightNodes = sumNodes(root.right);
        return leftNodes+rightNodes+root.data;

    }
    public static int heightTree(Node root){
        if (root == null){
            return 0;
        }
        int leftHeight = heightTree(root.left);
        int rightHeight = heightTree(root.right);

//        if (leftHeight<rightHeight){
//            return rightHeight+1;
//        } else {
//            return leftHeight+1;
//        }
        int myHeight = Math.max(leftHeight, rightHeight) +1;
        return myHeight;
    }

    public static int diameter(Node root){
        if (root == null){
            return 0;
        }
        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);
        int dia = heightTree(root.left)+heightTree(root.right)+1;
        return Math.max(dia, Math.max(dia1, dia2));
    }

    public static class TreeInfo{
        int height;
        int diameter;
        TreeInfo(int height, int diameter){
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static TreeInfo diameter2(Node root){
        if (root == null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);
        int myHeight = Math.max(left.height, right.height)+1;

        int diaLeft = left.diameter;
        int diaRight = right.diameter;
        int dia = left.height+ right.height + 1;

        int myDiameter= Math.max(dia, Math.max(diaLeft, diaRight));

        TreeInfo myInfo = new TreeInfo(myHeight, myDiameter);
        return myInfo;
    }
}