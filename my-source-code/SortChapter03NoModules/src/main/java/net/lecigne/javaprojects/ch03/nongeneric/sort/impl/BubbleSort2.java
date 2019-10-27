package net.lecigne.javaprojects.ch03.nongeneric.sort.impl;

import java.util.Comparator;

import net.lecigne.javaprojects.ch03.nongeneric.sort.Sort;
import net.lecigne.javaprojects.ch03.nongeneric.sort.exception.NonStringElementInCollection;
import net.lecigne.javaprojects.ch03.nongeneric.sortable.Sortable;
import net.lecigne.javaprojects.ch03.nongeneric.sorttools.Swapper;

public class BubbleSort2 implements Sort {

    private Swapper swapper;
    
    private Comparator comparator;
    
    @Override
    public void sort(Sortable collection) {
        // Get the last comparison index (penultimate element)
        var lastIndex = collection.size() - 2;
        while (lastIndex >= 0) {
            for (int index = 0; index <= lastIndex; index++) {
                try {
                    if (comparator.compare(collection.get(index),
                            collection.get(index + 1)) > 0) {
                        swapper.swap(index, index + 1);
                    }
                } catch (ClassCastException e) {
                    throw new NonStringElementInCollection("Ooops", e);
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
    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }

}
