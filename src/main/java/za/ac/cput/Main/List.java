package za.ac.cput.Main;

/**
 * Gaynor Jantjies
 * Student Number: 213069555
 *
 * Collection -- List Interface
 */
 import java.util.*;

public class List {

    int size;
    private ArrayList <LinkedList<Element>> array;

    public List(){
    this.size = 0;
    this.array = new ArrayList<LinkedList<Element>>(128);

    for (int i = 0; i < 128; i++) {
            this.array.add(new LinkedList<Element>());
        }
    }
    public boolean isEmpty() {
        return size() == 0;

    }

    private int size() {
        return size;
    }

    public static void main(String[] args) {

        //list that stores employee names

        ArrayList<String> names = new ArrayList<String>();

        //list that will store any objects

        ArrayList surname = new ArrayList();

        //add to list

        names.add("Matthew");
        names.add("Joan");

        surname.add("Smith");
        surname.add("Jonkers");

        System.out.println("Names are " + names);
        System.out.println("Surname are " + surname);

        for (String a : args)
            names.add(a);
        Collections.shuffle(names, new Random());
        System.out.println(names);
    }
}
