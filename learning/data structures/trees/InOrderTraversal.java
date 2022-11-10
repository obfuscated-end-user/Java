public class InOrderTraversal {
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

        System.out.println("In Order traversal");
        tree.inOrder(tree.root);
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

    // uses recursion. not taught before this.
    void inOrder(Node node) {
        if (node == null)
            return;

        // traverse the left child
        inOrder(node.left);
        // traverse the root node
        System.out.print(node.item + "->");
        // traverse the right child
        inOrder(node.right);
    }
}