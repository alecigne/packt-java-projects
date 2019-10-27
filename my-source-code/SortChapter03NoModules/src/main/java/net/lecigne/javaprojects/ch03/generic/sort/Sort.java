package net.lecigne.javaprojects.ch03.generic.sort;

import java.util.Comparator;

import net.lecigne.javaprojects.ch03.generic.sortable.Sortable;
import net.lecigne.javaprojects.ch03.generic.sorttools.Swapper;

public interface Sort<E> {

    void sort(Sortable<E> collection);

    void setSwapper(Swapper swapper);

    void setComparator(Comparator<E> comparator);

}
