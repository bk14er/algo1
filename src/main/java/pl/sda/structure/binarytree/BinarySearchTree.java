package pl.sda.structure.binarytree;


public class BinarySearchTree {

    private TreeNode root;

    /**
     * Metoda odpowiedzialna za dodanie elementu do drzewa.
     */
    public void add(int value) {
        //TODO
    }

    public TreeNode add(int value, TreeNode node) {
       return null;
    }

    public int find(int value) {
        return find(root, value);
    }

    private int find(TreeNode node, int value) {

        //Warunek brzegowy
        if (node == null) {
            System.out.println("Nie odnaleziono wartości: " + value);
            return -1;
        }

        //Znalezliśmy
        if (node.value == value) {
            System.out.println("Odnaleziono wartości: " + value);
            return value;
        }

        if (value < node.value) {
            System.out.println("Szukam w lewej gałęzi: " + value);
            //TODO rekurencyjnie wywołaj metodę find z odpowiednimi parametrami
        }

        System.out.println("Szukam w prawej gałęzi: " + value);
        //TODO rekurencyjnie wywołaj metodę find z odpowiednimi parametrami
        return -1;
    }


    /**
     * Znajdz najmniejszą wartość w drzewie
     *
     * @return - najmniejszą wartość w drzewie
     */
    public int findSmallestValue() {
        return findSmallestValue(root);
    }

    /**
     * Algorytmy:
     * <p>
     * Jeśli root.left == null - to znaczy że jesteśmy już na liściu - czyli znależliśmy element minimalny
     * w przeciwnym razie schodzimy rekurencyjnie niżej tj. findSmallestValue(root.left);
     */
    private int findSmallestValue(TreeNode root) {
        //TODO
        return -1;
    }


    public TreeNode delete(int toDelete) {
        return delete(root, toDelete);
    }

    /**
     * @param node     - na samym początku zaczynamy od root
     * @param toDelete - element do usunięcia
     * @return wartośc z usuniętym nodem
     * <p>
     * <p>
     */
    private TreeNode delete(TreeNode node, int toDelete) {

        if (node == null) {
            System.out.println("Nie usuwam - nie odnaleziono noda");
            return null;
        }

        /**
         * Kiedy znajdziemy noda do usunięcia , mamy 3 warunki:
         * 1.Węzeł nie ma potomstwa – to najprostsza sytuacja; musimy tylko zastąpić ten węzeł wartością NULL w jego węźle nadrzędnym
         * 2.Węzeł ma dokładnie jedno dziecko - w węźle nadrzędnym(rodzicem) zastępujemy ten węzeł jego jedynym potomkiem.
         * 3.Węzeł ma dwoje dzieci - jest to najbardziej złożony przypadek, ponieważ wymaga reorganizacji drzewa
         */
        //Znalezliśmy noda do usunięcia
        if (node.value == toDelete) {

            //Nie ma potomków
            //TODO

            //Ma jednego potomka - node.right
            //TODO

            //Ma jednego potmka - node.left
            //TODO

            // Ma 2 potomków -  najtrudniejszy przypadek:
            //znajdz najmniejszego potomka w prawym dziecku findSmallestValue(node.right)
            throw new RuntimeException("TODO");
        }

        // Szukamy noda do usunięcia:

        return node;
    }


    //IN ORDER left ROOT right
    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(TreeNode node) {
        //TODO
    }

    //PREORDER ROOT LEFT RIGHT
    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(TreeNode node) {
        //TODO
    }

    //POST ORDER LEFT -> RIGHT-> ROOT
    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(TreeNode node) {
        //TODO
    }

}
