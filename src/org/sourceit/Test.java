package org.sourceit;

import java.util.*;

public class Test {

    public static <T extends Number> T onlyOne(T first, T second) {
//        return (T) (first.longValue() + second.longValue());

        if (first.longValue() < second.longValue()) {
            return first;
        }

        return second;
    }

    public static <T> T string(T first) {
//        return (T) (first.longValue() + second.longValue());

        System.out.println("[" + first + "]");
        return first;
    }

    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>();

        strings.add("z");
        strings.add("b");
        strings.add("g");

        for (String s : strings) {
            System.out.println(s);
        }

        List<String> list = new ArrayList<>();

        list.add("z");
        list.add("b");
        list.add("g");

        Collections.sort(list, new ReverseComparator<>());

        System.out.println();

        for (String s : list) {
            System.out.println(s);
        }

        Test.onlyOne(3, 6);
        Test.onlyOne(3L, 56L);

        Test.<String>string("sdd");
        Test.<Integer>string(34);
        Test.<Class>string(Object.class);


    }

}

class ReverseComparator<T> implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        if (o1.compareTo(o2) < 0) {
            return 1;
        }

        if (o1.compareTo(o2) > 0) {
            return -1;
        }

        return 0;

    }
}
