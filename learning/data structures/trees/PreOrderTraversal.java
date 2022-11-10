public class PreOrderTraversal {
    public static void main(String[] args) {
        // create an object of Tree
        Tree tree = new Tree();
        
        // create nodes of tree
        tree.root = new Node(10);
        tree.root.left = new Node(30);
        tree.root.right = new Node(90);
        
        // create child nodes of left child
        tree.root.left.left = new Node(50);
        tree.root.left.right = new Node(16);
        
        // create child nodes of right child
        tree.root.right.left = new Node(67);
        tree.root.right.right = new Node(100);
        
        System.out.println("In Pre-Order traversal");
        tree.preorder(tree.root);
    }
}
    
class Node {
    int item;
    Node left, right;
    
    public Node(int key) {
        item = key;
        left = right = null;
    }
}
    
class Tree {
    // root of Tree
    Node root;
    
    Tree() {
        root = null;
    }
    
    void preorder(Node node) {
        if (node == null)
            return;
        
        // Traverse root
        System.out.print(node.item + "->");
        // Traverse left
        preorder(node.left);
        // Traverse right
        preorder(node.right);
    }
}