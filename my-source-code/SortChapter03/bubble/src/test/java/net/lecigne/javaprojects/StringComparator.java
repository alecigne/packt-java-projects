package net.lecigne.javaprojects;

import java.util.Comparator;

public class StringComparator implements Comparator {

    @Override
    public int compare(Object first, Object second) {
        String firstString = (String) first;
        String secondString = (String) second;
        return firstString.compareTo(secondString);
    }

}
