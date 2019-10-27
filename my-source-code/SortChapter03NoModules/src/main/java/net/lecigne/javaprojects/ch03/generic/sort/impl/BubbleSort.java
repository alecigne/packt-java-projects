package net.lecigne.javaprojects.ch03.generic.sort.impl;

import java.util.Comparator;

import net.lecigne.javaprojects.ch03.generic.sort.Sort;
import net.lecigne.javaprojects.ch03.generic.sortable.Sortable;
import net.lecigne.javaprojects.ch03.generic.sorttools.Swapper;

public class BubbleSort<E> implements Sort<E> {

    private Swapper swapper;
    
    private Comparator<E> comparator;
    
    @Override
    public void sort(Sortable<E> collection) {
        // Get the last comparison index (penultimate element)
        var lastIndex = collection.size() - 2;
        while (lastIndex >= 0) {
            for (int index = 0; index <= lastIndex; index++) {
                if (comparator.compare(collection.get(index),
                        collection.get(index + 1)) > 0) {
                    swapper.swap(index, index + 1);
                }
            }
            lastIndex--;
        }
    }

    @Override
    public void setSwapper(Swapper swapper) {
        this.swapper = swapper;
        
    }

    @Override
    public void setComparator(Comparator<E> comparator) {
        this.comparator = comparator;
    }

}
