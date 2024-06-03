

public class Analyzer {

    public <T> int gibTiefe(BinaryTree<T> binaryTree) {
        if (null == binaryTree || binaryTree.isEmpty())
            return -1;
        int l, r;
        if (!binaryTree.isEmpty()) {
            l = gibTiefe(binaryTree.getLeftTree());
            r = gibTiefe(binaryTree.getRightTree());
            if (l > r) {
                return 1 + l;
            } else {
                return 1 + r;
            }
        } else {
            return 0;
        }
    }

    public <T> int gibGesamtKnotenAnzahl(BinaryTree<T> binaryTree) {
        if (null == binaryTree || binaryTree.isEmpty())
            return 0;
        return 1 + gibGesamtKnotenAnzahl(binaryTree.getLeftTree()) + gibGesamtKnotenAnzahl(binaryTree.getRightTree());
    }


    public static void main(String[] args) {
        Analyzer analyzer = new Analyzer();
        BinaryTree<Integer> binaryTree = new BinaryTree<Integer>(0, new BinaryTree<Integer>(1, new BinaryTree<Integer>(3), new BinaryTree<Integer>(5)), new BinaryTree<Integer>(2, new BinaryTree<Integer>(4), new BinaryTree<Integer>(6)));
        System.out.println("Tiefe => " + analyzer.gibTiefe(binaryTree));
        System.out.println(analyzer.gibGesamtKnotenAnzahl(binaryTree));

    }
}