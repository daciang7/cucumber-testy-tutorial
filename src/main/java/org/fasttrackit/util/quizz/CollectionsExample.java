package org.fasttrackit.util.quizz;

import java.util.ArrayList;
import java.util.List;

/**
 * @author flo
 * @since 24/12/2016.
 */
public class CollectionsExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jon");
        list.add("Mary");
        // this will not compile. One can add only Strings in "list" due to the <String> modifier
//        list.add(1);
//        list.add(new Car(4));
        for(Object element : list) {
            System.out.println(element);
        }
//        int i = (int) list.get(2);
    }
}
