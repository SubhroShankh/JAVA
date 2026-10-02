import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.size());

        // print arralist
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // -------------------------------------------------------------

        // // ClassName objectName = new ClassName();
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // // add operation => O(1)
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // list.add(1, 9);// O(n)

        // System.out.println(list);

        // // // get operation
        // // int element = list.get(2);
        // // System.out.println(element);

        // // // delete
        // // list.remove(2);
        // // System.out.println(list);

        // // // set
        // // list.set(2, 10);
        // // System.out.println(list);

        // // contains
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));
    }
}
