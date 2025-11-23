package Tree;
import java.util.*;

public class BinaryTree {
    static  class Node{
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BTree{
        static int idx=-1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
//      preorder traversal root->left->right
    public static void preoreder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preoreder(root.left);
        preoreder(root.right);
    }
//    Inorder traversal left->root->right
    public static void inorder(Node root){
        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
//    postorder traversal left->right->root
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
//    level order traversal (print level wise)
    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node currentNode = q.remove();
            if(currentNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }else{
                System.out.print(currentNode.data);
                if(currentNode.left != null){
                    q.add(currentNode.left);
                }
                if(currentNode.right != null){
                    q.add(currentNode.right);
                }
            }
        }
    }
//    Count number of nodes
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return left+right+1;
    }

//    sum of nodes
    public static int sumNodes(Node root){
        if(root == null){
            return 0;
        }
        int left = sumNodes(root.left);
        int right = sumNodes(root.right);
        return left+right+root.data;
    }
//    height of tree
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        int finalHeight = Math.max(left,right)+1;
        return finalHeight;
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BTree tree = new BTree();
        Node root = tree.buildTree(nodes);
        System.out.println("root = "+root.data);
        System.out.println("Pre-order");
        preoreder(root);
        System.out.println("\nIn-order");
        inorder(root);
        System.out.println("\nPost-order");
        postorder(root);
        System.out.println("\nLevel-order");
        levelOrder(root);
        System.out.println("Count of nodes = "+countNodes(root));
        System.out.println("Sum of nodes = "+sumNodes(root));
        System.out.println("Height of tree = "+height(root));
    }
}
