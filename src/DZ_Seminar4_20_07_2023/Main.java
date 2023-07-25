package DZ_Seminar4_20_07_2023;

public class Main {
    public static void main(String[] args) {

        RedBlackTree<Integer> tree = new RedBlackTree<>();

        tree.add(5);
        tree.add(7);
        tree.add(10);
        tree.add(3);
        tree.add(6);
        tree.add(20);
        tree.add(25);
        tree.add(35);
        tree.add(45);
        tree.add(55);
        tree.add(1);
        tree.add(2);
        tree.add(4);
        tree.add(30);
        tree.add(31);

        tree.remove(55);


        tree.print();
    }
}
