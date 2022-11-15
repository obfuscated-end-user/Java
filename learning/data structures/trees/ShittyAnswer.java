public class ShittyAnswer {

    public static void main(String[] args) {
        // create an object of Tree
        Tree tree = new Tree();
        
        // create nodes of tree
        tree.root = new Node(50);
        tree.root.left = new Node(40);
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(37);
        tree.root.left.left.left = new Node(25);
        tree.root.left.left.left.left = new Node(33);
        tree.root.left.right = new Node(45);
        tree.root.left.right.right = new Node(49);
        tree.root.right.left = new Node(55);
        tree.root.right.left.left = new Node(54);
        tree.root.right.left.right = new Node(58);
        tree.root.right.right = new Node(70);
        tree.root.right.right.left = new Node(67);
        
        System.out.println("Post-Order traversal");
        tree.postorder(tree.root);
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
    
    void postorder(Node node) {
        if (node == null)
        return;
        
        // Traverse left
        postorder(node.left);
        // Traverse right
        postorder(node.right);
        // Traverse root
        System.out.print(node.item + "->");
    }
}