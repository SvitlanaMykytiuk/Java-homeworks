package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainExample {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");

        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        arrayList.set(1, arrayList.get(1));
        arrayList.remove(2);

        for (int i = 0; i < arrayList.size(); i++) {
            linkedList.add(arrayList.get(i));
        }
    }
}
