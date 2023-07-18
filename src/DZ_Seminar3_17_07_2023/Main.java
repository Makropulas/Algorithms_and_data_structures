package DZ_Seminar3_17_07_2023;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.reverse();
        System.out.println(list);
    }
}
