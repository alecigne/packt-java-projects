package net.lecigne.javaprojects.ch03.nongeneric.sort;

import java.util.Comparator;

import net.lecigne.javaprojects.ch03.nongeneric.sortable.Sortable;
import net.lecigne.javaprojects.ch03.nongeneric.sorttools.Swapper;

public interface Sort {

    void sort(Sortable collection);

    void setSwapper(Swapper swapper);

    void setComparator(Comparator comparator);
}
