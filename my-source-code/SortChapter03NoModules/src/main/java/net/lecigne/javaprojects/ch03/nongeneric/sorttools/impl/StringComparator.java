package net.lecigne.javaprojects.ch03.nongeneric.sorttools.impl;

import java.util.Comparator;

public class StringComparator implements Comparator {

    @Override
    public int compare(Object i, Object j) {
        String first = (String) i;
        String second = (String) j;
        return first.compareTo(second);
    }

}
