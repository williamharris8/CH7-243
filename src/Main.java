public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> archive = build(50, 25, 75, 10, 30, 60, 85);
        System.out.println("Archive initialized with sample IDs.");

        report("Sample Archive", archive);
        report("Empty Tree", build());
        report("Single-Node Tree", build(42));
        report("Skewed Tree", build(10, 20, 30, 40));
    }

    static BinarySearchTree<Integer> build(int... ids) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        for (int id : ids) tree.add(id);
        return tree;
    }

    static void report(String label, BinarySearchTree<Integer> tree) {
        System.out.println("\n" + label);
        System.out.println("Height: " + tree.height());
        System.out.print("Inorder: ");
        tree.inOrderTraversal();
        System.out.print("Preorder: ");
        tree.preOrderTraversal();
    }
}
