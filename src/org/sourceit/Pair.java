package org.sourceit;

import java.util.ArrayList;
import java.util.List;

public class Pair<T, V extends Number> {

    private T first;
    private V second;

    public Pair() {

    }

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public static void main(String[] args) {
//        Pair<String, String> pair = new Pair<String, String>("Oleg", "Shestakov");

//        String name = pair.first;
//        String surname = pair.second;

//        System.out.println(name + " " + surname);

        Pair<Integer, Double> pair1 = new Pair<Integer, Double>();

        SpecialPair<String, Double> pair = new SpecialPair<>();
//        pair.


        pair1.setFirst(24);
        pair1.setSecond(Math.PI);

        System.out.println(pair1.getFirst() + " " + pair1.getSecond());

        Pair<Double, Double> doubleDoublePair = new Pair<Double, Double>();

        doubleDoublePair.setFirst(new Double(Math.PI));


        List<Integer> integers = new ArrayList();

        integers.add(34);


//        Trident<String, Integer, String> trident = new Trident<>("Oleg", 24, "Shestakov");

//        Function<Function<String, Void>, Void> function = (name) -> {
//            System.out.println(name);
//            return null;
//        };




//        List<? extends Number>  integer = new ArrayList<>();

//        Integer number = new Integer(5);

//        integer.add();


//        List list = new ArrayList<>();


//        List<?> list = new ArrayList<>();

//        list.add(56);
//        list.add(34);
//        list.add(78);
//
//        Integer integer = 0;
//
//        for(Object o : list) {
//            integer += (Integer) o;
//        }

//        System.out.println(integer);

//        trident.
        // string string pair
        // integer string pair
        // double double pair
    }
}


class SpecialPair2<T extends Integer, V extends Double> extends Pair<T, V> {}

class SpecialPair<T, V extends Double> extends Pair<T, V> {
    public SpecialPair() {
        super();
    }

    public SpecialPair(T first, V second) {
        super(first, second);
    }

    @Override
    public T getFirst() {
        return super.getFirst();
    }

    @Override
    public void setFirst(T first) {
        super.setFirst(first);
    }

    @Override
    public V getSecond() {
        return super.getSecond();
    }

    @Override
    public void setSecond(V second) {
        super.setSecond(second);
    }
}

class Trident<T extends Integer, V extends Double, K> extends Pair<T, V> {

    private K third;

    public Trident() {
        super();
    }

    public Trident(T first, V second, K third) {
        super(first, second);
        this.third = third;
    }

    @Override
    public T getFirst() {
        return super.getFirst();
    }

    @Override
    public void setFirst(T first) {
        super.setFirst(first);
    }

    @Override
    public V getSecond() {
        return super.getSecond();
    }

    @Override
    public void setSecond(V second) {
        super.setSecond(second);
    }
}
