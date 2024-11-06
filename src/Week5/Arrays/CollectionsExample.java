package Week5.Arrays;

import java.util.ArrayList;

public class CollectionsExample {
    public static void main(String[] args) {

        // Defining an arrayList
        // The datatype given to the arrayList cannot be primitive eg: int, double
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();


        // To add data into an arrayList
        list1.add(5);
        list1.add(3);
        list1.add(1);

        // To remove give the index that is needed to be deleted
        list1.remove(1);
        list1.add(2);

        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");

        // No need toString method because arrayList is a class
        System.out.println(list1);
        System.out.println(list2);

        try {
            list2.add(1,"Z");
            System.out.println(list2);

            System.out.println("Index of B: " + list2.indexOf("B"));


            list1.set(2,8);
            System.out.println(list1.get(2));
            System.out.println(list1.get(0));
            System.out.println(list1.get(1));

            list1.set(3,6); // Index out of bounds as it's above the size of the arrayList
        } catch (IndexOutOfBoundsException exception){
            System.out.println("Index out of bounds");
        }

        // Instead of length we use size method in arrayList
        for (int i = 0; i< list2.size(); i++){
            System.out.println(i);
        }
    // ArrayList Methods

    }

}
