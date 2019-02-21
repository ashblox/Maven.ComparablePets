package io.zipcoder;


import java.util.Comparator;

public class PetComparator<T extends Pet> implements Comparator<T> {

    public int compare(T p1, T p2) {

        return p1.getClass().getSimpleName().compareTo(p2.getClass().getSimpleName());
    }
}
